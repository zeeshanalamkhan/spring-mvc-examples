package com.zeeshan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDTO {

	private int no;
	private String name;
	private String job;
	private int salary;
}
