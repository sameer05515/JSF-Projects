package com.codenotfound.primefaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopFHBRepository extends JpaRepository<TopFHB, Long> {
}
