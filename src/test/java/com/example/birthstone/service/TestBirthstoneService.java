package com.example.birthstone.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.birthstone.dto.BirthstoneDTO;

@SpringBootTest
public class TestBirthstoneService {
	
	@Autowired
	private BirthstoneService birthstoneService;

	//@Test
	public void testGetList() {
		List<BirthstoneDTO> blist = birthstoneService.getAllBirthstone();
		
		for(BirthstoneDTO b : blist) {
			System.out.println(b);
		}
	}
	
	//@Test
	public void testGetDetail() {
		int month = 11;
		
		BirthstoneDTO b = birthstoneService.getBirthstoneByMonth(month);
		System.out.println(b);
	}
}
