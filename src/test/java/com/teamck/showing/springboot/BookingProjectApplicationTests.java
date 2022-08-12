package com.teamck.showing.springboot;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.teamck.showing.cmm.ApplicationDBRead;
import com.teamck.showing.domain.SHOW_INFO;
import com.teamck.showing.domain.USER_INFO;
import com.teamck.showing.repository.ShowInfoRepository;
import com.teamck.showing.repository.UserRepository;

@SpringBootTest
@TestPropertySource("classpath:application.yml")
class BookingProjectApplicationTests {

	@Autowired
	private ApplicationDBRead applicationDBRead;

//	@Autowired
//	DataSource dataSource;
	
	void contextLoads() throws SQLException, ClassNotFoundException{
		final String DRIVER = applicationDBRead.getDatasource().getDriverClassName();
		final String URL = applicationDBRead.getDatasource().getUrl();
		final String USER = applicationDBRead.getDatasource().getUsername();
		final String PW = applicationDBRead.getDatasource().getPassword();
		
		Class.forName(DRIVER);
		
		try(Connection conn = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("conn :"+conn);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Autowired
	UserRepository userRepository;
	
//	@Test
//	public void testUserRepostory() {
//		List<USER_INFO> userList = userRepository.findAll();
//
//		System.out.println("findAll(): "+userList.toString());
//	}
	
	@Autowired
	ShowInfoRepository showInfoRepository;
	
	@Test
	public void testShowRepository() throws SQLException {
		
		Blob abc = null;
        int a = 123;
        byte[] abcc = {(byte) a, (byte) a}; 
        abc.setBytes(1, abcc);
        
		SHOW_INFO show1 = SHOW_INFO.builder()
				.SI_NAME("TESTSHOW1")
				.SI_CODE('0')
				.SI_RATING('0')
				.SI_PRICE(3000)
				.SI_RUNTIME(120)
				.SI_ACTOR("김태욱")
				.SI_THEATER("서울")
				.SI_POSTER(abc)
				.SI_CONTEXT("테스트중")
				.START_DATE(new Date())
				.REG_DT(new Date())
				.build();
		
		showInfoRepository.save(show1);
		
		List<SHOW_INFO> showList = showInfoRepository.findAll();
		System.out.println(showList);
	}
}
