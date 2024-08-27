package com.example.fichepdp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public User ajouter(User u) {
        u.setActive(false);
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return userRepository.save(u);
    }


    public void supprimer(Integer id) {
        userRepository.deleteById(id);
    }

    public User modifier(User u) {
        u.setPassword(passwordEncoder.encode(u.getPassword()));
        return userRepository.save(u);
    }

    public User getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAll() {
        return (List<User>)userRepository.findAll() ;
    }


    public User ActiverOuDesactiver(Integer id) {
        User u = userRepository.findById(id).orElse(null);
        if (u != null){
            u.setActive(!u.getActive());
        }
        return userRepository.save(u);
    }
}
