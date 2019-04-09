package com.zeeshan.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchResultBO {

	private int no;
	private String name, desg;
	int salary, deptno, mgrno;
}
