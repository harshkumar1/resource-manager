package edu.psu.sweng568.repositories;

import org.springframework.data.repository.CrudRepository;

import edu.psu.sweng568.models.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
}
