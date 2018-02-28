package com.yusys.test;

public class TestAbstractClazzImp1 extends TestAbstractClazz1 {
	public int val(){
		super.value = new char[3];
		return super.capacity();
	}
	
	public static void main(String[] args){
		TestAbstractClazzImp1 s = new TestAbstractClazzImp1();
		System.out.println(s.capacity());
		System.out.println(s.val());
	}
}
