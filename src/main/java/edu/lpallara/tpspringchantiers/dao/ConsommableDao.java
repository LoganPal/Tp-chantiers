package edu.lpallara.tpspringchantiers.dao;

import edu.lpallara.tpspringchantiers.models.Consommable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsommableDao extends JpaRepository<Consommable, Integer> {
    List<Consommable> findByName(String name);
}
