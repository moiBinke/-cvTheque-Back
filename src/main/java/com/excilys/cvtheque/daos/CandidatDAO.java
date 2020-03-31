package com.excilys.cvtheque.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excilys.cvtheque.entity.Candidat;

public interface CandidatDAO extends JpaRepository<Candidat, Long> {

}
