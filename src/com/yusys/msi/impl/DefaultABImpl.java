package com.yusys.msi.impl;

import com.yusys.msi.DefaultInterfaceA;
import com.yusys.msi.DefaultInterfaceB;

public class DefaultABImpl implements DefaultInterfaceA,DefaultInterfaceB{

	@Override
	public String foo() {
		//两个接口有同名的foo方法，实现类实现自己的foo方法
		//return  "DefaultABImpl";
		//两个接口有同名的foo方法，实现类使用DefaultInterfaceA接口的foo方法
		return DefaultInterfaceA.super.foo();
	}
	
	public static void main(String[] args){
		DefaultABImpl dab = new DefaultABImpl();
		System.out.println(dab.foo());
	}

}
