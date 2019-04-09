package com.zeeshan.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchCommand {

	private int no;
	private String name, desg;
	private int salary;
}
