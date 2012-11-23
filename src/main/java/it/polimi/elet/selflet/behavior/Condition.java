package it.polimi.elet.selflet.behavior;

import java.io.Serializable;

/**
 * A class representing a Condition (or Guard) for a transition in an selflet
 * Behaviour.
 * 
 * @author Davide Devescovi
 */
public class Condition implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String name;
	private final String uniqueId;
	private final String expression;
	private final String language;

	/**
	 * Constructs a Condition object with the given parameters.
	 * 
	 * @param name
	 *            the name of the Condition
	 * @param uniqueId
	 *            the unique id of the Condition
	 * @param language
	 *            the language the expression is written in
	 * @param expression
	 *            the expression representing the condition
	 * 
	 * @throws NullPointerException
	 *             if a parameter is null
	 */
	public Condition(String name, String uniqueId, String expression, String language) {

		if (name == null || uniqueId == null || expression == null || language == null) {
			throw new NullPointerException("An input parameter was null when creating a Condition object");
		}

		this.name = name;
		this.uniqueId = uniqueId;
		this.expression = expression;
		this.language = language;
	}

	public String getName() {
		return name;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public String getExpression() {
		return expression;
	}

	public String getLanguage() {
		return language;
	}

	/* ************************************** */
	/* Overridden equals and hashCode methods */
	/* ************************************** */

	@Override
	public boolean equals(Object object) {

		if (this == object) {
			return true;
		}
		if (!(object instanceof Condition)) {
			return false;
		}
		Condition secondCondition = (Condition) object;
		return (secondCondition.uniqueId.equals(this.uniqueId));
	}

	@Override
	public int hashCode() {

		int hashCode = 1;
		hashCode = hashCode * 31 + name.hashCode();
		hashCode = hashCode * 31 + uniqueId.hashCode();
		hashCode = hashCode * 31 + expression.hashCode();
		hashCode = hashCode * 31 + language.hashCode();

		return hashCode;
	}
}