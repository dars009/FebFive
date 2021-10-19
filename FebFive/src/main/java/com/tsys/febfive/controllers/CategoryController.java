package com.tsys.febfive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.febfive.entities.Category;
import com.tsys.febfive.services.CategoryService;

@RestController
@RequestMapping("/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	
	@GetMapping(path = "/getAllCategory", produces = "application/json" )
	public List<Category> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
}
