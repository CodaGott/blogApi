package com.myblog.blogapi.model;

import com.myblog.blogapi.repository.MyUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataMongoTest
class userModelTest {

    UserModel user;

    @Autowired
    MyUserRepository userRepository;


    @BeforeEach
    void setUp() {
        user = new UserModel();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canCreateUser(){
        user.setFirstName("Dozie");
        user.setLastName("Don");
        user.setEmail("user@gmail.com");
        userRepository.save(user);
        assertEquals(userRepository.count(), 1);
    }

    @Test
    void canUpdateUser(){

        UserModel userModel = new UserModel();
        userModel.setFirstName("Gee");
        userModel.setLastName("Like you");
        userModel.setEmail("gee@jesus.com");
        UserModel savedUserModel = userRepository.save(userModel);

        Optional<UserModel> updateUser = userRepository.findById(savedUserModel.getId());
        updateUser.get().setFirstName("Emma");
        userRepository.save(updateUser.get());
        assertEquals("Emma", updateUser.get().getFirstName());
    }

    @Test
    void canReadUser(){

        UserModel userModel = new UserModel();
        userModel.setFirstName("Gee");
        userModel.setLastName("Like you");
        userModel.setEmail("gee@jesus.com");
        UserModel savedUserModel = userRepository.save(userModel);

        Optional<UserModel> findUser = userRepository.findById(savedUserModel.getId());
        assertEquals(findUser.get().getFirstName(), "Gee");

    }

    @Test
    void canDeleteUser(){
        UserModel userModel = new UserModel();
        userModel.setFirstName("Gee");
        userModel.setLastName("Like you");
        userModel.setEmail("gee@jesus.com");
//        UserModel savedUserModel = userRepository.save(userModel);

        userRepository.save(userModel);
        userRepository.delete(userModel);
        assertEquals(userRepository.count(), 0);
    }
}