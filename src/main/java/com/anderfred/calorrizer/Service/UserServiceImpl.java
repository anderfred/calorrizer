package com.anderfred.calorrizer.Service;

import com.anderfred.calorrizer.entity.User;
import com.anderfred.calorrizer.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public <S extends User> S save(S s) {
        logger.info("save {}", s);
        return userRepository.save(s);
    }

    @Override
    public Optional<User> findById(Integer id) {
        logger.info("findById {}", id);
        return userRepository.findById(id);
    }

    @Override
    public Iterable<User> findAll() {
        logger.info("findAll {}");
        return userRepository.findAll();
    }

    @Override
    public Optional<User> getByName(String name) {
        logger.info("getByName {}", name);
        return userRepository.getByName(name);
    }

    @Override
    public void delete(User user) {
        logger.info("delete {}", user);
        userRepository.delete(user);
    }
}
