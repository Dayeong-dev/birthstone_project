package com.example.birthstone.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BirthstoneDTO {
	private Integer month;
	private String name;
	private String engName;
	private String description;
	private String imageURL;
}
