package com.SpringBootCRUDApp.SpringBootReact.repository;
import java.util.List;
import com.SpringBootCRUDApp.SpringBootReact.model.User;
import com.SpringBootCRUDApp.SpringBootReact.dto.UserDto;

public interface UserRepository {
	List<User> getAllUsers();

	User addUser(User user);

	User getUserById(int userId);

	void deleteUserById(int userId);

	User editUser(int id, User user);

	User editUser(int id, UserDto userdto);

	User addUser(UserDto userDto);
}
