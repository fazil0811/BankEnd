package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.entity.BankEntity;

public interface BankRepository extends JpaRepository<BankEntity,Integer>{

	@Query(value="select branch from bank where ifsccode=?", nativeQuery=true)
	public String getBrnch(String a);

}
