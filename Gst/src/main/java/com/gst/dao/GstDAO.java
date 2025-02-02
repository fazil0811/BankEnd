package com.gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gst.entity.GstEntity;
import com.gst.repository.GstRepository;

@Repository
public class GstDAO {
	
	@Autowired
	GstRepository gr;
	
	public String posValue(List<GstEntity> a) {
		gr.saveAll(a);
		return "post success";
	}
	
	public int getPer(int a) {
		return gr.getPer(a);
	}

}
