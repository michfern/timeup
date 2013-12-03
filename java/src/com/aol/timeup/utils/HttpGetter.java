package com.aol.timeup.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpGetter {

    public String getData(String urlToFetch) throws IOException {

    	String response ="";
    	try {
    	    URL url = new URL(urlToFetch);
    	    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
    	    String line;

    	    while ((line = reader.readLine()) != null) {
    	        response +=line;
    	    }
    	    reader.close();

    	} catch (MalformedURLException e) {
    	    // ...
    	} catch (IOException e) {
    	    // ...
    	}
    
    	return response;
    }
    
    public static void main(String[] args) throws Exception {
    	
    	HttpGetter getter = new HttpGetter();
    	getter.getData("https://api.huffingtonpost.com/v1/?t=most_popular_widget&i=24h&viral_sort=1");
    	
    }
}