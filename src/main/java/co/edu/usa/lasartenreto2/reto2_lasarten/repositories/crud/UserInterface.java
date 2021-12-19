package co.edu.usa.lasartenreto2.reto2_lasarten.repositories.crud;


import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.usa.lasartenreto2.reto2_lasarten.models.User;

public interface UserInterface extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findTopByOrderByIdDesc();
}
