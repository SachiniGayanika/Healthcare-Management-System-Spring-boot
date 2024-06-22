package com.example.restapp2.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Integer> {

    @Query("SELECT te FROM Patient te WHERE te.name=?1")
    public List<Patient> getPatientByName(String name);
}
