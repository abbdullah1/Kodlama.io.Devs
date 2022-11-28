package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAcces.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	private ProgrammingLanguageRepository languageRepository;
	
@Autowired
public ProgrammingLanguageManager(ProgrammingLanguageRepository languageRepository) {
	super();
	this.languageRepository = languageRepository;
}

	@Override
	public List<ProgrammingLanguages> getAll() {
		// business Rules
		
		return languageRepository.getAll();
	}


	


	@Override
	public void add(ProgrammingLanguages programmingLanguage) {
		languageRepository.add(programmingLanguage);
		
	}


	@Override
	public void delete(int id) {
        languageRepository.delete(id);
		
	}


	@Override
	public void update(int id, ProgrammingLanguages programmingLanguage) {
		  languageRepository.update(id, programmingLanguage);
		
	}


	@Override
	public ProgrammingLanguages getById(int id) {
		// TODO Auto-generated method stub
		  return languageRepository.getById(id);
	}

}
