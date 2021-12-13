package co.edu.usa.lasartenreto2.reto2_lasarten.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import co.edu.usa.lasartenreto2.reto2_lasarten.models.Cookware;
import co.edu.usa.lasartenreto2.reto2_lasarten.repositories.crud.CookwareInterface;

@Repository
public class CookwareRepository {
    
    @Autowired
    private CookwareInterface cookwareRepository;

    public List<Cookware> getAll() {
        return cookwareRepository.findAll();
    }

    public Optional<Cookware> getCook(String reference) {
        return cookwareRepository.findById(reference);
    }
    public Cookware create(Cookware cook) {
        return cookwareRepository.save(cook);
    }

    public void update(Cookware cook) {
        cookwareRepository.save(cook);
    }
    
    public void delete(Cookware cook) {
        cookwareRepository.delete(cook);
    }
}
