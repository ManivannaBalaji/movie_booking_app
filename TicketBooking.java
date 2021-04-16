package com.manivannabalaji.moviebookingapp;

import java.time.LocalDate;
import java.time.LocalTime;
import com.manivannabalaji.cabbookingapp.CalculateFare;
import com.manivannabalaji.cabbookingapp.StringValidator;
import com.manivannabalaji.cabbookingapp.TimeValidator;

public class TicketBooking {

	public static void main(String[] args) {
		
		long mobileNumber = 9943365992L;	//hard coded input values
		String password = "pass1234", categoryName = "Normal";	//hard coded input values
		String[] categories = {"Normal", "Classic", "Premium"}; //hard coded input values
		int[] prices = {100, 150, 200}; //hard coded input values
		int defaultCategory = 1, noOfTickets = 10, gstPercentage = 7; //hard coded input values
		int price = 0, gst = 0, age = 0;
		boolean seniorCitizen = false;
		String tempDob = "1960-01-01";
		String tempBookingDate = "2021-04-17", tempShowDate = "2021-04-30"; //hard coded input values
		String tempBookingTime = "13:00", tempShowTime = "10:00"; //hard coded input values
		LocalDate bookingDate, showDate, dateOfBirth;
		LocalTime bookingTime, showTime;
		
		System.out.println("Welcome to Movie booking app");
		System.out.println("==================================================");
		System.out.println("Login");
		System.out.println("Enter mobile number : " + mobileNumber);
		System.out.println("Enter password : " + password);
		if(StringValidator.validateMobile(mobileNumber) && StringValidator.validatePassword(password)) {
			System.out.println("Login successful!");
			System.out.println("==================================================");
			System.out.println("Choose ticket category");
			for(int i=0; i<categories.length; i++) {
				System.out.println(i+1 + " " + categories[i] + " " + "Rs. " + prices[i]);
			}
			System.out.println("Enter your option : " + defaultCategory);
			System.out.println("Enter your Date of Birth : " + tempDob);
			System.out.println("Enter no of tickets : " + noOfTickets);
			
			bookingDate = LocalDate.parse(tempBookingDate);
			bookingTime = LocalTime.parse(tempBookingTime);
			showDate = LocalDate.parse(tempShowDate);
			showTime = LocalTime.parse(tempShowTime);
			dateOfBirth = LocalDate.parse(tempDob);
			
			age = TimeValidator.getInterval(dateOfBirth, bookingDate);
			if(age > 60) {
				seniorCitizen = true;
			}
			price = CalculateFare.calculatePrice(defaultCategory, prices, (float)noOfTickets, false, seniorCitizen);
			gst = CalculateFare.calculateGst(gstPercentage, price);
			PriceDetails.printStatement(categoryName, noOfTickets, price, gst, seniorCitizen, bookingDate, showDate, bookingTime,
					showTime);
		}else {
			System.out.println("Login failed, Try again!!");
		}
	}
}
