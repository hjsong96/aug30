package com.hadine.web;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hadine.web.dto.LoginDTO;
import com.hadine.web.service.LoginService;

@SpringBootTest
class Aug30ApplicationTests {
	
	//Junit = 자바에서 독립된 단위테스트를 지원해주는 프레임워크
	//단정(assert) 메소드로 테스트 케이스의 수행결과를 판별한다.
	//jUnit4 이후부터는 테스트를 지원 어노테이션을 제공한다. (@Test @Before @After 등)
	//@Test 메서드가 호출할 때마다 새로운 인스턴스를 생성하여 독립적인 테스트가 이루어지게 한다.

	@Autowired
	LoginService loginService;
	
	
	@Test
	@DisplayName("처음 테스트 해봐요")
	void contextLoads() {
		//DTO에 값을 담아서 DB에 물어보면 정말 값이 와요?
		LoginDTO dto = new LoginDTO();
		dto.setId("siggy");
		dto.setPw("12345");
		
		LoginDTO result = loginService.login(dto);
		
		assertEquals(result.getM_name(), "정식");
		//assertNotNull(result); //통신이 제대로 안돼서 null 값이 들어왔어?
		//assertSame(dto, result); //두 개 객체 똑같아?
	}

}
