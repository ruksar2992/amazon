package com.example.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.hospital.Dto.LoginDto;
import com.example.hospital.Dto.UserDto;
import com.example.hospital.Service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String registerUser(@RequestBody UserDto userDto) {
		userService.addUser(userDto);
		return "user added successfully";
	}
	
	@PostMapping("/users/login")
	public String authenticateUser(@RequestBody LoginDto loginDto) {
		if (userService.authenticateUser(loginDto))
			return "logged in successfully";
		else {
			return "Credentials incorrect";
		}
	
		
		/*@GetMapping("/users/{userid}/Appointments")
	    public List<OrderResponseDto> getOrderHistory(@PathVariable("userid")int userid) {
	        List<OrderResponseDto>
	       
	  responseEntity=new  List<OrderResponseDto>(orderService.getOrderHistory(userid) );
	       
	        }
	        return responseEntity ;
	    }*/
	}
}



