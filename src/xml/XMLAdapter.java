package xml;

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
		// TODO Auto-generated method stub
		
	}

}
