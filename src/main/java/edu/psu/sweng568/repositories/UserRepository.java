package edu.psu.sweng568.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import edu.psu.sweng568.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>
{
    @Async
    User findByUsernameAndPassword(
            @Param("username")
            String username,
            @Param("password")
            String password);

}
