package edu.psu.sweng568.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.psu.sweng568.models.Machine;

public interface MachineRepository extends CrudRepository<Machine, Integer> {

}
