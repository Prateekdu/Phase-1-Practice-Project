package com.main;

import com.bean.Eproduct;
import com.service.EproductService;


public class EproductTest {
	public static void main(String args[])
	{
		Eproduct ep1 = new Eproduct();
        ep1.setId(1);
        ep1.setName("mi tv");
        ep1.setPrice(12000);
        ep1.setId(2);
        ep1.setName("mi phone");
        ep1.setPrice(11000);
        
        EproductService esp = new EproductService();
        String r =  esp.storeEproduct(ep1);
        System.out.println(r);


	}
}
