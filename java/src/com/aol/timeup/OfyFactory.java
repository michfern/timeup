package com.aol.timeup;

import javax.inject.Inject;
import javax.inject.Singleton;


import com.aol.timeup.model.NewsEntry;
import com.googlecode.objectify.ObjectifyFactory;

@Singleton
public class OfyFactory extends ObjectifyFactory
{

	/** Register our entity types*/
	public OfyFactory() {
		long time = System.currentTimeMillis();
		this.register(NewsEntry.class);
		long millis = System.currentTimeMillis() - time;
		
	}


	@Override
	public Ofy begin() {
		return new Ofy(this);
	}
}
