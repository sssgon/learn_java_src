package com.yusys.test;

import java.io.File;
import java.lang.management.ClassLoadingMXBean;
import java.lang.management.CompilationMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.OperatingSystemMXBean;
import java.lang.management.RuntimeMXBean;
import java.lang.management.ThreadMXBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;


public class Test extends Constance {

	protected String name = "Test";
	static int i;
	
	public static void main(String[] args){
		/*ArrayList l = new ArrayList();
		l.add("a");
		l.add(1);
		l.add(2d);
		ArrayList c = null;
		ArrayList a = new ArrayList(c);
		for (Object obj : a) {
			System.out.println(obj);
		}*/
		/*
		ArrayList l = new ArrayList();
		l.add(3);
		l.add(1);
		l.add(null);
		l.add(2);
		l.add(null);
		Object[] elementData = l.toArray();
		//System.out.println(elementData.getClass());
		//System.out.println(Object[].class);
		l.trimToSize();
		//Arrays.copyOf(elementData, elementData.length, String[].class);
		for (Object obj : l) {
			System.out.println(obj);
		}
		
		ArrayList ll = (ArrayList)l.clone();
		
		System.out.println(ll.lastIndexOf(null));
		*/
		
		/* String str = "hello";
		 System.out.println(str.hashCode());
		
		 ConcurrentHashMap chm = new ConcurrentHashMap();
		 for(int i=0;i<100;i++){
			 chm.put(i, Math.random());
		 }
		
		 Set set = chm.entrySet();
		 Iterator it = set.iterator();
		 while(it.hasNext()){
			 Entry entry = (Entry)it.next();
			 Object key = entry.getKey();
			 Object value =  entry.getValue();
			 System.out.println("key="+key+";value="+value);
		 }*/
		
		/*String[] st = null;//"".split("|");
		for(int i=0;st!=null&&i<st.length;i++){
			 System.out.println(st[i]);
		 }
		System.out.println(st);*/
		/*
		BigDecimal cumuAmount = new BigDecimal(0);
		System.out.println(cumuAmount);
		cumuAmount.add(new BigDecimal(2));
		*/
		/*String str = null;
		if(str ==null && "".equals(str)){
			System.out.println("1");
		}else{
			System.out.println("2");
		}*/
		/*ArrayList l = new ArrayList();
		l.add(1);
		l = null;
		if(l !=null || l.size()>0){
			System.out.println("1");
		}else{
			System.out.println("2");
		}*/
		
		/*String line = "";
		String[] a = line.split("\\|");
		for(int b=0;b<a.length;b++){
			System.out.println(a[b]);
		}*/
		
		/*Constance c = null;
		if(c.equals(null)){
			System.out.println(1);
		}else{
			System.out.println(2);
		}*/
		
		/*String legend = "";
		if (legend != "") {
			legend.toString().substring(0, legend.toString().length() - 1).split(",");
		}else{
			System.out.println("lalal");
		}
		*/
		
		/*String Bootstrap_Loader = System.getProperty("sun.boot.class.path");
		System.out.println(Bootstrap_Loader);
		String Extended_Loader = System.getProperty("java.ext.dirs");
		System.out.println(Extended_Loader);
		String AppClass_Loader = System.getProperty("java.class.path");
		System.out.println(AppClass_Loader);
		
		Bootstrap_Loader.split("|");*/
		
	}
	
	public void print(){
		System.out.println(name);
	}
}
