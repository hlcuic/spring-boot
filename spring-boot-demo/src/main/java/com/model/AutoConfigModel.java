package com.model;

public class AutoConfigModel {

	private String id = "autoConfig";

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override public String toString() {
		final StringBuffer sb = new StringBuffer("PersonModel{");
		sb.append("id='").append(id).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
