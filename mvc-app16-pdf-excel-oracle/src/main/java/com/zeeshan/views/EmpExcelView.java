package com.zeeshan.views;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.wp.usermodel.Paragraph;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.zeeshan.dto.EmpDTO;

public class EmpExcelView extends AbstractExcelView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, HSSFWorkbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		Sheet sheet = workbook.createSheet("List All Employees");

		Row headerRow = sheet.createRow(0);
		headerRow.createCell(0).setCellValue("LIST ALL EMPLOYEES");
		headerRow = sheet.createRow(2);
		headerRow.createCell(0).setCellValue("EMPNO");
		headerRow.createCell(1).setCellValue("ENAME");
		headerRow.createCell(2).setCellValue("JOB");
		headerRow.createCell(3).setCellValue("MGR");
		headerRow.createCell(4).setCellValue("HIREDATE");
		headerRow.createCell(5).setCellValue("SAL");
		headerRow.createCell(6).setCellValue("COMM");
		headerRow.createCell(7).setCellValue("DEPTNO");

		List<EmpDTO> listDTO = (List<EmpDTO>) model.get("allEmp");

		if (!listDTO.isEmpty()) {
			int rowIndex = 3;
			for (EmpDTO dto : listDTO) {
				Row dataRow = sheet.createRow(rowIndex);
				dataRow.createCell(0).setCellValue(dto.getEmpNo() + " ");
				dataRow.createCell(1).setCellValue(dto.getEname() + " ");
				dataRow.createCell(2).setCellValue(dto.getJob() + " ");
				dataRow.createCell(3).setCellValue(dto.getMgr() + " ");
				dataRow.createCell(4).setCellValue(dto.getHireDate() + " ");
				dataRow.createCell(5).setCellValue(dto.getSal() + " ");
				dataRow.createCell(6).setCellValue(dto.getComm() + " ");
				dataRow.createCell(7).setCellValue(dto.getDeptNo() + " ");
				rowIndex++;
			}
		}
	}

}
