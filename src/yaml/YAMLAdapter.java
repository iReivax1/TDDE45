package yaml;

import domain.BuildConfig;
import main.ConfigInterface;
import xml.XMLBuildConfigurationReader;

public class YAMLAdapter implements ConfigInterface{

	private YamlBuildConfigurationReader YAMLAdaptee = null;
	
	public YAMLAdapter() {
	}
	
	@Override
	public void setConfigurationReader(Object obj) {
		this.YAMLAdaptee = (YamlBuildConfigurationReader)obj;
	}
	@Override
	public void buildTarget(String string, String target) {
		final BuildConfig yamlBuild = YAMLAdaptee.getBuildConfig();
		Compile compile = new Compile(yamlBuild, target);
		compile.build(1);
	}



}
