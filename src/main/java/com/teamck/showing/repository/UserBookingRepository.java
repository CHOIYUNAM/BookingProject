package com.teamck.showing.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teamck.showing.domain.USER_BOOKING;

@Repository
public interface UserBookingRepository extends JpaRepository<USER_BOOKING, Integer>{
}
