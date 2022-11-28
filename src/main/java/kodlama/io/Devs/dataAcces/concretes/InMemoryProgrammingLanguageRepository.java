package kodlama.io.Devs.dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAcces.abstracts.ProgrammingLanguageRepository;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository{

	List<ProgrammingLanguages> languages;
	
	
	public InMemoryProgrammingLanguageRepository() {
	languages = new ArrayList<ProgrammingLanguages>();
	languages.add(new ProgrammingLanguages(1,"C"));
	languages.add(new ProgrammingLanguages(2,"C++"));
	languages.add(new ProgrammingLanguages(3,"C#"));
	languages.add(new ProgrammingLanguages(4,"Java"));
	languages.add(new ProgrammingLanguages(5,"JavaScript"));
	languages.add(new ProgrammingLanguages(6,"PHP"));
	languages.add(new ProgrammingLanguages(7,"Python"));
	}


	@Override
	public List<ProgrammingLanguages> getAll() {
		// TODO Auto-generated method stub
		return languages;
	}


	@Override
	public void add(ProgrammingLanguages programmingLanguages) {
        languages.add(programmingLanguages);
		
	}


	@Override
	public void delete(int id) {
		 for (ProgrammingLanguages programmingLanguage : languages) {
	            if (programmingLanguage.getId() == id) {
	                languages.remove(programmingLanguage);
	                break;
	            }
	        }
		
	}


	@Override
	public void update(int id, ProgrammingLanguages programmingLanguage) {
		 for (ProgrammingLanguages language : languages) {
	            if (language.getId() == id) {
	            	language = programmingLanguage;
	                break;

	            }
	        }
		
	}


	@Override
	public ProgrammingLanguages getById(int id) {
		 for (ProgrammingLanguages programmingLanguage : languages) {
	            if (programmingLanguage.getId() == id) {
	                return programmingLanguage;
	            }
	        }
		return null;
	}

}
