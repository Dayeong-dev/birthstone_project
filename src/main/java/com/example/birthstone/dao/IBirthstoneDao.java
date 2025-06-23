package com.example.birthstone.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.example.birthstone.dto.BirthstoneDTO;

@Mapper
public interface IBirthstoneDao {

	@Select("SELECT * FROM tbl_birthstone")
	public List<BirthstoneDTO> getAllBirthstone();

	@Select("SELECT * FROM tbl_birthstone WHERE month = #{month}")
	public BirthstoneDTO getBirthstoneByMonth(@Param("month") Integer month);
	
	@Insert("INSERT INTO tbl_birthstone(MONTH, NAME, ENGNAME, DESCRIPTION, Image_url) VALUES (#{bs.month}, #{bs.name}, #{bs.engName}, #{bs.description}, #{bs.imageURL})")
	public void setBirthstone(@Param("bs") BirthstoneDTO bs);
	
	@Update("UPDATE tbl_birthstone SET NAME = #{name} WHERE MONTH = #{month}")
	public void updateBirthstoneName(@Param("name") String name, @Param("month") Integer month);
	
//	@Delete("DELETE FROM tbl_birthstone WHERE MONTH = #{month}")
//	public void deleteBirthstone(@Param("month") Integer month);
}
