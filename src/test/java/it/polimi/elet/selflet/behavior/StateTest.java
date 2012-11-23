package it.polimi.elet.selflet.behavior;

import it.polimi.elet.selflet.action.Action;
import it.polimi.elet.selflet.exceptions.WrongParametersException;

import org.junit.Test;

import static org.mockito.Mockito.*;
import static junit.framework.Assert.*;

public class StateTest {

	@Test(expected = WrongParametersException.class)
	public void testNullState() {
		new State(null, null, false, false, null);
	}

	@Test
	public void testOkState() {
		Action action = mock(Action.class);
		State state = new State("name", "uniqueid", false, false, action);
		assertEquals(false, state.isFinalState());
		assertEquals(false, state.isInitialState());
	}

	@Test
	public void testFinalState() {
		Action action = mock(Action.class);
		State state = new State("name", "uniqueid", false, true, action);
		assertEquals(true, state.isFinalState());
		assertEquals(false, state.isInitialState());
	}

	@Test
	public void testInitialState() {
		Action action = mock(Action.class);
		State state = new State("name", "uniqueid", true, false, action);
		assertEquals(false, state.isFinalState());
		assertEquals(true, state.isInitialState());
	}

	@Test(expected = WrongParametersException.class)
	public void testBothInitialAndFinalState() {
		Action action = mock(Action.class);
		new State("name", "uniqueid", true, true, action);
	}

}
