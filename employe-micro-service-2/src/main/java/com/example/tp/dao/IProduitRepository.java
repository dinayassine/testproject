package com.example.tp.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IProduitRepository extends MongoRepository<Produit, Long>{
  /*@Query("select p from Produit p where p.designation like:x")
	public Page<Produit> produitParMC(@Param("x") String mc, Pageable P);*/
  public List<Produit> findBydesignation (String des);
  public Page<Produit> findBydesignation (String des, Pageable p);
}
