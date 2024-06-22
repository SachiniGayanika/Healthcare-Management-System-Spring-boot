package com.example.restapp.data;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface ViewPatientRepository extends JpaRepository<ViewPatient,Integer> {

    ViewPatient getById(int id);
}
