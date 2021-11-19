package com.mega.finance;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.batch.MyBatisBatchItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class FinanceDAO {

	@Autowired
	SqlSessionTemplate mybatis;
	
	public void insert(FinanceDTO financeDTO) {
		mybatis.insert("finance.create",financeDTO);
		
		
	}
	
	
	
	
	
}
