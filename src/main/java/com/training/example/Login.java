package com.training.example;

public class Login {
	
	public String validateLogin(String username, String password)
	{
		String validateStatus ="";
		if(username.equals("John") && password.equals("Peter"))
		{
			validateStatus ="Logging Success";
		}
		else if (password.equals(""))
		{
			validateStatus ="Invalid Password";
		}
		else if (username.equals(""))
		{
			validateStatus ="Invalid Username";
		}
		return validateStatus;
	}

}
