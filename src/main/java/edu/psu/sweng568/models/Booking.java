package edu.psu.sweng568.models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer booking_id;

	@OneToOne
	private Machine machine;

	@OneToOne
	@JsonIgnore
	private User user;

	private Timestamp start_time;

	private Timestamp end_time;
}
