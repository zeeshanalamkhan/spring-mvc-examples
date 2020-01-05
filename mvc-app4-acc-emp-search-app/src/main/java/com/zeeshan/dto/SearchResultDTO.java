package com.zeeshan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResultDTO {

	private int no;
	private String name, desg;
	int salary, deptno, mgrno;
}
