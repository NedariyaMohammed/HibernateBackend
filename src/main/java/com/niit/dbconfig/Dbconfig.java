package com.niit.dbconfig;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.property.access.spi.SetterFieldImpl;
import org.hibernate.service.ServiceRegistry;

import com.niit.model.Product;
import com.niit.model.User;

import net.bytebuddy.asm.Advice.AssignReturned.Handler.Factory;

public class Dbconfig 
{
   private static SessionFactory factory=null;
   
   
   
   static 
      {
	    loadSessionFactory();
	   
       }
   
   public static void loadSessionFactory()
   {
	   Configuration conf=new Configuration();
	   conf.configure("hibernate.cfg.xml");
	   conf.addAnnotatedClass(User.class);
	   conf.addAnnotatedClass(Product.class);
	   ServiceRegistry registry=new StandardServiceRegistryBuilder().applySettings(conf.getProperties()).build();
	   factory =conf.buildSessionFactory(registry);
	   
   }
   
   public static Session getSession() 
   {
	   return factory.openSession();
	   
   }


}
