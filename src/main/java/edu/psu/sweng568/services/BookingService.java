package edu.psu.sweng568.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.psu.sweng568.models.Booking;
import edu.psu.sweng568.repositories.BookingRepository;

@Service
public class BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	public Iterable<Booking> getAllBooking()
	{
		return bookingRepository.findAll();
	}

	public Booking saveBooking(Booking booking)
	{
		return bookingRepository.save(booking);
	}
}
