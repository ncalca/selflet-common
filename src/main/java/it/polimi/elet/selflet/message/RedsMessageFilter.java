package it.polimi.elet.selflet.message;

import it.polimi.elet.selflet.id.ISelfLetID;
import it.polimi.elet.selflet.message.RedsMessage;
import polimi.reds.Filter;
import polimi.reds.Message;

/**
 * A filter for messages containing a given selflet id as a recipients
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RedsMessageFilter implements Filter {

	private static final long serialVersionUID = 1L;

	private final ISelfLetID selfletId;

	public RedsMessageFilter(ISelfLetID selfletId) {
		this.selfletId = selfletId;
	}

	public boolean matches(Message message) {
		if (!(message instanceof RedsMessage)) {
			return false;
		}

		RedsMessage redsMessage = (RedsMessage) message;
		return (redsMessage.getRecipients().contains(selfletId.toString()));
	}

}
