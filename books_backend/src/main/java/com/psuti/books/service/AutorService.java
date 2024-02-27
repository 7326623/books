package com.psuti.books.service;

import com.psuti.books.dto.AutorDTO;

import com.psuti.books.model.Autor;

import com.psuti.books.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorService {
    private AutorRepository autorRepository;
    public Autor create(AutorDTO dto) {
        return autorRepository.save(Autor.builder()
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .build());
    }

    public Autor getById(Long id) {
        return autorRepository.findById(id).orElse(null);
    }

    public Autor update(Autor autor) {
        return autorRepository.save(autor);
    }

    public void delete(Long id) {
        autorRepository.deleteById(id);
    }
}


