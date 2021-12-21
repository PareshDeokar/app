package com.cg.aps.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.aps.entities.GardsTranningEntity;


@Repository
public interface GardTraningDAOInt extends JpaRepository<GardsTranningEntity, Integer> {

	public long add(GardsTranningEntity bean);
	
	public void update(GardsTranningEntity bean);
	
	public void delete(GardsTranningEntity bean);
	
	public GardsTranningEntity findByName(String name);
	
	public GardsTranningEntity findByPk(long id);
	
	public List<GardsTranningEntity> search(GardsTranningEntity bean, long pageNo, int pageSize);
	
	public List<GardsTranningEntity> search(GardsTranningEntity bean);
	
	
}
