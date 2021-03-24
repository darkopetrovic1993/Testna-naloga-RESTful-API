package com.example.restservice;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.restservice.Datum;

// Vzameš katerikoli tip in entity (Datum class) in lahko na njemu uporabljaš vse iz Crud repositorija operacije,
// ki so shranjene v Jpa repositoriju
@Repository
public interface DatumRepository extends JpaRepository<Datum, Long> {
}
