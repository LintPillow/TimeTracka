package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DepartureEntity;

public interface DepartureRepository extends JpaRepository<DepartureEntity, Long> {
}