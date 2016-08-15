package edu.psu.sweng568.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.psu.sweng568.models.Machine;

@Repository
public interface MachineRepository extends CrudRepository<Machine, Integer> {

}
