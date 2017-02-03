package com.softtek.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	/*
	 * Repository that provides CRUD operations for User entity.
	 */
	
	@Query(name = "findUsers", nativeQuery = true)
	public List<User> userList();
	
	@Query(name = "findOneUser", nativeQuery = true)
	public User findUser(@Param ("username") String username);

}
