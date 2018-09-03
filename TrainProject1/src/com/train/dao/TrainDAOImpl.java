package com.train.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.train.entity.Train;
import com.train.entity.TrainBooking;
import com.train.entity.TrainPassengerListView;

@Repository
public class TrainDAOImpl implements TrainDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Boolean saveTrain(Train theTrain) {
		Session currentSession = sessionFactory.getCurrentSession();
		   currentSession.saveOrUpdate(theTrain);
		   Boolean flag = true;
		return flag;
	}

	@Override
	public List<Train> getTrains() {
		Session currentSession = sessionFactory.getCurrentSession();
		
	Query query =currentSession.createQuery("from Train",Train.class);
	
	List<Train> trainList = query.getResultList();

		return trainList;
	}

	@Override
	public Train getTrain(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		
		Train theTrain = currentSession.get(Train.class, theId);
		return theTrain;
	}

	@Override
	public void bookTrain(TrainBooking theTrainBooking) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.save(theTrainBooking);
		
	}

	

	

}
