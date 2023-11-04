package com.projectx.dododoc;

import com.projectx.dododoc.User_Input.InputRepository;
import com.projectx.dododoc.User_Input.User_Input;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DododocApplicationTests {

	@Autowired
	private InputRepository Input_Repository;

	@Test
	void testJpa() {
		User_Input I1 = new User_Input();
		I1.setUser_input("Hello");
		this.Input_Repository.save(I1);
	}

}
