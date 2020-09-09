package com.myserv.app.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.myserv.app.Model.Scientist;



@Transactional
public class ScientistDao{
	@Autowired
	SessionFactory factory;
	public ScientistDao() {
	}
	public ScientistDao(SessionFactory factory) {
		super();
		this.factory = factory;
		}
	public String saveScientist(Scientist scientist){
		try{
		Session session=factory.getCurrentSession();
		session.save(scientist);
		return "Scientist Created";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}
		return "Scientist not Created";
	}
	public Scientist getScientistById(String sid){
		try{
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("from Scientist b where b.sid=:titlePram");
		query.setParameter("titlePram", sid);
		Scientist scientist=(Scientist)query.uniqueResult();
		return scientist;
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return null;
		}
	public String updateScientistById(Scientist scientist){
		try{
		Session session=factory.getCurrentSession();

		System.out.println("scientist "+scientist);
		session.update("Scientist",scientist);
		return "Scientist Updated";
		}
		catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		}

		return "Scientist Update cannot";
		}

	
	
	public String DeleteScientistByName(String sname) {
		try {
			Session session=factory.getCurrentSession();
			String hql="delete Scientist a where a.sname=:sname";
			Query query=session.createQuery(hql);
			query.setParameter("sname",sname);
			int rs=query.executeUpdate();
			if(rs>0) {
				return "Scientist deleted";
			}
			else {
				return "scientist cannot ";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "Scientist cannot be deleted";
	}
	
	
	public Scientist getScientistByName(String sname) {
		try{
			Session session=factory.getCurrentSession();
			Query query=session.createQuery("from Scientist b where b.sname=:titlePram");
			query.setParameter("titlePram",sname);
			Scientist scientist=(Scientist)query.uniqueResult();
			return scientist;
			}
			catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}

			return null;
		
	}
	public ArrayList<Scientist> getAll(){
		try {
			Session session=factory.getCurrentSession();
			ArrayList<Scientist> sc=(ArrayList<Scientist>) session.createQuery("from Scientist").list();
			return sc;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	

}
