package com.flaviumircia.backendlab4.user;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    private final Repository userRepository;

    @Autowired
    public Service(Repository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public void addUser(User user) {
        Optional<User> userByName=userRepository.findByStudentName(user.getStudentName());
        if(userByName.isPresent())
            throw new IllegalStateException("Utilizatorul este deja inregistrat!");
        userRepository.save(user);
    }
}
