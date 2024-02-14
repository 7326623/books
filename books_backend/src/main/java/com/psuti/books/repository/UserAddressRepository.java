package com.psuti.books.repository;

import com.psuti.books.model.UserAddress;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

@Entity
public interface UserAddressRepository extends JpaRepository<UserAddress, Long> {
}
