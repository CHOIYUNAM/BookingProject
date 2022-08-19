package com.teamck.showing.userBooking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.teamck.showing.repository.UserBookingRepository;
import com.teamck.showing.repository.UserInfoRepository;

@SpringBootTest
@TestPropertySource("classpath:application.yml")
public class UserBookingDaoTest {
	@Autowired
	UserBookingRepository userBookingRepository;
	
	@Autowired
	UserInfoRepository userInfoRepository;
	
	@Test
	public void InsertAndFindAll() {
//		USER_INFO user1 = USER_INFO.builder()
//				.u_ID("TEST_ID")
//				.u_NAME("TEST_NAME")
//				.u_PW("TEST_PASSWORD")
//				.u_PNUM("TEST_PNUM")
//				.build();
//		
//		USER_BOOKING userbooking = USER_BOOKING.builder()
//				.uB_TITLE("TEST_UBTITLE1")
//				.uB_SEATNUM("A01")
//				.uB_STATE('0')
//				.sTART_DATE(new Date())
//				.userInfo(userInfoRepository.findByUId("TEST_ID"))
//				.build();
//		
//		if(userBookingRepository.save(userbooking) == null) System.out.println("등록 실패");
//		else System.out.println("등록 성공");
		
		System.out.println(userBookingRepository.findById(1).toString());
	}
}
