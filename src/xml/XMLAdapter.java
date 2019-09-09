package xml;

import domain.Project;
import main.ConfigInterface;
import yaml.YamlBuildConfigurationReader;

public class XMLAdapter implements ConfigInterface{

	private XMLBuildConfigurationReader XMLAdaptee = null;
	public XMLAdapter() {
	}
	
	@Override
	public void setConfigurationReader(Object obj) {
		this.XMLAdaptee = (XMLBuildConfigurationReader)obj;
	}
	
	@Override
	public void buildTarget(String string, String target) {
		final Project xmlProject = XMLAdaptee.getProject();
		Build build = new Build(xmlProject);
		build.build(1,target);
	}

}
