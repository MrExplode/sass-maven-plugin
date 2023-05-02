package me.sunstorm.maven.sass;

import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;

/**
 * Mojo that compiles SASS Templates into CSS files. Uses JRuby to execute a generated script that calls the SASS GEM
 *
 * @goal update-stylesheets
 * @phase process-sources
 */
public class UpdateStylesheetsMojo extends AbstractSassMojo {

    @Override
    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Compiling SASS Templates");

        // build sass script
        final StringBuilder sassBuilder = new StringBuilder();
        buildBasicSASSScript(sassBuilder);
        sassBuilder.append("Sass::Plugin.update_stylesheets");
        final String sassScript = sassBuilder.toString();

        // ...and execute
        executeSassScript(sassScript);
    }
}
