package com.zeeshan.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpBO {

	private int no;
	private String name;
	private String job;
	private int salary;
}
