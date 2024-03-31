package edu.lpallara.tpspringchantiers.dao;

import edu.lpallara.tpspringchantiers.models.Operation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OperationDao extends JpaRepository<Operation, Long> {
        List<Operation> findByName(String name);
}
