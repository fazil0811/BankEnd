package com.bankk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bankk.dao.BankkDAO;
import com.bankk.entity.BankkEntity;

@Service
public class BankkService {
	
	@Autowired
	BankkDAO bd;
	
	public String postvalue(List<BankkEntity> a) {
		return bd.postvalue(a);
	}
	
	public List<BankkEntity> getvalue() {
		return bd.getvalue();
	}
	
	public BankkEntity bm(String a) {
		return bd.bm(a);
	}

}
