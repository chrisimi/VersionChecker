# VersionChecker
A small library for spigot minecraft plugins to check the difference between the local version from the plugin.yml and the current version on https://spigotmc.org

# attention
This library is still in development and will be released soon.

# how to use it

## download 
clone the latest build from github `git clone https://www.github.com/chrisimi/VersionChecker.git`. Then you have to update the project so that maven can download the dependencies and afterwards you use `maven clean install` to install the library in your local maven repository to use it

## integration with maven
When you are finished with the first step then you have to integrate it in your plugin.

Maven:
```
<dependency>
  <groupId>com.chrisimi</groupId>
  <artifactId>versionchecker</artifactId>
  <version>1.0-pre</version>
</dependency>
```

## integration in code

To use the library you simply have to use the following code in the onEnabled() method.

```
@Override
public void onEnable()
{
  //other code
  VersionResult result = VersionChecker.getStatus(this, "the id of your plugin");
}
```

In the result you can now find some values to get the status of the check or the current version on spigot or from the plugin.yml.
