package com.ssafy.ssafit.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.ssafit.model.dto.User;
import com.ssafy.ssafit.model.service.UserService;

@RestController
@RequestMapping("/api")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public ResponseEntity<?> getList() {
		List<User> list = userService.getList();
		if (list == null || list.size() == 0) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		} else {
			return new ResponseEntity<List<User>>(list, HttpStatus.OK);
		}
	}

	@PostMapping("/signup")
	public ResponseEntity<?> signup(User user) {
		userService.signup(user);

		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

	@PostMapping("/login")
	public ResponseEntity<?> login(String id, String pwd, HttpSession session) {
		User temp = userService.getUser(id);
		if (temp == null || !pwd.equals(temp.getPwd())) {
			return new ResponseEntity<Void>(HttpStatus.UNAUTHORIZED);
		} else {
			session.setAttribute("loginUser", temp.getId());
			return new ResponseEntity<String>(temp.getId(), HttpStatus.OK);
		}
	}

	@GetMapping("/logout")
	public ResponseEntity<?> logout(HttpSession session) {
		session.invalidate();
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
