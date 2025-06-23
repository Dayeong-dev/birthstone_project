package com.example.birthstone.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.birthstone.dto.BirthstoneDTO;
import com.example.birthstone.service.BirthstoneService;

@Controller
public class BirthstoneController {
	private final BirthstoneService birthstoneService;
	
	public BirthstoneController(BirthstoneService birthstoneService) {
		this.birthstoneService = birthstoneService;
	}
	
	@GetMapping("/")
	public String root() {
		System.out.println("root......");
		
		return "index";
	}
	
	// 탄생석 목록 조회
	@GetMapping("/birthstone/all")
	public String getAllBirthstone(Model model) {
		List<BirthstoneDTO> blist = birthstoneService.getAllBirthstone();
		
		model.addAttribute("birthstoneList", blist);
		for(BirthstoneDTO birthstone : blist) {
			System.out.println(birthstone);
		}
		
		return "birthstoneList";
	}
	
	// 탄생석 상세 조회 : 파라미터로 month 값 전달
	@GetMapping("/birthstone/detail")
	public String getBirthstoneDetail(@RequestParam("month") Integer month, Model model) {
		BirthstoneDTO birthstone = birthstoneService.getBirthstoneByMonth(month);
		model.addAttribute("birthstone", birthstone);
		
		return "birthstoneDetail";
	}
	
	// 탄생석 상세 조회 : 파라미터로 이름, 생년월일 값 전달
	@PostMapping("/birthstone/search")
	public String getBirthstonDetail(@RequestParam("name") String name, @RequestParam("month") int month, Model model) {
		BirthstoneDTO birthstone = birthstoneService.getBirthstoneByMonth(month);
		
		model.addAttribute("name", name);
		model.addAttribute("birth", month);
		model.addAttribute("birthstone", birthstone);
		
		return "birthstoneDetail";
	}
}
