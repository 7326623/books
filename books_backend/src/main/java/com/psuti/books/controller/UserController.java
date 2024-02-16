package com.psuti.books.controller;

import com.psuti.books.dto.UserDTO;
import com.psuti.books.model.User;
import com.psuti.books.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<User> create(@RequestBody UserDTO dto) {
        System.out.println("a");
        return new ResponseEntity<>(userService.create(dto), HttpStatus.OK);
    }
}
