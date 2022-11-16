package Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import Kodlama.io.Devs.Kodlama.io.Devs.dataAccess.abstracts.LaunageRepository;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Launage;

public class InMemoryLaunageRepository implements LaunageRepository{

	List<Launage> launages;

	
	
	public InMemoryLaunageRepository() {
		
		launages = new ArrayList<Launage>();
		launages.add(new Launage(1,"C#"));
		launages.add(new Launage(2,"Java"));
		launages.add(new Launage(3,"Pyhton"));
		
	}

	@Override
	public List<Launage> getAll() {
		
		return launages;
	}

	@Override
	public void add(Launage launage) {
		launages.add(launage);
		
	}

	@Override
	public void update(Launage launage) {
		
	}

	@Override
	public void delete(Launage launage) {
		
		
	}

	@Override
	public void getId(int id) {
		
		
	}

}
