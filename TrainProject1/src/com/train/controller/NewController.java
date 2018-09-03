package com.train.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.train.entity.Admin;
import com.train.entity.Train;
import com.train.entity.TrainBooking;
import com.train.entity.TrainPassengerListView;
import com.train.service.AdminService;

@Controller
public class NewController {
	@Autowired
	AdminService adminService;
	@RequestMapping("/")
	public String showMainPage(Model model) {
		
		Admin theAdmin = new Admin();
		model.addAttribute("admin", theAdmin);
		return "main";
	}
	
	@RequestMapping("/showUserPage")
	public String showUser(@ModelAttribute ("admin") Admin theAdmin,Model model) {
		String user = theAdmin.getUsername();
		String pass = theAdmin.getPassword();
		String flag = adminService.checkAdmin(user,pass);
		if(flag.equals("true")) {
		return "page2";
		}else {
			model.addAttribute("message","Login Details are incorrect...");
			return "main";
		}
	}
	
	@RequestMapping("/showAddTrainForm")
	public String showAddForm(Model model) {
		
		Train theTrain = new Train();
		model.addAttribute("train", theTrain);
		return "add-train";	
	}
	
	@RequestMapping("/processTrainForm")
	public String processTrainForm(@ModelAttribute("train") Train theTrain , Model model) {
		
		Boolean flag = adminService.saveTrain(theTrain);
		if(flag == true) {
			model.addAttribute("message1", "Train Details added successfully");
		return "add-train";
		}else {
			model.addAttribute("message2", "Sorry..Try again..");
			return "add-train";
		}
		}
	
	@RequestMapping("/showTrainList")
	public String showTrainList(Model model) {
		
		List<Train> theTrainList = adminService.getTrains();
		model.addAttribute("trainList", theTrainList);
		for(Train s : theTrainList) {
		System.out.println(s);
		}
		return "train-list";	
	}
	
	@RequestMapping("/showFormForUpdate")
	public String showFormforUpdate(@RequestParam ("trainId") int theId,Model model) {
			
		Train theTrain = adminService.getTrain(theId); 
		
		model.addAttribute("train",theTrain);
		
		return "add-train";
		
	}
	
	@RequestMapping("/showTrainDetails")
	public String showTrainDetails(Model model) {
		
		List<Train> theTrainDetails = adminService.getTrainDetails();
		model.addAttribute("trainDetails", theTrainDetails);
		return "train-details";
		
	}
	
	@RequestMapping("/showFormForBookingTrain")
	public String showFormBookingTrain(Model model){
		
		TrainBooking theTrainBooking = new TrainBooking();
		model.addAttribute("trainBooking", theTrainBooking);
		return "book-train";
	}
	
	
	
	@RequestMapping("/processBooking")
	public String bookTrain(@ModelAttribute ("trainBooking") TrainBooking theTrainBooking,Model model) {
		
		adminService.bookTrain(theTrainBooking);
		model.addAttribute("message1", "Train booked successfully");
		
		return "book-train";
		
	}
	
	@RequestMapping("/displayTrainAndPassengerList")
	public String displayTrainAndPassenger(Model model) {
		
		List<TrainPassengerListView> theTrainPassengerList = adminService.getTrainPassengerList();
		
		model.addAttribute("trainPassengerList", theTrainPassengerList);
		return "list-of-trains-for-passenger";
	}
	
	@RequestMapping("/showTrainAndPassengers")
	public String displayPassengersForThisTrain(@RequestParam ("trainName") String trainName,Model model) {
		
		List<TrainPassengerListView> theTrainPassengerList1 = adminService.getTrainPassengerList();

		List<TrainPassengerListView> theTrainPassengerList2 = new ArrayList<>();
		
		for(TrainPassengerListView o :theTrainPassengerList1) {
		if(o.getTrainName().equals(trainName)) {
			theTrainPassengerList2.add(o);
		}
		
		}
		model.addAttribute("trainPassengerList", theTrainPassengerList2);
		return "train-and-passenger-list";
	}
	
	@RequestMapping("/showFormForCancellingTicket")
	public String showFormForCancellingTicket(Model model){
		
		TrainBooking theTrainBooking = new TrainBooking();
		model.addAttribute("trainBooking", theTrainBooking);
		
		return "cancel-ticket";
	}
	@RequestMapping("/processCancellingTicket")
	public String cancelTicket(@ModelAttribute ("trainBooking") TrainBooking theTrainBooking,
			Model model) {
		
		String contact = theTrainBooking.getPassengerContact();
		
		String msg = adminService.cancelTicket(contact);
		
		if(msg.equals("true")) {
			model.addAttribute("message1", "Ticket Cancelled Successfully");
		}else {
			model.addAttribute("message2", "Sorry...Try again");
		}
		return "cancel-ticket";
	}
	}
	

