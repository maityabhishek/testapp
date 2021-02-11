package com.testapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testapp.dao.UserRepo;
import com.testapp.model.User;

@RestController
public class Controller {
	
	@Autowired
	private UserRepo userdao;
	
	@RequestMapping(path="/viewall", method=RequestMethod.GET)
	public ResponseEntity<?> viewall()
	{
		return new ResponseEntity<>(userdao.findAll(),HttpStatus.OK);
	}
	@RequestMapping(path="/add", method=RequestMethod.POST)
	public ResponseEntity<?> adduser(@RequestBody User user)
	{
		return new ResponseEntity<>(userdao.save(user),HttpStatus.OK);
	}
	@RequestMapping(path="/update", method=RequestMethod.PUT)
	public ResponseEntity<?> add(@RequestBody User user)
	{
		return new ResponseEntity<>(userdao.save(user),HttpStatus.OK);
	}
	@RequestMapping(path="/delete/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<?> add(@PathVariable int id)
	{
		userdao.delete(userdao.findById(id));
		return new ResponseEntity<>("{\"msg\":\"done\"}",HttpStatus.OK);
	}
	
}
