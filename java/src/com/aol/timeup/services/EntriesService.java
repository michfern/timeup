package com.aol.timeup.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aol.timeup.model.NewsEntry;
import com.google.gson.Gson;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyService;
import com.googlecode.objectify.Query;

@SuppressWarnings("serial")
public class EntriesService  extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		

		Objectify ofy = ObjectifyService.begin();

		Query<NewsEntry> q = ofy.query(NewsEntry.class);
		
		List<NewsEntry> list = new ArrayList<NewsEntry>();
		
		for(NewsEntry entry:q){
			NewsEntry newEntry = new NewsEntry();
			newEntry.setSourceEntryId(entry.getSourceEntryId());
			newEntry.setTitle(entry.getTitle());
			newEntry.setSummary(entry.getSummary());
			list.add(newEntry);
		}
		
//		NewsEntry newsEntry = new NewsEntry();
//		newsEntry.setTitle("Test Title");
//		newsEntry.setBody("Test Body");
//		newsEntry.setSummary("Test Summary");
		
		String json = new Gson().toJson(list);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		resp.getWriter().write(json);
	}
}