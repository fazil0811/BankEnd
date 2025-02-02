package com.gst.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gst.entity.GstEntity;

public interface GstRepository extends JpaRepository<GstEntity, Integer> {

	@Query(value = "select percentage from gst where hsn_code=?", nativeQuery = true)
	public int getPer(int a);

}
