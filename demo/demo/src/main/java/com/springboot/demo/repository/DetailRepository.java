package com.springboot.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Detail;

@Repository
public interface DetailRepository extends CrudRepository<Detail, Integer> {

	@Query(value="select * from userss",nativeQuery=true)
	List<Detail> findAll();
}
