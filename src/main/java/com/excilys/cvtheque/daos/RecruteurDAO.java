package com.excilys.cvtheque.daos;import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;

import com.excilys.cvtheque.entity.Recruteur;

public interface RecruteurDAO extends JpaRepository<Recruteur, Long> {

}
