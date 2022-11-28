package kodlama.io.Devs.business.abstracts;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguages;
import java.util.List;

public interface ProgrammingLanguageService {
	List<ProgrammingLanguages>getAll();
	public  void add(ProgrammingLanguages programmingLanguage);
    public  void delete(int id);
    public  void update(int id, ProgrammingLanguages programmingLanguage);
    ProgrammingLanguages getById(int id);
}
