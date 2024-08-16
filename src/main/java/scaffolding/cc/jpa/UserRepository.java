package scaffolding.cc.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import scaffolding.cc.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {
}
