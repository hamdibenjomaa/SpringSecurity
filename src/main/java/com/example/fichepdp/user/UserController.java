package com.example.fichepdp.user;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/User")
public class UserController {
    private final UserService userService;

    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.ajouter(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.modifier(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userService.getAll();
    }

    @GetMapping("/{idUser}")
    public User getUserById(@PathVariable Integer idUser) {
        return userService.getById(idUser);
    }

    @DeleteMapping("/delete/{idUser}")
    public void deleteUser(@PathVariable Integer idUser) {
        userService.supprimer(idUser);
    }

    @PutMapping("/ActiverOuDesactiver")
    public User ActiverOuDesactiver(@RequestBody Integer id) {
        return userService.ActiverOuDesactiver(id);
    }
    
}
