package com.tsys.febfive.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsys.febfive.dao.CategoryRepo;
import com.tsys.febfive.entities.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	
	public List<Category> getAllCategory(){
		return categoryRepo.findAll();
	}
}
