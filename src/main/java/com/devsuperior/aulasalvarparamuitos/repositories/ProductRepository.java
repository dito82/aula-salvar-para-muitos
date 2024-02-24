package com.devsuperior.aulasalvarparamuitos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulasalvarparamuitos.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
