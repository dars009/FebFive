package com.tsys.febfive.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsys.febfive.dao.SubCategoryRepo;
import com.tsys.febfive.entities.Category;
import com.tsys.febfive.entities.SubCategory;

@Service
public class SubCategoryService {

	@Autowired
	private SubCategoryRepo subCategoryRepo;

	@PersistenceContext
	EntityManager entityManager;
	
	public List<SubCategory> getAllSubCategory() {
		return subCategoryRepo.findAll();
	}

	
	public List<SubCategory> getAllSubCategoryByCategory(Category category) {
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>"+category.getCategoryId());
		Query query = entityManager.createNativeQuery("select * from sub_category where category_id =:categoryid ", SubCategory.class);
		query.setParameter("categoryid", category.getCategoryId());
		return query.getResultList();
	}
}
