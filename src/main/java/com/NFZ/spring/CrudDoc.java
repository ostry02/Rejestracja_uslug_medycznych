package com.NFZ.spring;

import org.springframework.data.repository.CrudRepository;

public interface CrudDoc extends CrudRepository<Doctors, Integer> {
}
