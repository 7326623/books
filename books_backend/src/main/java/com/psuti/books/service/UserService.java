package com.psuti.books.service;

import com.psuti.books.dto.UserDTO;
import com.psuti.books.model.User;
import com.psuti.books.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@AllArgsConstructor
public class UserService {
    private UserRepository userRepository;

    public User create(UserDTO dto) {
        return userRepository.save(User.builder()
                        .firstName(dto.getFirstName())
                        .lastName(dto.getLastName())
                        .secondName(dto.getSecondName())
                        .email(dto.getEmail())
                        .userName(dto.getUserName())
                        .password(dto.getPassword())
                        .createdAt(new Date())
                        .enabled(true)
                .build());
    }

    public User getById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateFromUser(UserDTO dto) {
        return userRepository.save(User.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .secondName(dto.getSecondName())
                .email(dto.getEmail())
                .userName(dto.getUserName())
                .password(dto.getPassword())
                .avatar(dto.getAvatar())
                .build());
    }

    public User updateFromAdmin(User user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
