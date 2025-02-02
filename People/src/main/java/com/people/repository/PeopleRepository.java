package com.people.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.people.entity.PeopleEntity;

public interface PeopleRepository extends JpaRepository<PeopleEntity, Integer>{

}
