package com.SpringBootCRUDApp.SpringBootReact.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootCRUDApp.SpringBootReact.dao.UserDao;
import com.SpringBootCRUDApp.SpringBootReact.model.User;
import java.util.List;
import com.SpringBootCRUDApp.SpringBootReact.dto.UserDto;

@Service
public class UserRepositoryImpl implements UserRepository {
	@Autowired
	UserDao UserDao;

	@Override
	public List<User> getAllUsers() {
		return UserDao.findAll();
	}

	@Override
	public User addUser(UserDto userDto) {
		User user = new User(userDto);
		return UserDao.save(user);
	}

	@Override
	public User getUserById(int userId) {	
		return UserDao.findById(userId).get();
	}

	@Override
	public void deleteUserById(int userId) {
		 UserDao.deleteById(userId);
	}

	@Override
	public User editUser(int id, UserDto userdto) {
		User userToEdit;
		userToEdit = UserDao.findById(id).get();
		userToEdit.setEmail(userdto.getEmail());
		userToEdit.setName(userdto.getName());
		userToEdit.setName(userdto.getUsername());
		userToEdit.setPhone(userdto.getPhone());
		return UserDao.save(userToEdit);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User editUser(int id, User user) {
		// TODO Auto-generated method stub
		return null;
	}
}
