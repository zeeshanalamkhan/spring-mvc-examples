package com.zeeshan.service;

import java.util.List;

import com.zeeshan.dto.EmpDTO;

public interface EmpService {

	public List<EmpDTO> getAllEmployees();

	public String registerEmp(EmpDTO dto);
}
