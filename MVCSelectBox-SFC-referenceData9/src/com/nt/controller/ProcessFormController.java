package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegisterCmd;

public class ProcessFormController extends SimpleFormController{
	
/*@Override
public  Map referenceData(HttpServletRequest request) throws Exception {
	List<String> crsList=null;
	Map<String,List<String>> map=null;
	//prepare courses
	crsList=new ArrayList<String>();
	crsList.add("java");crsList.add(".net"); crsList.add("oracle");
	//add to Map
	map=new HashMap<String,List<String>>();
	map.put("crsItems",crsList);
	return map;
}*/

@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
	
	 return new ModelAndView("result","regCmd",((RegisterCmd)command));
	}
	
}
