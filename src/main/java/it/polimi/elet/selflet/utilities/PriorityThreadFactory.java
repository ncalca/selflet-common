package it.polimi.elet.selflet.utilities;

import java.util.concurrent.ThreadFactory;

/**
 * A thread factory accepting the priority value to be assigned to services
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class PriorityThreadFactory implements ThreadFactory {

	private final int priority;
	private final String name;

	public PriorityThreadFactory(int priority, String name) {
		this.priority = priority;
		this.name = name;
	}

	@Override
	public Thread newThread(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.setPriority(priority);
		thread.setName(name);
		return thread;
	}

}
