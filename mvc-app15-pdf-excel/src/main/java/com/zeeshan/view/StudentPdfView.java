package com.zeeshan.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;

public class StudentPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<String> list = (ArrayList) model.get("stList");
		Paragraph p = new Paragraph("Student Details");
		p.setAlignment("center");
		document.add(p);
		Table t = new Table(2);
		t.setAlignment("center");
		t.addCell("SNO");
		t.addCell("STUDENT-NAME");
		if (!list.isEmpty()) {
			int rowIndex = 1;

			for (String s : list) {
				t.addCell(rowIndex + " ");
				t.addCell(s + " ");
				rowIndex++;
			}
		}

		document.add(p);
		document.add(t);
	}

}
