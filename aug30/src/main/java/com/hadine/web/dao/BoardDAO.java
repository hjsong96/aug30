package com.hadine.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hadine.web.dto.BoardDTO;

@Mapper
public interface BoardDAO {

	List<BoardDTO> list();

	BoardDTO detail(int bno);
	
}
