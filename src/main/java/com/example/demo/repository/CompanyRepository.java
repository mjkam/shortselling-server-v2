package com.example.demo.repository;

import com.example.demo.domain.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Optional<Company> findByCompanyCode(String companyCode);

    @Query("SELECT m FROM Company m WHERE m.name IN :names")
    List<Company> findByNames(@Param("names") List<String> names);
}
