# Nukkit Plugin Maven Archetype

This will allow for automatic creation of a base Plugin template to start a Nukkit Plugin. 

You will need to specify a few things to the archetype:
 - groupId: this will be the package name for the main class. For example, NukkitX uses com.nukkitx (you need to use something different) 
 - artifactId: maven ID for your plugin. Typically this is all lowercase
 - version: initial version for your plugin
 - pluginName: this will become the name of your Main Class, and the name of the plugin in the `plugin.yml` file. Typically CamelCase formatting is used, for example: MyPlugin 

Setup
-----

Due to the newest version of the Maven archetype plugin, we can no longer specify the repository on the command line, which causes IntelliJ to screw up when trying to use a third party archetype. 
We can still create via command line if you setup the archetype repo in your `settings.xml`.
Locate your `settings.xml` (in `{USERHOME}/.m2`) and create a profile with the NukkitX repo with an id of `archetype`. You can do this by adding the following to your `settings.xml`:
```xml
<profiles>
	<profile>
		<id>nukkitx</id>
		<repositories>
			<repository>
				<id>archetype</id>
				<name>NukkitX</name>
				<url>https://repo.opencollab.dev/maven-releases/</url>
			</repository>
		</repositories>
	</profile>
</profiles>
```

If you wish for this profile to always be active, also add the following:
```xml
<activeProfiles>
    <activeProfile>nukkitx</activeProfile>
</activeProfiles>
```

Creating new Plugin from command line:
------
If you have maven installed and set on your path, you can run the following command from the folder you want the project root to be created in. Maven will create a new folder for the project in the folder where this command is run. If you used a different profile name than `nukkitx` during setup above, be sure to change that as well. 
```
mvn archetype:generate -DarchetypeGroupId=com.nukkitx -DarchetypeArtifactId=plugin-archetype -DarchetypeVersion=1.0 -P nukkitx -DgroupId=<yourGroupId> -DartifactId=<yourArtifactId> -Dversion=<yourVersion> -DpluginName=<yourPluginName>
```

Replace the variables in `<>` brackets with your values (see above) and it should then generate your project. 

Creating new Plugin from IntelliJ:
------
Due to the way IntelliJ calls the `mvn` command from it's new project tool, we are unable to use third party archetypes at this time. 


  
