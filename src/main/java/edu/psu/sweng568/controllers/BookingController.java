package edu.psu.sweng568.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;

import edu.psu.sweng568.models.Booking;
import edu.psu.sweng568.services.BookingService;

@Controller
@RequestMapping("api/{version}/bookings")
public class BookingController {
	@Autowired
	BookingService bookingService;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Collection<Booking> getBookings()
	{
		Collection<Booking> bookings = Lists.newArrayList(bookingService.getAllBooking());
		return bookings;
	}


	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Booking createBooking(@RequestBody Booking booking) {
		return bookingService.saveBooking(booking);
	}
}
