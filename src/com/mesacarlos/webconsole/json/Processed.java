package com.mesacarlos.webconsole.json;

import com.google.gson.JsonObject;

public class Processed implements JSONOutput{
	private String message;
	private String respondsTo;
	
	public Processed(String message, String respondsTo) {
		this.message = message;
		this.respondsTo = respondsTo;
	}
	
	@Override
	public int getStatusCode() {
		return 200;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
	@Override
	public String getRespondsTo() {
		return respondsTo;
	}
	
	@Override
	public String toJSON() {
		JsonObject object = new JsonObject();
		object.addProperty("status", getStatusCode());
		object.addProperty("statusDescription", "Processed");
		object.addProperty("respondsTo", getRespondsTo());
		object.addProperty("message", getMessage());
		return object.toString();
	}

}