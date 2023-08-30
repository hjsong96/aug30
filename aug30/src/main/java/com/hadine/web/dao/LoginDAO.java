package com.hadine.web.dao;

import org.apache.ibatis.annotations.Mapper;

import com.hadine.web.dto.LoginDTO;

@Mapper
public interface LoginDAO {

	LoginDTO login(LoginDTO dto);

}
