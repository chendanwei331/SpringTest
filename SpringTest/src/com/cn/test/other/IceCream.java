package com.cn.test.other;

import org.springframework.stereotype.Component;

import com.cn.test.annotation.cold;

@Component
@cold
public class IceCream implements Dessert{

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("IceCream.....");
	}

}
