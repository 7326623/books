package com.psuti.books.service;

import com.psuti.books.dto.OfferListDTO;
import com.psuti.books.dto.StatusDTO;
import com.psuti.books.model.BookLiterary;
import com.psuti.books.model.OfferList;
import com.psuti.books.model.Status;
import com.psuti.books.repository.OfferListRepository;
import com.psuti.books.repository.StatusRepository;

import java.util.List;

public class StatusService {
    private StatusRepository statusRepository;
    public Status create(StatusDTO dto) {
        return statusRepository.save(Status.builder()
                        .name(dto.getName())
                .build());
    }

    public Status getById(Long id) {
        return statusRepository.findById(id).orElse(null);
    }

    public Status updateFromUser(StatusDTO dto) {
        return statusRepository.save(Status.builder()
                        .id(dto.getId())
                        .name(dto.getName())
                .build());
    }

    public Status updateFromAdmin(Status sts) {
        return statusRepository.save(sts);
    }

    public void delete(Long id) {
        statusRepository.deleteById(id);
    }
}
