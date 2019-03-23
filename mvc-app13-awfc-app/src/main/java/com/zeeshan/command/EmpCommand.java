package com.zeeshan.command;

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
	private Integer salary;
}
