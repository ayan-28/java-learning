package com.ayan.SpringDataJpaExample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ayan.SpringDataJpaExample.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Integer>{
	
	@Query("select p from Products p where p.productname like :initChar%")
	List<Products> findByProdNameStartingWith(@Param("initChar") String chars);
}
