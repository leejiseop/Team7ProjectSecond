package com.example.secondteamproject.repository;


import com.example.secondteamproject.entity.AnswerProductInquiry;
import com.example.secondteamproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AnswerProductInquiryRepository extends JpaRepository<AnswerProductInquiry, Long> {
}
