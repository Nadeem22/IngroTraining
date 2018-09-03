package com.train.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train")
public class Train {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="train_id")
	private int trainId;
	
	@Column(name="train_name")
	private String trainName;
	
	@Column(name="train_fare")
	private String trainFare;
	
	@Column(name="number_of_seats")
	private int numberOfSeats;
	
	@Column(name="from_place")
	private String fromPlace;
	
	@Column(name="to_place")
	private String toPlace;
	
	@Column(name="duration")
	private int duration;
	
	public Train() {
		
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getTrainFare() {
		return trainFare;
	}

	public void setTrainFare(String trainFare) {
		this.trainFare = trainFare;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "Train [trainId=" + trainId + ", trainName=" + trainName + ", trainFare=" + trainFare
				+ ", numberOfSeats=" + numberOfSeats + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace
				+ ", duration=" + duration + "]";
	}

	public Train(String trainName, String trainFare, int numberOfSeats, String fromPlace, String toPlace,
			int duration) {
		this.trainName = trainName;
		this.trainFare = trainFare;
		this.numberOfSeats = numberOfSeats;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.duration = duration;
	}
	
	
	
}
