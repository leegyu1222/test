package com.work.spring03.util;

import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utility {
	public static String toKorEncoding(String data){
		try {
			String username = new String(data.getBytes("8859_1"), "euc-kr");
			return username;
		} catch (UnsupportedEncodingException e) {
			
			System.out.println(e.getMessage());
		}
		return data;
	}
   
   /**
    * �⺻ 4�ڸ� ���������� ���ڿ��� ��ȯ�ϴ� �޼���
    * @see java.lang.Math#random()
    * @see java.util.Random#nextInt()
    * @see java.lang.System.currentTimeMillis()
    * @see java.lang.StringBuilder
    * 
    * @return
    */
   public static String getSecureCode() {
      return getSecureCode(4);
   }
   
   /** 
    * ���޹��� ������ ������ ���ȹ��� ��ȯ
    * @param length
    * @return
    */
   public static String getSecureCode(int length) {
      Random random = new Random((long)(System.currentTimeMillis()*Math.random()));
      StringBuilder code = new StringBuilder();
      for(int i = 0; i < 4; i++){
         code.append(random.nextInt(10));
      }
      return code.toString();
   }
   
   /**
    * ���� ��¥�� �⵵4�ڸ�/��2�ڸ�/��2�ڸ� ����
    * @see java.util.Date
    * @see java.text.SimpleDateFormat#format(java.util.Date)
    * @return
    */
   public static String getCurrentDate() {
      return getCurrentDate("yyyy/MM/dd");
   }
   
   public static String getCurrentDate(String pattern) {
      Date date = new Date();
      SimpleDateFormat sdf  = new SimpleDateFormat(pattern);
      return sdf.format(date);
   }
   
   /**
	 * ù2���ڸ� ������ ���ڴ� * ��ȣ ��ü ��ȯ
	 * @param data
	 * @return
	 */
	public static String getSecureString(String data) {
		StringBuilder info = new StringBuilder(data.substring(0, 2));
		for(int i=2; i < data.length(); i++) {
			info.append("*");
		}
		
		return info.toString();
	}
	
	/**
	 * 2��¥�� ����, �������� ���� ������ ���ڿ� ��ȯ
	 * @param length
	 * @return
	 */
	public static String getSecureCodeString(int length) {
		Random random = new Random((long)(System.currentTimeMillis() * Math.random()));
		StringBuilder code = new StringBuilder();
		
		for(int i=0; i < length; i++) {
			if(i < 2) {
				code.append((char)(random.nextInt(26) + 65)) ;  // �����빮��
			} else {
				code.append(random.nextInt(10));  // 0 ~ 9
			}
		}
		return code.toString();
	}
}
