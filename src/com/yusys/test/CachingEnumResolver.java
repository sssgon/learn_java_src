package com.yusys.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CachingEnumResolver {
	//��̬ʵ����һ��������ɴ�������
    private static final CachingEnumResolver SINGLE_ENUM_RESOLVER = new
    CachingEnumResolver();
    /*MSGCODE->Category�ڴ�����*/
    private static Map CODE_MAP_CACHE;
    static {
        CODE_MAP_CACHE = new HashMap();
        //Ϊ��˵������,���������ʼ��һ������
        CODE_MAP_CACHE.put("0","������");
    }
     
    //private, for single instance
    private CachingEnumResolver() {
        //��ʼ����������  �������⣬�÷���ҲҪ��������
        initEnums();
    }
     
    /**
     * ��ʼ�����е�ö������
     */
    public static void initEnums() {        
        // ~~~~~~~~~��������￪ʼ��¶ ~~~~~~~~~~~//
        if (null == CODE_MAP_CACHE) {
            System.out.println("CODE_MAP_CACHEΪ��,���������￪ʼ��¶.");
            CODE_MAP_CACHE = new HashMap();
        }
        CODE_MAP_CACHE.put("1", "������");
        CODE_MAP_CACHE.put("2", "����ʡ");
         
        //..... other code...
    }
     
    public Map getCache() {
        return Collections.unmodifiableMap(CODE_MAP_CACHE);
    }
     
    /**
     * ��ȡ��̬ʵ��
     * 
     * @return
     */
    public static CachingEnumResolver getInstance() {
        return SINGLE_ENUM_RESOLVER;
    }
     
    public static void main(String[] args) {
        System.out.println(CachingEnumResolver.getInstance().getCache());
    }
}
