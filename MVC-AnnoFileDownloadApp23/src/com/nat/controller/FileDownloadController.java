package com.nat.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FileDownloadController {

	
	@RequestMapping(value = "/home.htm")
	public String displayForm() {
		return "file_download_form"; //returns the page name to ViewResolver ultimately
	}

	
	
	@RequestMapping(value = "/download.htm")
	public void  download(@RequestParam("file_name") String fileName,
			                                   HttpServletResponse response) {
		InputStream is=null;
		try {
	    	System.out.println("Requested File"+fileName+" response="+response);
	    	String filePath="E:/springfileuploads/"+fileName;
	      // get your file as InputStream
	      is=new FileInputStream(filePath);
	      
	      //Remove the below code,will dipatch the file in view mode like txt,bat file
		  response.setHeader("Content-Disposition", "attachment; filename="+fileName); 
		  
		  IOUtils.copy(is, response.getOutputStream());
	      response.flushBuffer();
	      
	    } catch (IOException ex) {
	      //log.info("Error writing file to output stream. Filename was '" + fileName + "'");
	      throw new RuntimeException("IOError writing file to output stream");
	    }
	}//methiod
}//class
