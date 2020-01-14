package org.kit.ant.tasks.git;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

import java.io.IOException;

public class GitAddTask extends Task {
	String arg;
	public void setArg(String arg) {
		this.arg = arg;
	}

	@Override
	public void execute() throws BuildException {
		try {
			Runtime.getRuntime().exec("git add "+this.arg);
		} catch (IOException e) {
			throw new BuildException();
		}
	}
}
