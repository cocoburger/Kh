package com.vari.controller;

public class DataOverflow {

	public static void main(String[] args) {
		//byte bnum = 125; This is data overflow.
		int bnum = 125;
		for(int i = 0; i<220000000; i++) {
			bnum+=10000;
			System.out.println(++bnum);
		}



	}

}
