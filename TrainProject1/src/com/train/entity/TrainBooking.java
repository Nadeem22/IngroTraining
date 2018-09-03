package com.train.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="train_booking")
public class TrainBooking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="booking_id")
	private int bookingId;
	
	@Column(name="train_name")
	private String trainName;
	
	@Column(name="passenger_name")
	private String passengerName;
	
	@Column(name="passenger_contact")
	private String passengerContact;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private String passengerAge;
	
	public TrainBooking() {
		
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerContact() {
		return passengerContact;
	}

	public void setPassengerContact(String passengerContact) {
		this.passengerContact = passengerContact;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(String passengerAge) {
		this.passengerAge = passengerAge;
	}

	public TrainBooking(String trainName, String passengerName, String passengerContact, String gender,
			String passengerAge) {
		this.trainName = trainName;
		this.passengerName = passengerName;
		this.passengerContact = passengerContact;
		this.gender = gender;
		this.passengerAge = passengerAge;
	}

	@Override
	public String toString() {
		return "TrainBooking [bookingId=" + bookingId + ", trainName=" + trainName + ", passengerName=" + passengerName
				+ ", passengerContact=" + passengerContact + ", gender=" + gender + ", passengerAge=" + passengerAge
				+ "]";
	}
	
}
