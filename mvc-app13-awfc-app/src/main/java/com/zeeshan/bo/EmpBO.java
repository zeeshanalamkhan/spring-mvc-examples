package com.zeeshan.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpBO {

	private Integer empNo;
	private String ename;
	private String job;
	private Integer salary;
}
