package com.example.demo;

import com.example.demo.config.CompanyLogo;
import com.example.demo.domain.Company;
import com.example.demo.repository.CompanyRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ImageUpdateRunner implements CommandLineRunner {
    private final CompanyRepository companyRepository;

    @Override
    public void run(String... args) {
        List<Company> companies = companyRepository.findByNames(CompanyLogo.getTotalNames());
        for (Company company: companies) {
            CompanyLogo companyLogo = Arrays.stream(CompanyLogo.values())
                    .filter(e -> e.getName().equals(company.getName()))
                    .findAny()
                    .orElseThrow(() -> new RuntimeException("Company Image 를 업데이트 하지 못했습니다"));
            company.setLogoImageName(companyLogo.getImageName());
        }
    }
}
