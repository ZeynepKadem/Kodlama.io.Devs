package Kodlama.io.Devs.Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.LaunageService;
import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.LaunageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Launage;

public class LaunageManager implements LaunageService{
	LaunageRepository launageRepository;
	

	@Autowired
	public LaunageManager(LaunageRepository launageRepository) {
		
		this.launageRepository = launageRepository;
	}

	@Override
	public List<Launage> getAll() {
		
		return launageRepository.getAll();
	}

	@Override
	public void add(Launage launage) throws Exception {
		
			if(launage.getName().isEmpty()) {
				throw new Exception("Programmin name can't be null!");
				
			}else if(launage.getName().equals(launage.getName())) {
				throw new Exception("Program name shouldn't repeateble!");
				}else {
					launageRepository.add(launage);
				}
	}

	@Override
	public void update(Launage launage) {
		launageRepository.update(launage);
		
	}

	@Override
	public void delete(Launage launage) {
		launageRepository.delete(launage);
		
	}

	@Override
	public void getId(int id) {
		launageRepository.getId(id);
		
	}

}
