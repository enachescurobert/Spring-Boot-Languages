package tutorials.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tutorials.framework.Framework;

@RestController
public class LanguageController {
	
	@Autowired
	private LanguageService languageService;
	
	@RequestMapping("/frameworks/{id}/languages")
	public List<Language> getAllLanguages(@PathVariable String id) {
		return languageService.getAllLanguages(id);
	}
	
	@RequestMapping("/frameworks/{frameworkId}/languages/{id}")
	public Language getLanguage(@PathVariable String id) {
		return languageService.getLanguage(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/frameworks/{frameworkId}/languages/")
	public void addLanguage(@RequestBody Language language, @PathVariable String frameworkId) {
		language.setFramework(new Framework(frameworkId,"",""));
		languageService.addLanguage(language);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/frameworks/{frameworkId}/languages/{id}")
	public void updateLanguage(@RequestBody Language language, @PathVariable String frameworkId, @PathVariable String id) {
		language.setFramework(new Framework(frameworkId,"",""));
		languageService.updateLanguage(language);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/frameworks/{frameworkId}/languages/{id}")
	public void deleteLanguage(@PathVariable String id) {
		languageService.deleteLanguage(id);
	}

}
