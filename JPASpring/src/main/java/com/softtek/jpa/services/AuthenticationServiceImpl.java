package com.softtek.jpa.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.softtek.jpa.domain.User;

public class AuthenticationServiceImpl implements AuthenticationService {
	@Autowired
	UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = userService.findUser(username);
		if (user != null) {
			return new org.springframework.security.core.userdetails.User(user.getUsername(),
					user.getPassword().toLowerCase(), true, true, true, true, getGrantedAuthority(user));
		}

		return null;
	}

	public List<GrantedAuthority> getGrantedAuthority(User user) {
		List<GrantedAuthority> grantedAList = new ArrayList<GrantedAuthority>();
		grantedAList.add(new SimpleGrantedAuthority("ROLE_NAME"));
		return grantedAList;
	}
}
