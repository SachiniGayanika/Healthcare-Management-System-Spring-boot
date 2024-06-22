package com.example.springsec.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface scheduleRepository extends JpaRepository<schedule, Integer> {

    @Query("SELECT s FROM schedule s WHERE s.name = ?1")
    List<schedule> getscheduleByName(String name);
}
