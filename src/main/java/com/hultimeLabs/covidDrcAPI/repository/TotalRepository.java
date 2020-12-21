package com.hultimeLabs.covidDrcAPI.repository;

import com.hultimeLabs.covidDrcAPI.model.Totals;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TotalRepository extends JpaRepository <Totals,Long> {


}
