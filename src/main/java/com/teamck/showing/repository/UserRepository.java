package com.teamck.showing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamck.showing.domain.USER_INFO;

@Repository
public interface UserRepository extends JpaRepository<USER_INFO, Integer>{

}
