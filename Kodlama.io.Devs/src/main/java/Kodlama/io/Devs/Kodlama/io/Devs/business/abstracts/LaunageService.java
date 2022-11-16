package Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Launage;

public interface LaunageService {

	List<Launage> getAll();
	void add(Launage launage) throws Exception;
	void update(Launage launage);
	void delete (Launage launage);
	void getId(int id);
	
}
