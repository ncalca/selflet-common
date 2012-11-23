package it.polimi.elet.selflet.message;

/**
 * Enumeration representing each type of message exchanged among SelfLets
 * 
 * @author Nicola Calcavecchia <calcavecchia@gmail.com>
 * */
public enum SelfLetMessageTypeEnum {

	ALIVE_SELFLET("ALIVE_SELFLET"),

	ASK_NEEDED_SERVICE("ASK_NEEDED_SERVICE"),

	ASK_NEEDED_SERVICE_REPLY("ASK_NEEDED_SERVICE_REPLY"),

	GET_SERVICE_PROVIDER_INDIRECTLY("GET_SERVICE_PROVIDER_INDIRECTLY"),

	GET_SERVICE_PROVIDER_INDIRECTLY_REPLY("GET_SERVICE_PROVIDER_INDIRECTLY_REPLY"),

	ADVERTISE_ACHIEVABLE_SERVICE("ADVERTISE_ACHIEVABLE_SERVICE"),

	EXECUTE_ACHIEVABLE_SERVICE("EXECUTE_ACHIEVABLE_SERVICE"),

	EXECUTE_ACHIEVABLE_SERVICE_REPLY("EXECUTE_ACHIEVABLE_SERVICE_REPLY"),

	DOWNLOAD_ACHIEVABLE_SERVICE("DOWNLOAD_ACHIEVABLE_SERVICE"),

	DOWNLOAD_ACHIEVABLE_SERVICE_REPLY("DOWNLOAD_ACHIEVABLE_SERVICE_REPLY"),

	ACKNOWLEDGE_RECEIVED_SERVICE("ACKNOWLEDGE_RECEIVED_SERVICE"),

	NODE_STATE("NODE_STATE"),

	NEGOTIATION_ERROR("NEGOTIATION_ERROR"),

	REDIRECT_REQUEST("REDIRECT_REQUEST"),

	SERVICE_TEACH("SERVICE_TEACH"),

	ISTANTIATE_NEW_SELFLET("ISTANTIATE_NEW_SELFLET"),

	ISTANTIATE_NEW_SELFLET_REPLY("ISTANTIATE_NEW_SELFLET_REPLY"),

	NEIGHBORS("NEIGHBORS"),

	REDIRECT_REQUEST_REPLY("REDIRECT_REQUEST_REPLY"),

	REMOVE_SELFLET("REMOVE_SELFLET")
	
	;

	private final String description;

	private SelfLetMessageTypeEnum(String description) {
		this.description = description;
	}

	public String toString() {
		return description;
	}

}