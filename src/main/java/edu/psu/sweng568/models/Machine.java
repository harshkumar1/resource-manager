package edu.psu.sweng568.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(scope = Machine.class,
				  generator = ObjectIdGenerators.PropertyGenerator.class,
				  property = "id")
public class Machine {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	private String ip_address;
	private String hostname;
	private String type;
	private boolean is_qualified;
	private String programs;

	@OneToMany(mappedBy = "machine")
	private List<Booking> bookings;
}
