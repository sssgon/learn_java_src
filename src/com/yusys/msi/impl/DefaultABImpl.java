package com.yusys.msi.impl;

import com.yusys.msi.DefaultInterfaceA;
import com.yusys.msi.DefaultInterfaceB;

public class DefaultABImpl implements DefaultInterfaceA,DefaultInterfaceB{

	@Override
	public String foo() {
		//�����ӿ���ͬ����foo������ʵ����ʵ���Լ���foo����
		//return  "DefaultABImpl";
		//�����ӿ���ͬ����foo������ʵ����ʹ��DefaultInterfaceA�ӿڵ�foo����
		return DefaultInterfaceA.super.foo();
	}
	
	public static void main(String[] args){
		DefaultABImpl dab = new DefaultABImpl();
		System.out.println(dab.foo());
	}

}
