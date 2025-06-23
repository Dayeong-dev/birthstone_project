package com.example.birthstone.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.birthstone.dto.BirthstoneDTO;

@Mapper
public interface IBirthstoneDao {

	@Select("SELECT * FROM tbl_birthstone")
	public List<BirthstoneDTO> getAllBirthstone();

	@Select("SELECT * FROM tbl_birthstone WHERE month = #{month}")
	public BirthstoneDTO getBirthstoneByMonth(@Param("month") Integer month);
}
