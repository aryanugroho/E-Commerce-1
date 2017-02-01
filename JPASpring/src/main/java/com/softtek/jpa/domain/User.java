package com.softtek.jpa.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;

@Entity
@Table(name = "users")

@NamedNativeQueries({

		@NamedNativeQuery(
				name = "findUsers", 
				query = "SELECT u.username as username, " 
						+ "u.password as password, "
						+ "u.name as name, " 
						+ "u.address as address, " 
						+ "u.city as city, " 
						+ "u.zipcode as zipcode, "
						+ "u.country as country, " 
						+ "u.phone as phone, " 
						+ "u.email as email "
						+ "FROM users u", resultSetMapping = "UsersMapping"),

		@NamedNativeQuery(
				name = "findOneUser", 
				query = "SELECT u.username as username, " 
						+ "u.password as password, "
						+ "u.name as name, " 
						+ "u.address as address, " 
						+ "u.city as city, " 
						+ "u.zipcode as zipcode, "
						+ "u.country as country, " 
						+ "u.phone as phone, "
						+ "u.email as email " 
						+ "FROM users u "
						+ "WHERE u.username = :username", resultSetMapping = "UserMapping"),

		@NamedNativeQuery(
				name = "update",
				query = "UPDATE user u, " 
						+ "SET u.password = :password, "
						+ "u.name = :name, " 
						+ "u.active = :active, "
						+ "u.user_role_id = (SELECT user_role_id FROM user_role WHERE user_role_id = :id) "
						+ "WHERE u.username = :oldusername", resultSetMapping = "updateResult") })

@SqlResultSetMappings({

		@SqlResultSetMapping(name = "UsersMapping", classes = {

				@ConstructorResult(targetClass = User.class, columns = {

						@ColumnResult(name = "username", type = String.class),

						@ColumnResult(name = "password", type = String.class),

						@ColumnResult(name = "name", type = String.class),

						@ColumnResult(name = "address", type = String.class),

						@ColumnResult(name = "city", type = String.class),

						@ColumnResult(name = "zipcode", type = Integer.class),

						@ColumnResult(name = "country", type = String.class),

						@ColumnResult(name = "phone", type = String.class),

						@ColumnResult(name = "email", type = String.class) }) }),

		@SqlResultSetMapping(name = "UserMapping", classes = {

				@ConstructorResult(targetClass = User.class, columns = {

						@ColumnResult(name = "username", type = String.class),

						@ColumnResult(name = "password", type = String.class),

						@ColumnResult(name = "name", type = String.class),

						@ColumnResult(name = "address", type = String.class),

						@ColumnResult(name = "city", type = String.class),

						@ColumnResult(name = "zipcode", type = Integer.class),

						@ColumnResult(name = "country", type = String.class),

						@ColumnResult(name = "phone", type = String.class),

						@ColumnResult(name = "email", type = String.class) }) }),

		@SqlResultSetMapping(name = "updateResult", columns = { @ColumnResult(name = "count") }) })

public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "username", unique = true, nullable = false)
	private String username;

	@Column(name = "password", nullable = false)
	private String password;

	@Column(name = "name", nullable = false)
	private String name;

	@Column(name = "address", nullable = false)
	private String address;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "zipcode")
	private int zipcode;

	@Column(name = "country", nullable = false)
	private String country;

	@Column(name = "phone")
	private String phone;

	@Column(name = "email")
	private String email;

	public User() {
		super();
	}

	public User(String username, String password, String name, String address, String city, int zipcode,
			String country, String phone, String email) {
		super();
		this.username = username;
		this.password = password;
		this.name = name;
		this.address = address;
		this.city = city;
		this.zipcode = zipcode;
		this.country = country;
		this.phone = phone;
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		result = prime * result + zipcode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		if (zipcode != other.zipcode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Users [username=" + username + ", password=" + password + ", name=" + name
				+ ", address=" + address + ", city=" + city + ", zipcode=" + zipcode + ", country=" + country
				+ ", phone=" + phone + ", email=" + email + "]";
	}

}
