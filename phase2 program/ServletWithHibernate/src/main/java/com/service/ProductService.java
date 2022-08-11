package com.service;
import java.util.Iterator;
import java.util.List;

import com.bean.Product;
import com.dao.ProductDao;
public class ProductService 
{
	ProductDao pd=new ProductDao();
	public String storeProduct(Product product)
	{
		if(product.getPrice()<100)
		{
			return "Product price must be>100";
		}
		else if(pd.storeProduct(product)>0)
		{
			return "Product stored successfully";
		}
		else
		{
			return "Product didn't store id must be unique";
		}
	}
	public String deleteProduct(int pid)
	{
		if(pd.deleteProduct(pid)>0)
		{
			return "product details deleted successfully";
		}
		else
		{
			return "product not present";
		}
	}
	public String updateProduct(Product product)
	{
		Product pp =pd.findProduct(product.getPid());
		if(pp==null)
		{
			return "product not present";
		}
		else if(product.getPrice()<pp.getPrice())
		{
			return "New price must be >than old price";
		}
		else if(pd.updateProduct(product)>0)
		{
			return "product details update successfully";
		}
		else
		{
			return "product didn't update";
		}
	}
	public String findProduct(int pid)
	{
		Product pp=pd.findProduct(pid);
		if(pp==null)
		{
			return "product not present";
		}
		else
		{
			return pp.toString();  // return the object in string format
		}
	}
	public List<Product> findAllProduct()
	{
		List<Product> listOfProdut =pd.findAllProduct();
		Iterator<Product> li=listOfProdut.iterator();
		while(li.hasNext())
		{
		Product p=li.next();
		p.setPrice(p.getPrice()-p.getPrice()*0.10f);
		}
		return listOfProdut;
	}
}
