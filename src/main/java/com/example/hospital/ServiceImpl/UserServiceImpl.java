package com.example.hospital.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.hospital.Dao.UserDao;
import com.example.hospital.Dto.LoginDto;
import com.example.hospital.Dto.UserDto;
import com.example.hospital.Service.UserService;
import com.example.hospital.model.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userDao;

	@Override
	public void addUser(@RequestBody UserDto userDto) {
		User user = new User();
		BeanUtils.copyProperties(userDto, user);
		userDao.save(user);
	}

	@Override
	public boolean authenticateUser(LoginDto loginDto) {
		Optional<User> user = userDao.findByUserNameAndPassword(loginDto.getUserName(), loginDto.getPassword());
		if (user.equals(null))
			return false;
		else {
			return true;
		}

	}

	


}
