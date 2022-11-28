package kodlama.io.Devs.dataAcces.abstracts;

import java.util.List;


import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;

public interface ProgrammingLanguageRepository {
	List<ProgrammingLanguages> getAll();
	    public void add(ProgrammingLanguages programmingLanguage);
	    public void delete (int id);
	    public void update(int id, ProgrammingLanguages programmingLanguage);
	    ProgrammingLanguages getById(int id);
}
