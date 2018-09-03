package com.train.dao;

import java.util.List;

import com.train.entity.Train;
import com.train.entity.TrainBooking;
import com.train.entity.TrainPassengerListView;

public interface TrainDAO {

	Boolean saveTrain(Train theTrain);

	List<Train> getTrains();


	Train getTrain(int theId);

	void bookTrain(TrainBooking theTrainBooking);

	

	

	

}
