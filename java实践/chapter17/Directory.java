package com.yrd980.chapter17;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Directory {
	public static void main(String[] args) {

	}

	@Test

	public void m1(){
		String filename = "d:\\news01.txt";
		File file = new File(filename);
		if(file.exists()){
			if(file.delete()){
				System.out.println("successful");
			}
			else {
				System.out.println("fail");
			}
		}else {
			System.out.println("blank");
		}


	}
}
