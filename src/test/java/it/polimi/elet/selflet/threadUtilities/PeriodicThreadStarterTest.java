package it.polimi.elet.selflet.threadUtilities;

import static junit.framework.Assert.assertEquals;

import java.util.TimerTask;

import org.junit.Test;

public class PeriodicThreadStarterTest {

	@Test
	public void testNumberOfStartedThreads() {
		int initialDelay = 10;
		PeriodicThreadStarter periodicThreadStarter = new PeriodicThreadStarter(initialDelay);
		periodicThreadStarter.addPeriodicTask(createNewPeriodicTask());
		periodicThreadStarter.addPeriodicTask(createNewPeriodicTask());
		periodicThreadStarter.addPeriodicTask(createNewPeriodicTask());
		periodicThreadStarter.addPeriodicTask(createNewPeriodicTask());

		periodicThreadStarter.start();
		assertEquals(4, periodicThreadStarter.getStartedThreads().size());
		periodicThreadStarter.stop();
	}

	private IPeriodicTask createNewPeriodicTask() {
		return new DummyPeriodicTask();
	}

	// private inner class for dummy periodic task
	private class DummyPeriodicTask extends TimerTask implements IPeriodicTask {

		@Override
		public int periodInMsec() {
			return 100;
		}

		@Override
		public void run() {
		}

	}

}
