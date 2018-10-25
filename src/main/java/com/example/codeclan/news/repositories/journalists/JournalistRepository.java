package com.example.codeclan.news.repositories.journalists;

import com.example.codeclan.news.models.Journalist;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface JournalistRepository extends JpaRepository<Journalist, Long>, JournalistRepositoryCustom {
}
