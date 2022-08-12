package com.teamck.showing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamck.showing.domain.SHOW_INFO;

@Repository
public interface ShowInfoRepository extends JpaRepository<SHOW_INFO, Integer> {

}
