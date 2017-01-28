package com.softtek.jpa.services;

import java.util.List;

import com.softtek.jpa.domain.Users;

public interface UserService {
	
	public List<Users> userList();
	public Users findUser(String username);
	//public List<Users> duplicateUser(String name);
	//public boolean update(User user,String user_role_id);

}
