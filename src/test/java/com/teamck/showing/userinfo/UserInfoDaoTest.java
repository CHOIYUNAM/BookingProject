package com.teamck.showing.userinfo;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.teamck.showing.domain.USER_INFO;
import com.teamck.showing.repository.UserInfoRepository;

@SpringBootTest
@TestPropertySource("classpath:application.yml")
public class UserInfoDaoTest {
	@Autowired
	UserInfoRepository userInfoRepository;
	
	@Test
	public void deleteAndSaveAndFindAll() throws SQLException {
		USER_INFO user1 = USER_INFO.builder()
				.u_ID("TEST_ID")
				.u_NAME("TEST_NAME")
				.u_PW("TEST_PASSWORD")
				.u_PNUM("TEST_PNUM")
				.build();
		
		// assertNotNull(userInfoRepository.findAll());
		
		userInfoRepository.deleteByUId("TEST_ID");
		
		
		if(userInfoRepository.save(user1) == null) System.out.println("등록 실패");
		else System.out.println("등록 성공");
		
		System.out.println(userInfoRepository.findAll());
	}
}
