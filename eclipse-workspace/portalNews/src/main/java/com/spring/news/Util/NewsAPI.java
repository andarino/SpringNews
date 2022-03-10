package com.spring.news.Util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.spring.news.model.Datum;
import com.spring.news.model.Welcome;

public class NewsAPI {
	//
	//
	public static List<Datum> ConnectAPI(){
		
		String url = "http://api.mediastack.com/v1/news?access_key=cbb230d3d6f8d97531bc50694e7204f7&sources=cnn,bbc";
	
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
	    ResponseEntity<Datum> response = restTemplate.exchange(
	            url,
	            HttpMethod.GET,
	            request,
	            Datum.class,
	            1
	    );
	    
	    List<Datum> qtdresultados = new ArrayList();
	    
	    Datum[] listaData = new Datum[qtdresultados.size()];
	    
	    for(int i =0; i < qtdresultados.size(); i++) {
	    	System.out.println("\n");
	    	//System.out.println(qtdresultados.get(i).getTitle());
	    	System.out.println("\n");
	    	//listaData.add(response.getBody().getData());
	    }
	    
	    return qtdresultados;
	}

}
