package com.zeeshan.service;

import java.util.List;

import com.zeeshan.bo.StudentBO;
import com.zeeshan.dto.StudentDTO;

public interface StudentService {

	public List<StudentDTO> listStudents();

	public StudentDTO getStudentById(int sno);

	public String updateStudent(StudentDTO dto);

	public String insertStudent(StudentDTO dto);

	public String deleteStudentById(int sno);
}
