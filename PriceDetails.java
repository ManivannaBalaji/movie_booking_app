package com.manivannabalaji.moviebookingapp;

import java.time.LocalDate;
import java.time.LocalTime;

public class PriceDetails {
	/**
	 * This method prints the movie ticket fare details
	 * @param categoryName
	 * @param noOfTickets
	 * @param price
	 * @param gst
	 * @param seniorCitizen
	 * @param bookingDate
	 * @param showDate
	 * @param bookingTime
	 * @param showTime
	 */
	public static void printStatement(String categoryName, int noOfTickets, int price, int gst, boolean seniorCitizen,
			LocalDate bookingDate, LocalDate showDate, LocalTime bookingTime, LocalTime showTime) {
		System.out.println("==================================================");
		System.out.println("Price Details :)");
		System.out.println("==================================================");
		System.out.println("Ticket Category : " + categoryName);
		System.out.println("No of Tickets : " + noOfTickets);
		System.out.println("Booking Date : " + bookingDate);
		System.out.println("Booking Time : " + bookingTime);
		System.out.println("Show Date : " + showDate);
		System.out.println("Show Time : " + showTime);
		if(seniorCitizen) {
			System.out.println("Senior Citizen : Yes");
		}else {
			System.out.println("Senior Citizen : No");
		}
		System.out.println("Price : " + price);
		System.out.println("GST : " + gst);
		System.out.println("Total : " + (price + gst));
		System.out.println("==================================================");
	}
}
