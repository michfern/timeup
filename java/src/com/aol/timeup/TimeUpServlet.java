package com.aol.timeup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.*;

import com.aol.timeup.actions.FetchFromHuffPost;
import com.aol.timeup.model.NewsEntry;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;


@SuppressWarnings("serial")
public class TimeUpServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		try {
			
			
			Objectify ofy = ObjectifyService.begin();			
	
			FetchFromHuffPost fetchFromHuffPost = new FetchFromHuffPost();
			List<NewsEntry> list = new ArrayList<NewsEntry>();
			list = fetchFromHuffPost.fetchAndSummarize();
			
			for(int i=0; i < list.size();i++){
				ofy.put(list.get(i));
			}
			
			
			resp.setContentType("text/plain");
			resp.getWriter().println("Added "+list.size()+" number of entries.");
		} catch(Exception ex){
			resp.setContentType("text/plain");
			resp.getWriter().println("Issuse seen while adding entries:"+ex.toString());
			
		}
		
	}
}
