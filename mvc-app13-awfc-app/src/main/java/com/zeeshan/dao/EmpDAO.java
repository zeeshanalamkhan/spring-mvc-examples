package com.zeeshan.dao;

import java.util.List;

import com.zeeshan.bo.EmpBO;

public interface EmpDAO {

	public List<EmpBO> getAllEmp();

	public Integer registerEmp(EmpBO bo);
}
