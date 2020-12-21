package com.hultimeLabs.covidDrcAPI.controller;


import com.hultimeLabs.covidDrcAPI.model.Totals;
import com.hultimeLabs.covidDrcAPI.repository.TotalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TotalController {

    @Autowired
    private TotalRepository totalRepository;

    @GetMapping("/totals")
    public List<Totals> totals(){return totalRepository.findAll();}
}
