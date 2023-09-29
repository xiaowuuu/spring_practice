package com.codeclan.example.teaservice;

import com.codeclan.example.teaservice.models.Biscuit;
import com.codeclan.example.teaservice.models.Tea;
import com.codeclan.example.teaservice.repository.BiscuitRepository;
import com.codeclan.example.teaservice.repository.TeaRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TeaserviceApplicationTests {
	@Autowired
	TeaRepository teaRepository;
	@Autowired
	BiscuitRepository biscuitRepository;

	@Test
	void contextLoads() {
	}
	@Test
	public void createTea(){
		Tea tea = new Tea("Long Jing", "new brand");
		teaRepository.save(tea);
	}
	@Test
	public void createBiscuit(){
		Biscuit biscuit = new Biscuit("Jaffa cake", "Mcvita");
		biscuitRepository.save(biscuit);
	}
}
