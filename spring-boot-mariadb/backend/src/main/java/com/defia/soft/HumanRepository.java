package com.defia.soft;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface HumanRepository extends CrudRepository<Human, Long> {

	List<Human> findByName(String name);

	Human findById(long id);
}
