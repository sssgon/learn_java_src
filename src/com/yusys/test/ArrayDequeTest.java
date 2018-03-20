package com.yusys.test;

import java.util.ArrayDeque;
import java.util.Collection;

/**
 * ArrayDeque²âÊÔÀà
 * @author ÓñÅô
 *
 */
public class ArrayDequeTest {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		int initialCapacity ;
		int numElements = 99;
		initialCapacity = numElements;
        initialCapacity |= (initialCapacity >>>  1);
        initialCapacity |= (initialCapacity >>>  2);
        initialCapacity |= (initialCapacity >>>  4);
        initialCapacity |= (initialCapacity >>>  8);
        initialCapacity |= (initialCapacity >>> 16);
        initialCapacity++;
        
        System.out.println(initialCapacity);
	}
	
	public static <E> void main(String[] args){
		E a = null;
		System.out.println(a);
		
	}

}
