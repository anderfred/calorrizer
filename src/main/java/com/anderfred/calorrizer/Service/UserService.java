package com.anderfred.calorrizer.Service;

import com.anderfred.calorrizer.entity.User;

import java.util.Optional;

public interface UserService {
    <S extends User> S save(S s);

    Optional<User> findById(Integer id);

    Iterable<User> findAll();

    Optional<User> getByName(String name);

    void delete(User user);

}
