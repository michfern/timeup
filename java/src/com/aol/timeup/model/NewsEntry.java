package com.aol.timeup.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class NewsEntry implements Serializable{

	@Id Long id;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	String sourceEntryId;	
	String title;
	String body;
	String summary;

	public String getSourceEntryId() {
		return sourceEntryId;
	}

	public void setSourceEntryId(String sourceEntryId) {
		this.sourceEntryId = sourceEntryId;
	}

	public NewsEntry(){
		
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	
}
