package com.service;

import java.util.Iterator;
import java.util.List;

import com.bean.Eproduct;
import com.dao.EproductDao;

public class EproductService
{
	EproductDao ed = new EproductDao();
    public String storeEproduct(Eproduct ep) 
    {
        if(ep.getPrice()<10000) 
        {
            return "Eproduct price must be > 10000";
        }
        else if(ed.storeEproduct(ep)>0)
        {
            return "Record inserted successfully";
        }
        else 
        {
            return "Record didn't insert";
        }
    }
    public List<Eproduct> getAllEproduct() 
    {
        List<Eproduct> listOfEp = ed.getAllEproduct();
        Iterator<Eproduct> li = listOfEp.iterator();
        while(li.hasNext()) 
        {
            Eproduct emp = li.next();
            emp.setPrice(emp.getPrice());
        }
        
        return listOfEp;
    }
	
	
}