package com.example.bcp.infrastrucutre.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bcp.domain.entity.Divisa;


@Service
public class DivisaRepository {
	@Autowired
	private IDivisaRepository divisaRepository;
	
	public Divisa getDivisaByID(int id) {
			return divisaRepository.findById(id).orElse(null);
	}
	
	public Divisa getDivisaByName(String name) {
		return (Divisa) divisaRepository.findByName(name);
	}
}


