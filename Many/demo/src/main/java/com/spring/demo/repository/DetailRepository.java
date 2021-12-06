package com.spring.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.demo.entity.Detail;

public interface DetailRepository extends CrudRepository<Detail,Integer>{
	
	List<Detail> findByDetailid(Integer detailid);
}
