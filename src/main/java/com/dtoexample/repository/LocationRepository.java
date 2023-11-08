package com.dtoexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dtoexample.model.Location;

public interface LocationRepository extends JpaRepository<Location,Long> {

}
