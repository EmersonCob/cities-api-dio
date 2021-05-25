package com.dio.desafiofinal.citiesapi.countries.respository;

import com.dio.desafiofinal.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
