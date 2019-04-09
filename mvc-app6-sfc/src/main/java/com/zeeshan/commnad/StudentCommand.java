package com.zeeshan.commnad;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCommand {

	private int sno = 1001;
	private String sname = "ZAHEER KHAN";
	private String sadd = "NEW DELHI";
}
