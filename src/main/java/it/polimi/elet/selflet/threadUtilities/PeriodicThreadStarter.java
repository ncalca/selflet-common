package it.polimi.elet.selflet.threadUtilities;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import com.google.common.collect.Lists;

/**
 * Creates and starts all periodic threads
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class PeriodicThreadStarter {

	private final int initialDelay;
	private final List<TimerTask> startedThreadList;
	private final List<IPeriodicTask> timerTasks;

	public PeriodicThreadStarter(int initialDelay) {
		this.initialDelay = initialDelay;
		this.startedThreadList = Lists.newArrayList();
		this.timerTasks = Lists.newArrayList();
	}

	/**
	 * Adds a new periodic task that needs to be started
	 * */
	public void addPeriodicTask(IPeriodicTask periodicTask) {
		timerTasks.add(periodicTask);
	}

	/**
	 * Starts the threads
	 * */
	public void start() {
		for (IPeriodicTask periodicTask : timerTasks) {
			startThread(periodicTask);
		}
	}

	/**
	 * Stops the running threads
	 * */
	public void stop() {
		for (TimerTask timerTask : startedThreadList) {
			timerTask.cancel();
		}
		startedThreadList.clear();
	}

	/**
	 * Returns a list of started threads
	 * */
	public List<TimerTask> getStartedThreads() {
		return Lists.newArrayList(startedThreadList);
	}

	private void startThread(IPeriodicTask periodicTask) {
		if (!(periodicTask instanceof TimerTask)) {
			throw new IllegalArgumentException("Passed IPeriodicTask is not extending TimerTask");
		}

		TimerTask timerTask = (TimerTask) periodicTask;

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(timerTask, initialDelay, periodicTask.periodInMsec());
		startedThreadList.add(timerTask);
	}

}
