package tutorials.language;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import tutorials.framework.Framework;

@Entity
public class Language {
	
	@Id
	private String id;
	private String name;
	private String description;
	@ManyToOne
	private Framework framework;
	
	public Language(){
		
	}
	
	public Language(String id, String name, String description, String frameworkId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.framework = new Framework(frameworkId,"","");
		//Empty strings: name and description
		}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Framework getFramework() {
		return framework;
	}

	public void setFramework(Framework framework) {
		this.framework = framework;
	}
	
	
}
