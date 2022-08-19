package com.teamck.showing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.teamck.showing.domain.USER_INFO;

@Repository
public interface UserInfoRepository extends JpaRepository<USER_INFO, Integer>{
	@Modifying
	@Transactional
	@Query("DELETE FROM USER_INFO WHERE U_ID = :uId")
	public void deleteByUId(@Param("uId") String uId);
	
	@Query("SELECT U_SEQ FROM USER_INFO ui WHERE U_ID = :uId")
	public Integer findSeqByUId(@Param("uId") String uId);
	
	@Query("SELECT ui FROM USER_INFO ui WHERE U_ID = :uId")
	public USER_INFO findByUId(@Param("uId") String uId);
}
