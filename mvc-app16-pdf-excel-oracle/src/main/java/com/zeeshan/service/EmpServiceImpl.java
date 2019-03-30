package com.zeeshan.service;

import java.util.ArrayList;
import java.util.List;

import com.zeeshan.bo.EmpBO;
import com.zeeshan.dto.EmpDTO;
import com.zeeshan.repository.EmpRepository;

import lombok.Data;

@Data
public class EmpServiceImpl implements EmpService {

	private EmpRepository repository;

	@Override
	public List<EmpDTO> listAllEmp() {
		List<EmpBO> listBO = repository.listAllEmp();
		List<EmpDTO> listDTO = new ArrayList<EmpDTO>();

		for (EmpBO bo : listBO) {
			EmpDTO dto = new EmpDTO();
			dto.setEmpNo(bo.getEmpNo());
			dto.setEname(bo.getEname());
			dto.setJob(bo.getJob());
			dto.setMgr(bo.getMgr());
			dto.setHireDate(bo.getHireDate());
			dto.setSal(bo.getSal());
			dto.setComm(bo.getComm());
			dto.setDeptNo(bo.getDeptNo());
			listDTO.add(dto);
		}
		return listDTO;
	}

}
