package com.zeeshan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDTO {

	private Integer empNo;
	private String ename;
	private String job;
	private Integer salary;
}
