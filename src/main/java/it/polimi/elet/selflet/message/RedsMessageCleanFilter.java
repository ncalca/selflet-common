package it.polimi.elet.selflet.message;

import java.util.Set;

import polimi.reds.Filter;
import polimi.reds.Message;

/**
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RedsMessageCleanFilter implements Filter {

	private static final long serialVersionUID = 1L;

	private final Set<SelfLetMessageTypeEnum> bindings;

	public RedsMessageCleanFilter(Set<SelfLetMessageTypeEnum> bindings) {
		this.bindings = bindings;
	}

	public boolean matches(Message msg) {

		if (!(msg instanceof RedsMessage)) {
			return false;
		}

		RedsMessage message = (RedsMessage) msg;

		SelfLetMessageTypeEnum type = message.getType();

		for (SelfLetMessageTypeEnum messageType : bindings) {
			if (messageType.equals(type)) {
				return false;
			}
		}
		return true;
	}
}
