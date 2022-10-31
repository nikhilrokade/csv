package com.example.responsecsv.service;

import com.example.responsecsv.entity.User;
import com.example.responsecsv.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {


    @Autowired
    private UserRepository repo;


    public List<User> listAll() {
        return repo.findAll();
    }

}
