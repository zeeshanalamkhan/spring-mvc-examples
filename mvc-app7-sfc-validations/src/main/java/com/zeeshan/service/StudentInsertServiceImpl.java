/**
 * 
 */
package com.zeeshan.service;

import com.zeeshan.bo.StudentBO;
import com.zeeshan.dao.StudentInsertDAO;
import com.zeeshan.dto.StudentDTO;

import lombok.Data;

/**
 * @author ZEESHAN KHAN
 *
 */
@Data
public class StudentInsertServiceImpl implements StudentInsertService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zeeshan.service.StudentInsertService#insert(com.zeeshan.dto.StudentDTO)
	 */

	private StudentInsertDAO dao;

	@Override
	public String insert(StudentDTO dto) {

		StudentBO bo = new StudentBO(dto.getSno(), dto.getSname(), dto.getSadd());
		int count = dao.insert(bo);
		if (count == 0) {
			return "Registration Failed...";
		} else {
			return "Registration Succeeded with SNO: " + dto.getSno() + " and SNAME: " + dto.getSname();
		}
	}

}
