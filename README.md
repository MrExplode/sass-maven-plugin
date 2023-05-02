# sass-maven-plugin [![Release](https://jitpack.io/v/MrExplode/sass-maven-plugin.svg)](https://jitpack.io/#MrExplode/sass-maven-plugin)

This is a detached, modernized fork of [Jasig/sass-maven-plugin](https://github.com/Jasig/sass-maven-plugin).

## Requirements
Java 17 or later

## Usage
```xml
<repositories>
    <repository>
        <id>jitpack</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```
```xml
<plugin>
    <groupId>com.github.MrExplode</groupId>
    <artifactId>sass-maven-plugin</artifactId>
    <version>1.0.2</version>
    <configuration>
        <sassSourceDirectory>path to your sass files</sassSourceDirectory>
        <destination>where the compiled css files will go</destination>
    </configuration>
    <executions>
        <execution>
            <id>update-stylesheets</id>
            <phase>generate-resources</phase>
            <goals>
                <goal>update-stylesheets</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

## Building
You can build the plugin by running `mvn install`