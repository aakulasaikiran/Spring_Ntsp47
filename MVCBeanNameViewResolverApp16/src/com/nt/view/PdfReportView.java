package com.nt.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class PdfReportView extends AbstractPdfView {
	
	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter writer, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<String>studData=null;
		//get Model Attribute
		studData=(List<String>)map.get("studDetails");
		//construct pdf doucment
				Paragraph p = new Paragraph("Student details");
				p.setAlignment("center");
				doc.add(p);
				
				Table t = new Table(1);
				t.addCell(studData.get(0)+" ");
				t.addCell(studData.get(1)+" ");
				t.addCell(studData.get(2)+" ");
				doc.add(t);
		
		
	}

}
