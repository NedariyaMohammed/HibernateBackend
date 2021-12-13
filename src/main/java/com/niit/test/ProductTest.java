package com.niit.test;

import com.niit.daoimpl.ProductDAOImpl;
import com.niit.model.Product;

public class ProductTest 
{
	ProductDAOImpl pdi=new ProductDAOImpl();
	public void add() 
	{
		 
		 pdi.addProduct(new Product("iphone x",65000));
		
	 }
	
	public void delete()
	{
		Product p=new Product();
		p.setProductid(1);
		pdi.deleteProduct(p);	
	}
	
	public void update()
	{
		Product p=new Product();
		p.setProductname("samsung Note 9" );
		p.setProductid(1);
		p.setPrice(40000);
		pdi.updateProduct(p);
	}
	  public static void main(String[] args) 
	  {
		ProductTest pt=new ProductTest();
		pt.delete();
	  }
}
