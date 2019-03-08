package com.zeeshan.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCommand {

	private int sno = 101;
	private String sname = "ZEESHAN";
	private String sadd = "NOIDA";

}
