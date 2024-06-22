package com.example.lecture.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeadbackRepository extends JpaRepository<Feadback,Integer> {
}
