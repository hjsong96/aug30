package com.hadine.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hadine.web.dao.BoardDAO;
import com.hadine.web.dto.BoardDTO;

@Service
public class BoardService {

	@Autowired
	private BoardDAO boardDAO;

	public List<BoardDTO> list() {
		return boardDAO.list();
	}

	public BoardDTO detail(int bno) {
		return boardDAO.detail(bno);
	}
	
}
