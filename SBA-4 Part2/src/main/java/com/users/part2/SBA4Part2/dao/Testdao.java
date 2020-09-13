package com.users.part2.SBA4Part2.dao;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.users.part2.SBA4Part2.Model.dxc_users;

@Component
@Transactional
public class Testdao {
	@Autowired
	SessionFactory sessionFactory;
	
	public String Validate(String userId,String password) {
		try
		{
		Session session=sessionFactory.getCurrentSession();
		Query query=session.createQuery("select password from dxc_users d where d.user_id=:userId");
		query.setParameter("userId",userId);
		String pass=(String)query.uniqueResult();
		System.out.println(pass);
		if(pass.equals(password)) {
			return "valid";
		}
		else {
			return "invalid";
		}
		
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		return "No value";
	}
	
	public String saveusers(dxc_users users) {
		try{
			Session session=sessionFactory.getCurrentSession();
			session.save(users);
			return "users Created";
			}
			catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			}
			return "Users not Created";
	}
	
	public String forgotpassword(String uid,String qs,String ans) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from dxc_users d where d.user_id=:uid");
			query.setParameter("uid",uid);
			dxc_users an=(dxc_users)query.uniqueResult();
			System.out.println(an);
			if(uid.equals(an.getUser_id()) && qs.equals(an.getSecurity_question()) && ans.equalsIgnoreCase(an.getSecurity_answer())) {
				return "valid";
			}
			else {
				return "invalid";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "unable to update";
	}
	
	
	public String updateuser(String uid,String pass)
	{
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("update dxc_users set password=:pass where user_id=:uid");
			query.setParameter("pass",pass);
			query.setParameter("uid",uid);
			int i=query.executeUpdate();
			if(i>0) {
				return "user updated";
			}
			else {
				return "user not Updated";
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return "unable to update user";
	}

}
