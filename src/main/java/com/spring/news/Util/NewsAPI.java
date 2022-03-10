package com.spring.news.Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.spring.news.model.Datum;
import com.spring.news.model.Root;

public class NewsAPI {
	//
	//
	public static List<Datum> ConnectAPIget(){
		System.out.println();
		String url = "http://api.mediastack.com/v1/news?access_key=cbb230d3d6f8d97531bc50694e7204f7&sources=en";
	
	    // create an instance of RestTemplate
	    RestTemplate restTemplate = new RestTemplate();
		
	 // create headers
	    HttpHeaders headers = new HttpHeaders();
	    
	    // set `Content-Type` and `Accept` headers
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
	    // build the request
	    HttpEntity request = new HttpEntity(headers);
	    
	    // make an HTTP GET request with headers
	    ResponseEntity<Root> response = restTemplate.exchange(
	            url,
	            HttpMethod.GET,
	            request,
	            Root.class,
	            1
	    );
	    
	    List<Datum> qtdresultados = new ArrayList(response.getBody().data);
	    
//	    System.out.println(qtdresultados.size());
	    
	    List<Datum> listaData = new ArrayList<>();
	    
	    int i;
	    for(i =0; i < qtdresultados.size(); i++) {
	    	listaData.add(response.getBody().data.get(i));
	    	System.out.println("\n");
	    }
	    
	    return listaData;
	}

	public static List<Datum> ConnectAPIPost(String q){
		String cc = "&keywords="+ q;
		String url = "http://api.mediastack.com/v1/news?access_key=cbb230d3d6f8d97531bc50694e7204f7&sources=en"+cc;
		System.out.println(url);
	    // create an instance of RestTemplate
	    RestTemplate restTemplate = new RestTemplate();
		
	 // create headers
	    HttpHeaders headers = new HttpHeaders();
	    
	    // set `Content-Type` and `Accept` headers
	    headers.setContentType(MediaType.APPLICATION_JSON);
	    headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		
	    // build the request
	    HttpEntity request = new HttpEntity(headers);
	    
	    // make an HTTP GET request with headers
	    ResponseEntity<Root> response = restTemplate.exchange(
	            url,
	            HttpMethod.GET,
	            request,
	            Root.class,
	            1
	    );
	    
	    List<Datum> qtdresultados = new ArrayList(response.getBody().data);
	    
//	    System.out.println(qtdresultados.size());
	    
	    List<Datum> listaData = new ArrayList<>();
	    
	    int i;
	    for(i =0; i < qtdresultados.size(); i++) {
	    	listaData.add(response.getBody().data.get(i));
	    	System.out.println("\n");
	    }
	    
	    return listaData;
	}
}
