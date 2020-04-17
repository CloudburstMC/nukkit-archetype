# Nukkit Plugin Maven Archetype

This will allow for automatic creation of a base Plugin template to start a Nukkit Plugin. 

You will need to specify a few things to the archetype:
 - groupId: this will be the package name for the main class. For example, NukkitX uses com.nukkitx (you need to use something different) 
 - artifactId: maven ID for your plugin. Typically this is all lowercase
 - version: initial version for your plugin
 - pluginName: this will become the name of your Main Class, and the name of the plugin in the `plugin.yml` file. Typically CamelCase formatting is used, for example: MyPlugin 

Creating new Plugin from command line:
------
If you have maven installed and set on your path, you can run the following command from the folder you want the project root to be created in. Maven will create a new folder for the project in the folder where this command is run. 
```
mvn archetype:generate -DarchetypeGroupId=com.nukkitx -DarchetypeArtifactId=plugin-archetype -DarchetypeVersion=2.0 -DarchetypeRepository=https://repo.nukkitx.com/maven-snapshots -DgroupId=<yourGroupId> -DartifactId=<yourArtifactId> -Dversion=<yourVersion> -DpluginName=<yourPluginName>
```

Replace the variables in `<>` brackets with your values (see above) and it should then generate your project. 

Creating new Plugin from IntelliJ:
------
From the new Project Window, select `Maven` as the type, the check the `Create from archetype` checkbox. On the right hand side, select `Add Archetype...` (you will only have to do this once, and IntelliJ will save it for future use).

Fill in the following information into the `Add Archetype` popup window:
 - GroupId: `com.nukkitx`
 - ArtifactId: `plugin-archetype`
 - Version: `2.0`
 - Repository: `https://repo.nukkitx.com/maven-snapshots/`
 
Click next and fill in your project name and artifact coordinates information. Click next again and on the last screen before create there is a Properties box with the info for your plugin. Click the **+** on the right and add a property for `pluginName` (case sensitive) and input the plugin name you wish to use. 
**It is important you input this property before clicking Create! Due to IntelliJ functionality, the archetype creation will fail when creating from the dialog box and the `pluginName` is missing.**   



  