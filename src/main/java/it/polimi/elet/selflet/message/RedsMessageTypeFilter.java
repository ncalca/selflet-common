package it.polimi.elet.selflet.message;

import java.util.Set;

import com.google.common.collect.ImmutableSet;

import polimi.reds.Filter;
import polimi.reds.Message;

/**
 * This class implements a message filter specialized for a type
 * <code>SelfLetMessageTypeEnum</code>. It is used to retrieve all the messages
 * of a given type.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class RedsMessageTypeFilter implements Filter {

	private static final long serialVersionUID = 1L;

	private final Set<SelfLetMessageTypeEnum> messageTypes;

	public RedsMessageTypeFilter(ImmutableSet<SelfLetMessageTypeEnum> messageTypes) {
		this.messageTypes = messageTypes;
	}

	public boolean matches(Message message) {
		if (!(message instanceof RedsMessage)) {
			return false;
		}

		RedsMessage redsMessage = (RedsMessage) message;
		return messageTypes.contains(redsMessage.getType());
	}
}