package com.yrd980.chapter16;

/**
 * @author Yrd
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class CpuNumber {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		//获取当前电脑cpu数量
		int CpuNum = runtime.availableProcessors();
		System.out.println(CpuNum);
	}
}
