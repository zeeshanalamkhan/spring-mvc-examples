package com.zeeshan.service;

import java.util.ArrayList;
import java.util.List;

import com.zeeshan.bo.EmpBO;
import com.zeeshan.dao.EmpDAO;
import com.zeeshan.dto.EmpDTO;

public class EmpServiceImpl implements EmpService {

	private EmpDAO dao;

	public void setDao(EmpDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmpDTO> getAllEmps() {
		List<EmpBO> listBO = dao.retrieveAllEmps();
		List<EmpDTO> listDTO = new ArrayList<EmpDTO>();
		for (EmpBO bo : listBO) {
			EmpDTO dto = new EmpDTO(bo.getNo(), bo.getName(), bo.getJob(), bo.getSalary());
			listDTO.add(dto);
		}
		return listDTO;
	}

}
