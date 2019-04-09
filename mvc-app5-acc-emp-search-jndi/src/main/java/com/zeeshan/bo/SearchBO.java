package com.zeeshan.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchBO {

	private int no;
	private String name, desg;
	private int salary;
}
