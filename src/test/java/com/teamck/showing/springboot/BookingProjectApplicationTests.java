package com.teamck.showing.springboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import com.teamck.showing.cmm.ApplicationDBRead;
import com.teamck.showing.domain.USER_INFO;
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
	
	@Test
	public void testUserRepostory() {
		List<USER_INFO> userList = userRepository.findAll();

		System.out.println("findAll(): "+userList.toString());
	}
}
