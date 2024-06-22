package com.example.patientsprofileapp1.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientProfileRepository extends JpaRepository<PatientProfile,Integer> {

    @Query("select te from PatientProfile te where te.id=?1")
    public List<PatientProfile> getPatientProfileById(int id);
}
