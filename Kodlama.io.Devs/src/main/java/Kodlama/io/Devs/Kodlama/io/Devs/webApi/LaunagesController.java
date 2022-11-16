package Kodlama.io.Devs.Kodlama.io.Devs.webApi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.Kodlama.io.Devs.business.abstracts.LaunageService;
import Kodlama.io.Devs.Kodlama.io.Devs.entities.concretes.Launage;

@RestController
@RequestMapping("/api/programmingLaunages")
public class LaunagesController {

	private LaunageService launageService;
    
	@Autowired
	public LaunagesController(LaunageService launageService) {
		
		this.launageService = launageService;
	}
	@GetMapping("/getall")
	public List<Launage> getAll(){
		return launageService.getAll();
	}
	
	
	
	
}
