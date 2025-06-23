package com.example.birthstone.service;

import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.birthstone.dao.IBirthstoneDao;
import com.example.birthstone.dto.BirthstoneDTO;

@SpringBootTest
public class TestBirthstoneService {
	
	@Autowired
	private IBirthstoneDao birthstoneDao;

	@Test
	public void setDummies() {
		String[] names = {"가넷", "자수정", "아쿠아마린", "다이아몬드", "에메랄드", "진주", "루비", "페리도트", "사파이어", "오팔", "토파즈", "터키석"};
		String[] engNames = {"Garnet", "Amethyst", "Aquamarine", "Diamond", "Emerald", "Pearl", "Ruby", "Peridot", "Sapphire", "Opal", "Topaz", "Turquoies"};
		
		IntStream.rangeClosed(0, 11).forEach(i -> {
			BirthstoneDTO birthstoneDTO = BirthstoneDTO.builder()
					.month(i + 1)
					.name(names[i])
					.engName(names[i])
					.description(names[i] + "은 " + (i + 1) + "월의 탄생석 입니다. ")
					.imageURL("https://cafe24.poxo.com/ec01/bettershop/pdHAR3Nfo463PahlnCQH4kgxUHaOOM8ocnCbkxY0IXo/IaFhYopE1nOgcj+Nq2hA3jG5AveXOMSmifLxJw5MkQ==/_/web/upload/m_SG/img/n_img/" + (i + 1) + "m_img.gif")
					.build();
			
			birthstoneDao.setBirthstone(birthstoneDTO);
		});
	}
}
