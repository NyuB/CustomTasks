package org.kit.ant.tasks.git;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import java.io.IOException;

public class GitCommitTask extends Task {
	String message;

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void execute() throws BuildException {
		try {
			Runtime.getRuntime().exec("git commit -m \""+this.message+"\"");
		} catch (IOException e) {
			throw new BuildException();
		}
	}
}
