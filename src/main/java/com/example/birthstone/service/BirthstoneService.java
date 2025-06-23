package com.example.birthstone.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.birthstone.dao.IBirthstoneDao;
import com.example.birthstone.dto.BirthstoneDTO;

@Service
public class BirthstoneService {
	private final IBirthstoneDao birthstoneDao;
	
	public BirthstoneService(IBirthstoneDao birthstoneDao) {
		this.birthstoneDao = birthstoneDao;
	}

	public List<BirthstoneDTO> getAllBirthstone() {
		List<BirthstoneDTO> blist = birthstoneDao.getAllBirthstone();
		
		return blist;
	}

	public BirthstoneDTO getBirthstoneByMonth(Integer month) {
		BirthstoneDTO birthstone = birthstoneDao.getBirthstoneByMonth(month);
		
		return birthstone;
	}

	public BirthstoneDTO getBirthstoneByBirth(String birth) {
		LocalDate date = getLocalDate(birth);
		int month = date.getMonthValue();
		
		BirthstoneDTO birthstone = birthstoneDao.getBirthstoneByMonth(month);
		
		return birthstone;
	}
	
	private LocalDate getLocalDate(String birth) {
		List<DateTimeFormatter> fomatters = List.of(
			DateTimeFormatter.ofPattern("yyyy-MM-dd"), 
			DateTimeFormatter.ofPattern("yyyy/MM/dd"), 
			DateTimeFormatter.ofPattern("yyyy.MM.dd"), 
			DateTimeFormatter.ofPattern("yyyyMMdd")
		);
		
		for(DateTimeFormatter fomatter : fomatters) {
			try {
				return LocalDate.parse(birth, fomatter);				
			} catch(Exception e) {}
		}
		
		throw new IllegalArgumentException("입력한 날짜가 날짜 형식이 아닙니다. ");
	}
	
	
}
