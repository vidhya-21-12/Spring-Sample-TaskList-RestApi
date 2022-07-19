package com.example.SpringTask.Repository;

import com.example.SpringTask.Entity.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalRepository extends JpaRepository<PersonalDetails,Long> {
}
