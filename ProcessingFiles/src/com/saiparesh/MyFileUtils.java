package com.saiparesh;

public class MyFileUtils {
	 public static int subtract10FromLargerNumber(int number) throws Exception {
		 if(number < 10) {
			 throw new Exception("Number should be greater than 10");
		 }
		 return number - 10;
	 }
}
