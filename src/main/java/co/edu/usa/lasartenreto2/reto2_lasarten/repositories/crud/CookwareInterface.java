package co.edu.usa.lasartenreto2.reto2_lasarten.repositories.crud;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.usa.lasartenreto2.reto2_lasarten.models.Cookware;

public interface CookwareInterface extends MongoRepository<Cookware, String> {
    
}
