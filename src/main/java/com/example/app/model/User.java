package com.example.app.model;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class User {

	@NotNull(message="邮箱不能为空")
	@Email(message="邮箱格式错误")
	private String email;
	
	@NotNull(message="密码不能为空")
	private String password;
}
