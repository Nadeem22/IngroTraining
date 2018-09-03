package com.train.service;

import java.util.List;

import com.train.entity.Train;
import com.train.entity.TrainBooking;
import com.train.entity.TrainPassengerListView;

public interface AdminService {

	String checkAdmin(String user, String pass);

	Boolean saveTrain(Train theTrain);

	List<Train> getTrains();

	Train getTrain(int theId);

	List<Train> getTrainDetails();

	void bookTrain(TrainBooking theTrainBooking);


	List<TrainPassengerListView> getTrainPassengerList();

	String cancelTicket(String contact);

	

}
