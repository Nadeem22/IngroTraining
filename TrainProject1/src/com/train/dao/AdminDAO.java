package com.train.dao;

import java.util.List;

import com.train.entity.TrainPassengerListView;

public interface AdminDAO {

	String checkAdmin(String user, String pass);
	List<TrainPassengerListView> getTrainPassengerList();
	String cancelTicket(String contact);
	
}
