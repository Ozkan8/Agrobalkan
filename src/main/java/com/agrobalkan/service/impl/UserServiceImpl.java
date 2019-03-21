package com.agrobalkan.service.impl;

import com.agrobalkan.model.User;
import com.agrobalkan.repository.jpa.UserRepository;
import com.agrobalkan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository repo;

    @Override
    public Optional<User> findById(Long id) {
        return repo.findById(id);
    }

    @Override
    public User findOne(Long id) {
        return repo.getOne(id);
    }

    @Override
    public Collection<User> findAll() {
        return repo.findAll();
    }

    @Override
    public User save(User entity) {
        return repo.save(entity);
    }

    @Override
    public User findByUsername(String username) {
        return repo.findByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return repo.findByUsername(s);
    }

    @Override
    public Long count() { return repo.count(); }
}
