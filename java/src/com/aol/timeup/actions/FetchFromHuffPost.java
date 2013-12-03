package com.aol.timeup.actions;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import com.aol.timeup.model.NewsEntry;
import com.aol.timeup.utils.HttpGetter;

public class FetchFromHuffPost {

	static String URL_TO_FETCH_ALL_ENTRIES = "https://api.huffingtonpost.com/v1/?t=most_popular_widget&i=24h&viral_sort=1";
	static String URL_TO_FETCH_ENTRY_PREFIX="https://api.huffingtonpost.com/v1/?t=entry&ftext=1&entry_ids=";
	
	 
	public FetchFromHuffPost(){
		
		
	}
	
	/*
	 * Will fetch most popular entries from 
	 */
	public List<NewsEntry> fetchAndSummarize() throws Exception {
		List<NewsEntry> entries = new ArrayList<>();
		
		//Step 1 Hit API to get data
    	HttpGetter getter = new HttpGetter();
    	String data = getter.getData(URL_TO_FETCH_ALL_ENTRIES);

    	//Step 2 Parse response JSON to get ids from it.
    	
		Object responseJson = JSONValue.parse(data);
        //Get the Results object
        JSONArray resultsJson = new JSONArray();

        resultsJson = (JSONArray) responseJson.get("entries");
      //now grab the specific data from each element in the array
        JSONObject jsonObj;
        for (int i = 0; i < resultsJson.size(); i++) {
            jsonObj = (JSONObject) resultsJson.get(i);
            String entryId= (String) jsonObj.get("entry_id");
        
            //Step 3 get the entry for each id
            String htmpEntryData = getter.getData(URL_TO_FETCH_ENTRY_PREFIX+entryId); 

            //Step 4 Parse and create the NewsEntry object
            Map entryData = (Map) JSONValue.parse(htmpEntryData);
            entryData = (Map) responseJson.get("response");
            
            String entryTitle = (String)entryData.get("entry_title");
            String entryBody = (String)entryData.get("entry_text");
            
            NewsEntry newsEntry = new NewsEntry();
            newsEntry.setSourceEntryId(entryId);
            newsEntry.setTitle(entryTitle);
            newsEntry.setBody(entryBody);
            
            
            //Step 4 summarize it
            Summarize summarizer = new Summarize(entryTitle, entryBody);
            String summary = summarizer.getSummary();
            
            newsEntry.setSummary(summary);
            
            //Add them to the entries list
            entries.add(newsEntry);
        }

        
		return entries;
		
	}
	
	public static void main(String[] args) throws Exception {
		FetchFromHuffPost fetchFromHuffPost = new FetchFromHuffPost();
		List<NewsEntry> list = new ArrayList<NewsEntry>();
		list = fetchFromHuffPost.fetchAndSummarize();
		
	}
	
	
}
