package scaffolding.cc.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import scaffolding.cc.entities.User;
import scaffolding.cc.repositories.jpa.UserRepository;
import scaffolding.cc.models.UserModel;
import scaffolding.cc.services.UserService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    @Override
    public User saveUser(UserModel user) {
        User u = new User();
        u.setNombre(user.getNombre());
        u.setApellido(user.getApellido());
        u.setCorreo(user.getCorreo());
        u.setFecha(LocalDate.now());
        return userRepository.save(u);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
