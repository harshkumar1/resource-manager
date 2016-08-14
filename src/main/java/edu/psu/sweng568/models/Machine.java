package edu.psu.sweng568.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Machine {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer machine_id;
	private String ip_address;
	private String hostname;
	private String type;
	private boolean is_qualified;
	private String programs;

}
