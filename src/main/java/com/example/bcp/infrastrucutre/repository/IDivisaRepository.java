package com.example.bcp.infrastrucutre.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bcp.domain.entity.Divisa;

public interface IDivisaRepository extends JpaRepository<Divisa, Integer> {
	List<Divisa> findByName(String name);
}
