package com.hultimeLabs.covidDrcAPI.controller;

import com.hultimeLabs.covidDrcAPI.model.Province;

import com.hultimeLabs.covidDrcAPI.repository.ProvinceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProvinceController {

    @Autowired
    ProvinceRepository provinceRepository;

    @GetMapping("/provinces")
    public List<Province> provinces(){
        return provinceRepository.findAll();
    }
}
