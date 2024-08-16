package scaffolding.cc.services;

import org.springframework.stereotype.Service;
import scaffolding.cc.entities.User;
import scaffolding.cc.models.UserModel;
import scaffolding.cc.models.UserModel2;

import java.util.List;

@Service
public interface UserService {
    User saveUser(UserModel user);
    List<User> getAllUsers();
}
