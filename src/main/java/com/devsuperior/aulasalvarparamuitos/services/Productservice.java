package com.devsuperior.aulasalvarparamuitos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aulasalvarparamuitos.dto.CategoryDTO;
import com.devsuperior.aulasalvarparamuitos.dto.ProductDTO;
import com.devsuperior.aulasalvarparamuitos.entities.Category;
import com.devsuperior.aulasalvarparamuitos.entities.Product;
import com.devsuperior.aulasalvarparamuitos.repositories.CategoryRepository;
import com.devsuperior.aulasalvarparamuitos.repositories.ProductRepository;

@Service
public class Productservice {

	@Autowired
	private ProductRepository repProduct;
	
	@Autowired
	private CategoryRepository repCategory;

	public ProductDTO insert(ProductDTO dto) {

		Product entity = new Product();
		entity.setName(dto.getName());
		entity.setPrice(dto.getPrice());

		//[...] pra cada catDTO dentro da lista getCategories...
		for (CategoryDTO catDTO : dto.getCategories()) {
			
			Category cat = repCategory.getReferenceById(catDTO.getId());
			
			//Category cat = new Category();
			//cat.setId(catDTO.getId());
			entity.getCategories().add(cat);
		}
		entity = repProduct.save(entity);
		return new ProductDTO(entity);

	}

}
