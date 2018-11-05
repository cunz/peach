package com.hcs.peach.common.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hcs.peach.common.model.Example;

public interface ExampleRepository extends JpaSpecificationExecutor<Example>,CrudRepository<Example,Long> {
	
	@Query("from Example f")
	List<Example> searchAll();
}
