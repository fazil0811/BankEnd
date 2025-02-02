package com.gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gst.dao.GstDAO;
import com.gst.entity.GstEntity;

@Service
public class GstService {
	
	@Autowired
	GstDAO gd;
	
	public String posValue(List<GstEntity> a) {
		return gd.posValue(a);
	}

	public int getPer(int a) {
		return gd.getPer(a);
	}
}
