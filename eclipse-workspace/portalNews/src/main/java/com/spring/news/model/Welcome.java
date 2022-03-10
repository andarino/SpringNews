// Welcome7.java

package com.spring.news.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;

@Generated("jsonschema2pojo")
public class Welcome {
	@JsonProperty
    private Pagination pagination;
	
	@JsonProperty
    private Datum[] data;

    @JsonProperty
    public Pagination getPagination() { return pagination; }
    
    public void setPagination(Pagination value) { this.pagination = value; }

    public Datum[] getData() { 
    	return data; 
    	}
    public void setData(Datum[] value) { this.data = value; }
}