package com.mark.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mark.dao.MarkDAO;
import com.mark.entity.MarkEntity;

@Service
public class MarkService {
	
	@Autowired
	MarkDAO md;	
	
	public String posValue(List<MarkEntity> a) {
		a.forEach(x-> {
			int sem1=x.getSem1Theory()+x.getSem1Practicals();
			int sem2=x.getSem2Theory()+x.getSem2Practicals();
			x.setSem1Total(sem1);
			x.setSem2Total(sem2);
		});
		return md.posValue(a);
	}

	public List<MarkEntity>getValue() {
		return md.getValue();
	}
	
	public int gettot(int a) {
		return md.gettot(a);
	}
	
	public int gettot1(int a) {
		return md.gettot1(a);
	}
	
	public List<MarkEntity>getmarks() {
		return md.getmarks();
	}
}
