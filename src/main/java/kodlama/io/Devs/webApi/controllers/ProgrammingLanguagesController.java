package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService languageService;
@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService languageService) {
		super();
		this.languageService = languageService;
	}
	@GetMapping("/getAll")
	public List<ProgrammingLanguages>getAll(){
		return languageService.getAll();
	}
	 @GetMapping("/getById/{id}")
	    public ProgrammingLanguages getById(int id){
	        return languageService.getById(id);
	
}
	  @DeleteMapping("/delete/{id}")
	    public void delete(int id){

		  languageService.delete(id);
	    }
	    @PutMapping("/update/{id}")
	    public void update(@PathVariable int id,@RequestBody ProgrammingLanguages programmingLanguage){
	    	languageService.update(id, programmingLanguage);

	    }
	    @PostMapping("/add")
	    public void add(@RequestBody ProgrammingLanguages programmingLanguage){
	    	languageService.add(programmingLanguage);

	    }

}
