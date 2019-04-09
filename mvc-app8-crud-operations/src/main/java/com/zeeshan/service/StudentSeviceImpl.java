/**
 * 
 */
package com.zeeshan.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.zeeshan.bo.StudentBO;
import com.zeeshan.dao.StudentDAO;
import com.zeeshan.dto.StudentDTO;

import lombok.Data;

/**
 * @author ZEESHAN KHAN
 *
 */
@Data
public class StudentSeviceImpl implements StudentService {

	private StudentDAO dao;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.service.StudentService#listStudents()
	 */
	@Override
	public List<StudentDTO> listStudents() {

		List<StudentDTO> listDTO = new ArrayList<StudentDTO>();
		List<StudentBO> listBO = dao.getAllStudent();
		if (listBO != null) {
			for (StudentBO bo : listBO) {
				StudentDTO dto = new StudentDTO();
				BeanUtils.copyProperties(bo, dto);
				listDTO.add(dto);
			}
		}
		return listDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.service.StudentService#getStudentById(int)
	 */
	@Override
	public StudentDTO getStudentById(int sno) {
		StudentBO bo = dao.getStudentById(sno);
		StudentDTO dto = new StudentDTO(bo.getSno(), bo.getSname(), bo.getSadd());
		return dto;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.service.StudentService#updateStudent(int)
	 */
	@Override
	public String updateStudent(StudentDTO dto) {

		StudentBO bo = new StudentBO(dto.getSno(), dto.getSname(), dto.getSadd());
		int count = dao.update(bo);
		if (count != 0) {
			return "Student Record updated with SNO: " + dto.getSno();
		} else {
			return "Student Record could not be updated with SNO: " + dto.getSno();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.zeeshan.service.StudentService#insertStudent(com.zeeshan.dto.StudentDTO)
	 */
	@Override
	public String insertStudent(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		bo.setSno(dto.getSno());
		bo.setSname(dto.getSname());
		bo.setSadd(dto.getSadd());
		int count = dao.insert(bo);
		if (count != 0) {
			return "Student Record inserted with SNO: " + dto.getSno();
		} else {
			return "Student Record could not be inserted with SNO: " + dto.getSno();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.service.StudentService#deleteStudentById(int)
	 */
	@Override
	public String deleteStudentById(int sno) {

		int count = dao.deleteById(sno);
		if (count != 0) {
			return "Student Record deleted with SNO: " + sno;
		} else {
			return "Student Record not found with SNO: " + sno;
		}
	}

}
