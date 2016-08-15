package edu.psu.sweng568.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.psu.sweng568.models.Booking;

@Repository
public interface BookingRepository extends CrudRepository<Booking, Integer> {
	
}
