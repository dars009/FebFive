package com.tsys.febfive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsys.febfive.entities.Category;
import com.tsys.febfive.entities.SubCategory;
import com.tsys.febfive.services.CategoryService;
import com.tsys.febfive.services.SubCategoryService;

@RestController
@CrossOrigin
@RequestMapping("/subCategory")
public class SubCategoryController {

	@Autowired
	private SubCategoryService subCategoryService;
	
	
	@GetMapping(path = "/getAllSubCategory", produces = "application/json" )
	public List<SubCategory> getAllSubCategory(){
		return subCategoryService.getAllSubCategory();
	}
	
	@PostMapping(path = "/getAllSubCategoryByCategory", produces = "application/json")
	public List<SubCategory> getAllSubCategoryByCategory(@RequestBody Category category){
		return subCategoryService.getAllSubCategoryByCategory(category);
	}
	
}
