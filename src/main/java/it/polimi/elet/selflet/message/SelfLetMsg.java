package it.polimi.elet.selflet.message;

import it.polimi.elet.selflet.id.ISelfLetID;

import java.io.Serializable;

import polimi.reds.MessageID;

/**
 * This class represents a message exchanged by SelfLets.
 * 
 * @author Davide Devescovi
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public class SelfLetMsg implements Serializable {

	private static final long serialVersionUID = 1L;

	private final ISelfLetID from;
	private final ISelfLetID to;
	private final SelfLetMessageTypeEnum type;
	private final Serializable content;
	private MessageID id;

	public SelfLetMsg(ISelfLetID from, ISelfLetID to, SelfLetMessageTypeEnum type, Serializable msgContent) {
		this.from = from;
		this.to = to;
		this.type = type;
		this.content = msgContent;
	}

	
	public ISelfLetID getFrom() {
		return from;
	}

	public ISelfLetID getTo() {
		return to;
	}

	public SelfLetMessageTypeEnum getType() {
		return type;
	}

	public Serializable getContent() {
		return content;
	}

	public MessageID getId() {
		return id;
	}

	public void setId(MessageID id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Msg from: " + from + " to: " + to + " type: " + type + " content: " + content;
	}
}