package com.aol.timeup;

import java.io.IOException;
import javax.servlet.http.*;

import com.aol.timeup.model.NewsEntry;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;


@SuppressWarnings("serial")
public class TimeUpServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		ObjectifyService.register(NewsEntry.class);

		Objectify ofy = ObjectifyService.begin();
		
		NewsEntry newsEntry = new NewsEntry();
		newsEntry.setTitle("Test Title");
		newsEntry.setBody("Test Body");
		newsEntry.setSummary("Test Summary");
		
		ofy.put(newsEntry);

		
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
