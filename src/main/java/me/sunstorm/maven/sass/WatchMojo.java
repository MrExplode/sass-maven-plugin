package me.sunstorm.maven.sass;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * @goal watch
 */
public class WatchMojo extends AbstractSassMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Watching SASS Templates");

        // build sass script
        final StringBuilder sassBuilder = new StringBuilder();
        buildBasicSASSScript(sassBuilder);
        sassBuilder.append("Sass::Plugin.watch");
        final String sassScript = sassBuilder.toString();

        // ...and execute
        executeSassScript(sassScript);
    }
}
