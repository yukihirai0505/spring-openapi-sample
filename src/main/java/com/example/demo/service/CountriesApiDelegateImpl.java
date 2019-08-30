package com.example.demo.service;

import com.example.demo.api.CountriesApiDelegate;
import com.example.demo.api.model.Country;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CountriesApiDelegateImpl implements CountriesApiDelegate {

    @Override
    public ResponseEntity<List<Country>> getAllCountries() {
        Country country = new Country();
        country.setId(1L);
        country.setCountryName("test");
        return ResponseEntity.ok(Arrays.asList(country));
    }

}
