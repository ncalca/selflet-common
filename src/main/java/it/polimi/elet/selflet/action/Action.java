package it.polimi.elet.selflet.action;

import java.io.Serializable;

/**
 * A class representing an Action in the SelfLet environment.
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * @author Davide Devescovi
 */
public class Action implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String actionFile;
	private final String uniqueId;
	private final String actionExpression;
	private final String actionLanguage;

	/**
	 * Constructs an Action object with the specified parameters
	 * 
	 * @param actionFile
	 *            the name of the Action
	 * @param uniqueId
	 *            the unique id of the Action
	 * @param actionExpression
	 *            the expression representing the Action
	 * @param actionLanguage
	 *            the language the expression is written in
	 * 
	 * @throws NullPointerException
	 *             if a parameter is null
	 */
	public Action(String actionFile, String uniqueId, String actionExpression, String actionLanguage) {
		if (actionFile == null || uniqueId == null || actionLanguage == null) {
			throw new IllegalArgumentException("An input parameter was null when creating a Action object: name=" + actionFile + " uniqueId=" + uniqueId
					+ " actionLanguage=" + actionLanguage);
		}
		this.actionFile = actionFile;
		this.uniqueId = uniqueId;
		this.actionExpression = actionExpression;
		this.actionLanguage = actionLanguage;
	}

	public String getName() {
		return actionFile;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public String getActionExpression() {
		return actionExpression;
	}

	public String getActionLanguage() {
		return actionLanguage;
	}

	/* ************************************** */
	/* Overridden equals and hashCode methods */
	/* ************************************** */

	@Override
	public boolean equals(Object object) {

		if (this == object) {
			return true;
		}
		if (!(object instanceof Action)) {
			return false;
		}
		Action secondAction = (Action) object;
		return secondAction.uniqueId.equals(this.uniqueId);
	}

	@Override
	public int hashCode() {

		int hashCode = 1;
		hashCode = hashCode * 31 + actionFile.hashCode();
		hashCode = hashCode * 31 + uniqueId.hashCode();
		hashCode = hashCode * 31 + actionExpression.hashCode();
		hashCode = hashCode * 31 + actionLanguage.hashCode();

		return hashCode;
	}

	public String toString() {
		return this.actionExpression;
	}

}