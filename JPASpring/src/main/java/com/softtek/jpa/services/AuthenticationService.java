package com.softtek.jpa.services;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AuthenticationService extends UserDetailsService{

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
