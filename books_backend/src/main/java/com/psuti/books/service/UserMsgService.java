package com.psuti.books.service;

import com.psuti.books.dto.UserMsgDTO;
import com.psuti.books.model.UserMsg;
import com.psuti.books.repository.UserMsgRepository;

import java.util.Date;

public class UserMsgService {
    private UserMsgRepository userMsgRepository;
        public UserMsg create(UserMsgDTO dto) {
            return userMsgRepository.save(UserMsg.builder()
                            .user(dto.getUser())
                            .createAt(new Date())
                            .text(dto.getText())
                            .notes(dto.getNotes())
                            .status(dto.getStatus())
                            .type(dto.getType())
                    .build());
        }

        public UserMsg getById(Long id) {
            return userMsgRepository.findById(id).orElse(null);
        }

        public UserMsg updateFromUser(UserMsgDTO dto) {
            return userMsgRepository.save(UserMsg.builder()
                    .id(dto.getId())
                    .user(dto.getUser())

                    .text(dto.getText())
                    .notes(dto.getNotes())
                    .status(dto.getStatus())
                    .type(dto.getType())
                    .build());
        }

        public UserMsg updateFromAdmin(UserMsg udr) {
            return userMsgRepository.save(udr);
        }

        public void delete(Long id) {
            userMsgRepository.deleteById(id);
        }
}
