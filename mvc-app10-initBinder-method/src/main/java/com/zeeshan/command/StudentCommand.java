package com.zeeshan.command;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentCommand {

	private String name;
	private Date dob, doj, dom;
}
