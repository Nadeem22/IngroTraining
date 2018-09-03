package com.train.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_passenger_list_view")
public class TrainPassengerListView {


	@Id
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
	
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="passenger_contact")
	private String passengerContact;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String passengerAge;
	
	
	
	public String getTrainName() {
		return trainName;
	}

	public String getTrainFare() {
		return trainFare;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public int getDuration() {
		return duration;
	}

	public int getBookingId() {
		return bookingId;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public String getPassengerContact() {
		return passengerContact;
	}

	public String getGender() {
		return gender;
	}

	public String getPassengerAge() {
		return passengerAge;
	}

	public TrainPassengerListView(String trainName, String trainFare, int numberOfSeats, String fromPlace,
			String toPlace, int duration, int bookingId, String passengerName, String passengerContact, String gender,
			String passengerAge) {
		this.trainName = trainName;
		this.trainFare = trainFare;
		this.numberOfSeats = numberOfSeats;
		this.fromPlace = fromPlace;
		this.toPlace = toPlace;
		this.duration = duration;
		this.bookingId = bookingId;
		this.passengerName = passengerName;
		this.passengerContact = passengerContact;
		this.gender = gender;
		this.passengerAge = passengerAge;
	}

	@Override
	public String toString() {
		return "TrainPassengerListView [trainName=" + trainName + ", trainFare=" + trainFare + ", numberOfSeats="
				+ numberOfSeats + ", fromPlace=" + fromPlace + ", toPlace=" + toPlace + ", duration=" + duration
				+ ", bookingId=" + bookingId + ", passengerName=" + passengerName + ", passengerContact="
				+ passengerContact + ", gender=" + gender + ", passengerAge=" + passengerAge + "]";
	}

	public TrainPassengerListView () {
		
	}

	
	
	
}
