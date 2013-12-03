package com.aol.timeup.services;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aol.timeup.model.NewsEntry;
import com.google.gson.Gson;

@SuppressWarnings("serial")
public class EntriesService  extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		
		NewsEntry newsEntry = new NewsEntry();
		newsEntry.setTitle("Test Title");
		newsEntry.setBody("Test Body");
		newsEntry.setSummary("Test Summary");
		
		String json = new Gson().toJson(newsEntry);
		
		resp.setContentType("application/json");
		resp.setCharacterEncoding("UTF-8");
		
		resp.getWriter().write(json);
	}
}