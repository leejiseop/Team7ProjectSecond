package com.example.secondteamproject.repository;


import com.example.secondteamproject.entity.Admin;
import com.example.secondteamproject.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
}
