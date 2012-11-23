package it.polimi.elet.selflet.message;

import polimi.reds.Filter;
import polimi.reds.Message;

/**
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RedsBroadcastFilter implements Filter {

	private static final long serialVersionUID = 1L;

	public boolean matches(Message msg) {

		if (!(msg instanceof RedsMessage)) {
			return false;
		}

		RedsMessage redsMessage = (RedsMessage) msg;
		return redsMessage.getRecipients().contains("BROADCAST");
	}
}