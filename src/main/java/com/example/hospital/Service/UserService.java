package com.example.hospital.Service;

import com.example.hospital.Dto.LoginDto;
import com.example.hospital.Dto.UserDto;

public interface UserService {
	public void addUser(UserDto userDto);

	public boolean authenticateUser(LoginDto loginDto);

}
