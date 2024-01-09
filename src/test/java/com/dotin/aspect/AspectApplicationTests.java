package com.dotin.aspect;

import com.dotin.aspect.business.Business1;
import com.dotin.aspect.business.Business2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AspectApplicationTests {

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	@Test
	void contextLoads() {
		business1.calculateSomething();	//Joint point
		business2.calculateSomething();	//Joint point
	}

}
