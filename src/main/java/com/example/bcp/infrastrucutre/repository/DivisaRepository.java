package com.example.bcp.infrastrucutre.repository;
import java.util.ArrayList;
import java.util.List;

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
		//List<Divisa> = divisaRepository.findByName(name);
		List<Divisa> list = new ArrayList<>();
		//return (Divisa) divisaRepository.findByName(name);
		list = divisaRepository.findByName(name);
		return list.get(0);
	}
}


