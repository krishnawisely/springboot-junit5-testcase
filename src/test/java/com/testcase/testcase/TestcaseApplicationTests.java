package com.testcase.testcase;

import com.testcase.testcase.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@ExtendWith(MockitoExtension.class)
class TestcaseApplicationTests {

	@InjectMocks
	UserService userService;

	@Test
	void getUserAgeById() {
		Long val = userService.getUserAgeById();
		Assertions.assertEquals(23L,val);
	}

}
