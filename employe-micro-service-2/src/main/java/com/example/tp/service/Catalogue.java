package com.example.tp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tp.dao.IProduitRepository;

import com.example.tp.dao.Produit;

@RestController
public class Catalogue {
	
	@Autowired
	private IProduitRepository pro;
	
	@RequestMapping("/save")
	public Produit saveProduit (Produit P)
	{
		pro.save(P);
		return P;
	}
	
	@RequestMapping("/all")
	public List<Produit> getProduits()
	{
		return pro.findAll();
	}

	
	@RequestMapping("/produits")
	public Page<Produit> getProduits(int page)
	{
		return pro.findAll(  PageRequest.of(page, 5));
	}

	/*@RequestMapping("/produitParMC")
	public Page<Produit> getProduits (String mc, int page)
	
	{
		return pro.produitParMC("%"+mc+"%", PageRequest.of(page, 5));
		
	}*/
	@RequestMapping("/get")
	public Optional<Produit> getProduit (Long ref)
	
	{
		return pro.findById(ref);
		
		
		
	}
	
	@RequestMapping("/delete")
	public Boolean delete (Long ref)
	
	{
		 pro.deleteById(ref);
		 
		 return true;
		
	}
	
	@RequestMapping("/update")
	public Produit update (Produit P)
	
	{
		 pro.save(P);
		 
		 return P;
		
	}
	
	
	
	
	
}
