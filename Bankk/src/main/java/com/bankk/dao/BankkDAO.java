package com.bankk.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bankk.entity.BankkEntity;
import com.bankk.repository.BankkRepository;

@Repository
public class BankkDAO {
	
	@Autowired
	BankkRepository br;
	
	public String postvalue(List<BankkEntity> a) {
		br.saveAll(a);
		return "success";
	}
	
	public List<BankkEntity> getvalue() {
		return br.findAll();
	}
	
	public BankkEntity bm(String a) {
		return br.bm(a);
	}

}
