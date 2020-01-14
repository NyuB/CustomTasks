package org.kit.ant.tasks.git;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import java.io.IOException;

public class GitPushTask extends Task {
	@Override
	public void execute() throws BuildException {
		try {
			Runtime.getRuntime().exec("git push").waitFor();
		} catch (IOException | InterruptedException e) {
			throw new BuildException();
		}
	}
}
