package com.ksf.seasonfood.daoxml;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ParsingXmlDao {
	public void insertApiData(String xmlData);
}
