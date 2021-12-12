package co.edu.usa.lasartenreto2.reto2_lasarten.repositories.crud;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import co.edu.usa.lasartenreto2.reto2_lasarten.models.User;

public interface UserCrudRepository extends CrudRepository <User, Integer>{
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
}
