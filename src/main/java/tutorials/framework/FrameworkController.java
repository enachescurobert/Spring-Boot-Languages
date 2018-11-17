package tutorials.framework;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrameworkController {
	
	@Autowired
	private FrameworkService frameworkService;
	
	@RequestMapping("/frameworks")
	public List<Framework> getAllFrameworks() {
		return frameworkService.getAllFrameworks();
	}
	
	@RequestMapping("/frameworks/{id}")
	public Framework getFramework(@PathVariable String id) {
		return frameworkService.getFramework(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/frameworks")
	public void addFramework(@RequestBody Framework framework) {
		frameworkService.addFramework(framework);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/frameworks/{id}")
	public void updateFramework(@RequestBody Framework framework, @PathVariable String id) {
		frameworkService.updateFramework(id, framework);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/frameworks/{id}")
	public void deleteFramework(@PathVariable String id) {
		frameworkService.deleteFramework(id);
	}

}
