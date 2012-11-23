package it.polimi.elet.selflet.negotiation;

import java.io.Serializable;

import polimi.reds.MessageID;

/**
 * Represents the content of a ReplyMessage
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public class ReplyRequestData implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String serviceName;
	private final Object output;
	private final MessageID messageId;

	public ReplyRequestData(String serviceName, Object output, MessageID messageId) {
		this.serviceName = serviceName;
		this.output = output;
		this.messageId = messageId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public Object getOutput() {
		return output;
	}

	public MessageID getMessageId() {
		return messageId;
	}

}
