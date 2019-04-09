package com.zeeshan.view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.springframework.web.servlet.view.document.AbstractExcelView;

@SuppressWarnings("unchecked")
public class StudentExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		List<String> list = (ArrayList<String>) model.get("stList");

		Sheet sheet = workbook.createSheet("Student-Name");

		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("SNO.");
		headerRow.createCell(1).setCellValue("STUDENT_NAME");

		if (!list.isEmpty()) {
			int rowIndex = 1;
			for (String s : list) {
				Row dataRow = sheet.createRow(rowIndex);
				dataRow.createCell(0).setCellValue(rowIndex);
				dataRow.createCell(1).setCellValue(s);
				rowIndex++;
			}

		}
	}

}
