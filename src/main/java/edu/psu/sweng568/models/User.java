package edu.psu.sweng568.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(scope = User.class,
                  generator = ObjectIdGenerators.PropertyGenerator.class,
                  property = "id")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String email;
    private String username;
    @JsonIgnore
    private String password;
    private boolean isAdmin;
    private boolean isLocked;
    @OneToMany(mappedBy = "user")
    private List<Booking> bookings;

}
