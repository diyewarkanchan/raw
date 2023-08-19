package com.example.demo.serives;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repositories.RoleRepositiory;

@Service
public class RoleService {
	
	@Autowired
	RoleRepositiory rrepo;

}
