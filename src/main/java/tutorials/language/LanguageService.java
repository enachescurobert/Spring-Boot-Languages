package tutorials.language;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	
	public List<Language> getAllLanguages(String frameworkId){
		List<Language> languages = new ArrayList<>();
		languageRepository.findByFrameworkId(frameworkId)
		.forEach(languages::add);
		return languages;
	}
	
	public Language getLanguage(String id) {
		return languageRepository.findOne(id);
	}

	public void addLanguage(Language language) {
		languageRepository.save(language);
	}

	public void updateLanguage(Language language) {
		languageRepository.save(language);
	}

	public void deleteLanguage(String id) {
		languageRepository.delete(id);
	}
}
