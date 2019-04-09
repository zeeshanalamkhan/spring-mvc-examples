package com.zeeshan.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Table;
import com.lowagie.text.pdf.PdfWriter;
import com.zeeshan.dto.EmpDTO;

public class EmpPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {

		List<EmpDTO> listDTO = (List<EmpDTO>) model.get("allEmp");
		Paragraph p = new Paragraph("List All Employees");
		p.setAlignment("center");
		Table t = new Table(8);
		t.setAlignment("center");
		t.addCell("EMPNO");
		t.addCell("ENAME");
		t.addCell("JOB");
		t.addCell("MGR");
		t.addCell("HIREDATE");
		t.addCell("SAL");
		t.addCell("COMM");
		t.addCell("DEPTNO");

		if (!listDTO.isEmpty()) {

			for (EmpDTO dto : listDTO) {
				t.addCell(dto.getEmpNo() + " ");
				t.addCell(dto.getEname() + " ");
				t.addCell(dto.getJob() + " ");
				t.addCell(dto.getMgr() + " ");
				t.addCell(dto.getHireDate() + " ");
				t.addCell(dto.getSal() + " ");
				t.addCell(dto.getComm() + " ");
				t.addCell(dto.getDeptNo() + " ");
			}
		}
		document.add(p);
		document.addAuthor("ZEESHAN ALAM KHAN");
		document.add(t);
	}

}
