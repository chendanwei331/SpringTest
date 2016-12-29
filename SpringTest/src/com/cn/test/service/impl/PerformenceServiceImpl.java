package com.cn.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.test.annotation.cold;
import com.cn.test.bo.AAA;
import com.cn.test.dao.AaaDao;
import com.cn.test.service.IPerformanceService;

@Service("performenceService")
public class PerformenceServiceImpl implements IPerformanceService{

	@Autowired
	private AaaDao aaaDao;
	
	@cold
	@Override
	public String testPerformence(){
		return "performence";
	}

	@Override
	public List<AAA> testHibernate() {
		// TODO Auto-generated method stub
		return aaaDao.findAll();
	}
}
