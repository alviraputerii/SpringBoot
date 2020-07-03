package com.vr.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.vr.demo.model.User;
import com.vr.demo.service.UserService;

@Component
public class UserRunner implements CommandLineRunner {

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		try {
			User user1 = new User("Nic", "Ops", 12000L);
			User user2 = new User("Ign", "Tech", 22000L);
			userService.insert(Arrays.asList(user1, user2));
		} catch (RuntimeException exception) {
			System.out.println("Exception in batch 1 ...!" + exception);
		}

		try {
			User user3 = new User("This Voyya", "Tech", 32000L);
			User user4 = new User("Noyya", "Ops", 18000L);
			userService.insert(Arrays.asList(user3, user4));
		} catch (RuntimeException exception) {
			System.out.println("Exception in batch 2..!" + exception);
		}

		System.out.println(userService.getUsers());
	}

}
