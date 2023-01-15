package com.SpringBootCRUDApp.SpringBootReact.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringBootCRUDApp.SpringBootReact.model.User;

public interface UserDao extends  JpaRepository<User,Integer>{

}
