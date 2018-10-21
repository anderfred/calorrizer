package com.anderfred.calorrizer.repository;

import com.anderfred.calorrizer.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> getByName(String name);
}
