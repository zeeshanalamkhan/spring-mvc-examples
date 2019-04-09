package com.zeeshan.service;

import com.zeeshan.bo.StudentBO;
import com.zeeshan.dao.StudentInsertDAO;
import com.zeeshan.dto.StudentDTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private StudentInsertDAO dao;

	@Override
	public String registerStudent(StudentDTO sdto) {
		StudentBO sbo = new StudentBO(sdto.getSno(), sdto.getSname(), sdto.getSadd());
		int count = dao.insert(sbo);
		if (count == 0) {
			return "Student Registration Failed....";
		} else {
			return "Student Registration Succeeded.... with no: " + sbo.getSno() + "  and name: " + sbo.getSname();
		}
	}

}
