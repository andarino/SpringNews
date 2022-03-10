package com.spring.news.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.spring.news.Util.NewsAPI;
import com.spring.news.model.Datum;

@RestController
public class NewsController {

	NewsAPI newsAPI;
	@RequestMapping(value = "/index", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ModelAndView dataAPI() {
		ModelAndView mv = new ModelAndView("index");
		List<Datum> dados = NewsAPI.ConnectAPI();
		//passar o resultado para o model;
		  for(int i = 0; i < dados.size(); i++) {
		    	 System.out.println(dados.get(i).url);
		    	 System.out.println("\n");
	
		    	 }
		mv.addObject("obj", dados);
		mv.setViewName("index");
		return mv;
	}

}
