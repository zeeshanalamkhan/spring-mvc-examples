package com.zeeshan.command;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterCommand {

	private String userName;
	private String password;

	private String emailId;
	private String phone;

	private String city;
	private String pincode;

}
