package com.softtek.jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softtek.jpa.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
	
	@Query(name = "findUsers", nativeQuery = true)
	public List<User> userList();
	
	@Query(name = "findOneUser", nativeQuery = true)
	public User findUser(@Param ("username") String username);
	
	@Query(value = "SELECT u FROM User AS u WHERE u.name= :name")
	public List<User> duplicateUser(@Param ("name") String name);
	
	
	@Query(name="update", nativeQuery=true)
	public boolean updateUser(@Param ("password") String password,	
							@Param ("name") String name,
							@Param ("active") String active,
							@Param ("id") String id,
							@Param ("oldusername") String oldusername);

}
