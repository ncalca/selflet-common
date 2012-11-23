package it.polimi.elet.selflet.message;

import java.util.Set;

import polimi.reds.Message;
import polimi.reds.Repliable;

import com.google.common.collect.Sets;

/**
 * A reds message encapsulating a selflet message and the list of recipients
 * 
 * @author silvia
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 */
public class RedsMessage extends Message implements Repliable {

	private static final long serialVersionUID = 1L;

	private final SelfLetMsg selfLetMsg;
	private final Set<String> recipients;

	public RedsMessage(SelfLetMsg message, Set<String> recipients) {
		this.selfLetMsg = message;
		this.recipients = recipients;
	}

	public RedsMessage(SelfLetMsg message, String recipient) {
		this.selfLetMsg = message;
		this.recipients = Sets.newHashSet(recipient);
	}

	public Set<String> getRecipients() {
		return Sets.newHashSet(recipients);
	}

	public SelfLetMsg getMessage() {
		return selfLetMsg;
	}

	public SelfLetMessageTypeEnum getType() {
		return selfLetMsg.getType();
	}

	@Override
	public String toString() {
		return "[To: " + recipients + ", content: " + selfLetMsg + "]";
	}
}