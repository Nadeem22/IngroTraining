package com.train.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.train.entity.Admin;
import com.train.entity.TrainBooking;
import com.train.entity.TrainPassengerListView;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String checkAdmin(String user, String pass) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession
				.createQuery("from Admin where username =: uname and password =:pswd ", Admin.class);
		query.setParameter("uname", user);
		query.setParameter("pswd", pass);
		 

		if((Admin) query.uniqueResult()!=null) {
			return "true";
		}else {
		return "false";
		}
	}

	@Override
	public List<TrainPassengerListView> getTrainPassengerList() {
		Session currentSession = sessionFactory.getCurrentSession();
		
		   Query query = currentSession.createQuery("from TrainPassengerListView");
		   List<TrainPassengerListView> trainPassengerList = query.getResultList();
		return trainPassengerList;
	}

	@Override
	public String cancelTicket(String contact) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query query = currentSession.createQuery("from TrainBooking where "
				+ "passengerContact=:contact ",TrainBooking.class);
	 query.setParameter("contact",contact);
	 TrainBooking trainbooking = (TrainBooking) query.uniqueResult();
	 if(trainbooking!= null) {
	 currentSession.delete(trainbooking);
	  return "true";
	 }else {
		return "false";
	 }
	}
}
