package com.psuti.books.controller;

import com.psuti.books.dto.UserDTO;
import com.psuti.books.model.User;
import com.psuti.books.security.UserPrincipal;
import com.psuti.books.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @GetMapping("/guest")
    public String guest() {
        return "Если ты это видишь, то у тебя права ГОСТЯ";
    }

    @GetMapping("/secured")
    public String secured(@AuthenticationPrincipal UserPrincipal principal) {
        return "Если ты это видишь, то у тебя есть права ПОЛЬЗОВАТЕЛЯ " + principal.getEmail() + " id: " + principal.getUserId();
    }

    @GetMapping("/admin")
    public String admin(@AuthenticationPrincipal UserPrincipal principal) {
        return "Если ты это видишь, то у тебя есть права АДМИНИСТРАТОРА " + principal.getEmail() + " id: " + principal.getUserId();
    }

    @PutMapping("/update-user")
    public ResponseEntity<User> updateUser(@RequestBody UserDTO dto) {
        return new ResponseEntity<>(userService.update(dto), HttpStatus.OK);
    }

    @GetMapping("/me")
    public ResponseEntity<Optional<User>> getUserByPrincipal(@AuthenticationPrincipal UserPrincipal principal) {
        return new ResponseEntity<>(userService.getByEmail(principal.getEmail()), HttpStatus.OK);
    }
}
