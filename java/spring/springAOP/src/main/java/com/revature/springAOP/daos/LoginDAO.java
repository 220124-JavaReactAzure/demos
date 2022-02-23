package com.revature.springAOP.daos;

import java.io.IOException;

import javax.persistence.NoResultException;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.revature.springAOP.models.User;
import com.revature.springAOP.util.datasource.HibernateUtil;

@Repository
public class LoginDAO {
	
	public boolean create(User newUser) {
		try {
			Session session = HibernateUtil.getSession();
			session.save(newUser);
			return true;		
		} catch (HibernateException | IOException | NoResultException e) {
			e.printStackTrace();
			return false;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public User findByUsername(String username) {
		try {
			Session session = HibernateUtil.getSession();
			Query query = session.createQuery("from User u where u.username = :username ");
			
			query.setParameter("username", username);
			
			User user = (User) query.getSingleResult();
			return user;
		} catch (HibernateException | IOException | NoResultException e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeSession();
		}
	}

	public Object findByEmail(String email) {
		try {
			Session session = HibernateUtil.getSession();
			Query query = session.createQuery("from User u where u.email = :email");
			
			query.setParameter("email", email);
			
			User user = (User) query.getSingleResult();
			return user;
		} catch (HibernateException | IOException | NoResultException e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeSession();
		}
	}


	public User findByUsernameAndPassword(String username, String password) {
		try {
			Session session = HibernateUtil.getSession();
			Query query = session.createQuery("from User u where u.username = :username and u.password = :password");
			
			query.setParameter("username", username);
			query.setParameter("password", password);
			
			User user = (User) query.getSingleResult();
			
			return user;
		} catch (HibernateException | IOException | NoResultException e) {
			e.printStackTrace();
			return null;
		} finally {
			HibernateUtil.closeSession();
		}
	}

}
