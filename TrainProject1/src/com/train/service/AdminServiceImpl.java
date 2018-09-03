package com.train.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.train.dao.AdminDAO;
import com.train.dao.TrainDAO;
import com.train.entity.Train;
import com.train.entity.TrainBooking;
import com.train.entity.TrainPassengerListView;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminDAO adminDAO;
	
	@Autowired
	TrainDAO trainDAO;
	
	@Override
	@Transactional
	public String checkAdmin(String user, String pass) {
		
		return adminDAO.checkAdmin(user,pass);
	}

	@Override
	@Transactional
	public Boolean saveTrain(Train theTrain) {
		
		return trainDAO.saveTrain(theTrain);
	}

	@Override
	@Transactional
	public List<Train> getTrains() {
		
	 return trainDAO.getTrains();
	}

	@Override
	@Transactional
	public Train getTrain(int theId) {
		
		return trainDAO.getTrain(theId);
	}

	@Override
	@Transactional
	public List<Train> getTrainDetails() {
		
		return trainDAO.getTrains();
	}

	@Override
	@Transactional
	public void bookTrain(TrainBooking theTrainBooking) {
		trainDAO.bookTrain(theTrainBooking);
		
	}

	@Override
	@Transactional
	public List<TrainPassengerListView> getTrainPassengerList() {
		return adminDAO.getTrainPassengerList();
	}

	@Override
	@Transactional
	public String cancelTicket(String contact) {
		
		return adminDAO.cancelTicket(contact);
	}
	
	

}
