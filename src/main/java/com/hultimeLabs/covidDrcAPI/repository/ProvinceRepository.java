package com.hultimeLabs.covidDrcAPI.repository;

import com.hultimeLabs.covidDrcAPI.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProvinceRepository extends JpaRepository<Province,Long> {

}
