package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Launage;

public interface LaunageRepository {
	
	List<Launage> getAll();
	void add(Launage launage);
	void update(Launage launage);
	void delete (Launage launage);
	void getId(int id);
	

}
