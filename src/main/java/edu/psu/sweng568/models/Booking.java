package edu.psu.sweng568.models;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer booking_id;
	@ManyToOne
	@JoinColumn(name="machine_id")
	private Machine machine;
	@ManyToOne
	@JoinColumn(name="id")
	private User user;
	private Timestamp start_time;
	private Timestamp end_time;//MM/DD/YYYY:HH:mm
}
