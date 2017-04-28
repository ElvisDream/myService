package com.wode.server.impl;

import javax.jws.WebService;

import com.wode.server.MyWebService;

@WebService(endpointInterface = "com.wode.server.MyWebService")
public class MyWebServiceImpl implements MyWebService {

	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		return a+b;
	}

	public int minus(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		return a-b;
	}

}
