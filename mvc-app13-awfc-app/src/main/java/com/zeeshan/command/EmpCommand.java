package com.zeeshan.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpCommand {

	private Integer empNo;
	private String ename;
	private String job;
	private Integer mgr;
	private Date hireDate;
	private Integer salary;
	private Integer comm;
	private Integer deptNo;
}
