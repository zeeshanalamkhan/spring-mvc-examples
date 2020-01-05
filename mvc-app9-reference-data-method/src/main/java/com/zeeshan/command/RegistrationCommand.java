package com.zeeshan.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegistrationCommand {

	private Integer sno;
	private String sname;
	private String course;

}
