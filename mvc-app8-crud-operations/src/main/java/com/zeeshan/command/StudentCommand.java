package com.zeeshan.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCommand {

	private int sno;
	private String sname;
	private String sadd;

}
