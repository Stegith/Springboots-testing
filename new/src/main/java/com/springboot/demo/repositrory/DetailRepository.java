package com.springboot.demo.repositrory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.entity.Detail;

@Repository
public interface DetailRepository extends CrudRepository<Detail, Integer> {

	List<Detail> findByDetailid(Integer detailid);
}

