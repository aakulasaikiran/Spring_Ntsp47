package com.nt.batch.processor;

import org.springframework.batch.item.ItemProcessor;

/**
 * @author Anurag Kumar
 * @version 1.0
 *
 */
public class CustomItemProcessor implements ItemProcessor<String, String> {

	@Override
	public String process(String bookNameWithoutAuthor) throws Exception {
		System.out.println("process.....");
		
		String bookNameWithAuthor = "Book Name - "+bookNameWithoutAuthor+" | Author Name - ";
		
		if("Core Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Sriniwas";
		}else if("Design Patterns".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Natraz Design Patterns";
		}else if("Advance Java".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Natraz Adv. Java";
		}else if("Spring FrameWork".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Natraz Spring";
		}else if("Hibernate Framework".equalsIgnoreCase(bookNameWithoutAuthor)){
			bookNameWithAuthor += "Natraz Hibernate";
		}
		return bookNameWithAuthor;
	}

}
