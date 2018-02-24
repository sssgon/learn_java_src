package com.yusys.annotation;

import java.lang.annotation.Annotation;

public class AnnotationChild implements Annotation {

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args){
		AnnotationChild a = new AnnotationChild();
		System.out.println(a.annotationType());
	}
}
