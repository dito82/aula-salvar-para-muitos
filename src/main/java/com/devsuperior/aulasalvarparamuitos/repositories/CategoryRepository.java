package com.devsuperior.aulasalvarparamuitos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.aulasalvarparamuitos.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
