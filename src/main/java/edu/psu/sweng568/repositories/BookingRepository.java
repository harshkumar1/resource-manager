package edu.psu.sweng568.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.psu.sweng568.models.Booking;

public interface BookingRepository extends CrudRepository<Booking, Integer> {
	
}
