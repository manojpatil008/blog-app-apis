package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	@NotEmpty
	@Size(min = 4, message = "Name must be min of 4 characters")
	private String name;
	
	@Email(message = "Email address is not valid !!")
	private String email;
	
	@NotEmpty
	@Size(min = 6, max = 15, message = "Password must have min 3 chars and max 10 chars !!")
	private String password;
	
	@NotEmpty
	private String about; 
}
