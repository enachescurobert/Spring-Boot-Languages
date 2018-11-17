package tutorials.framework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrameworkService {
	
	@Autowired
	private FrameworkRepository frameworkRepository;
	
	
	public List<Framework> getAllFrameworks(){
		List<Framework> frameworks = new ArrayList<>();
		frameworkRepository.findAll()
		.forEach(frameworks::add);
		return frameworks;
	}
	
	public Framework getFramework(String id) {
		return frameworkRepository.findOne(id);
	}

	public void addFramework(Framework framework) {
		frameworkRepository.save(framework);
	}

	public void updateFramework(String id, Framework framework) {
		frameworkRepository.save(framework);
	}

	public void deleteFramework(String id) {
		frameworkRepository.delete(id);
	}
}
