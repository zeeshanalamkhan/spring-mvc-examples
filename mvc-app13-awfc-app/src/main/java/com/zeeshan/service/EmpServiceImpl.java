/**
 * 
 */
package com.zeeshan.service;

import java.util.ArrayList;
import java.util.List;

import com.zeeshan.bo.EmpBO;
import com.zeeshan.dao.EmpDAO;
import com.zeeshan.dto.EmpDTO;

import lombok.Data;

/**
 * @author ZEESHAN KHAN
 *
 */

@Data
/*public class EmpServiceImpl implements EmpService {*/
public class EmpServiceImpl implements EmpService{
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.service.EmpService#getAllEmployees()
	 */

	private EmpDAO dao;

	@Override
	public List<EmpDTO> getAllEmployees() {

		List<EmpBO> listBO = dao.getAllEmp();
		List<EmpDTO> listDTO = new ArrayList<EmpDTO>();
		for (EmpBO bo : listBO) {
			EmpDTO dto = new EmpDTO(bo.getEmpNo(), bo.getEname(), bo.getJob(), bo.getSalary());
			listDTO.add(dto);
		}
		return listDTO;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.zeeshan.service.EmpService#registerEmp(com.zeeshan.dto.EmpDTO)
	 */
	@Override
	public String registerEmp(EmpDTO dto) {

		EmpBO bo = new EmpBO(dto.getEmpNo(), dto.getEname(), dto.getJob(), dto.getSalary());
		int count = dao.registerEmp(bo);
		if (count != 0) {
			return "Emp with empNo: " + bo.getEmpNo() + " registered successfully...";
		} else {
			return "Emp with empNo: " + bo.getEmpNo() + " could not be registered...";
		}
	}

}
