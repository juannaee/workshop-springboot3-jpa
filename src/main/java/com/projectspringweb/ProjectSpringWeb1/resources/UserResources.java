package com.projectspringweb.ProjectSpringWeb1.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectspringweb.ProjectSpringWeb1.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@GetMapping
	public ResponseEntity<User> findAll() {

		User u = new User("Juan", "juang@", "81996272911", "271114");

		return ResponseEntity.ok().body(u);

	}

}
