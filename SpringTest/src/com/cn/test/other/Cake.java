package com.cn.test.other;

import org.springframework.stereotype.Component;

@Component

public class Cake implements Dessert{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Cake......");
	}

}
