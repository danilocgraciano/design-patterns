package c.builder;

import java.util.ArrayList;
import java.util.List;

public class Vehicle {

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public List<String> getAcessories() {
		return acessories;
	}

	public void setAcessories(List<String> acessories) {
		this.acessories = acessories;
	}

	private String model;

	private String engine;

	private String transmission;

	private String body;

	private List<String> acessories;

	public Vehicle() {
		acessories = new ArrayList<String>();
	}

	public void showInfo() {
		System.out.println(String.format("Model: %s", model));
		System.out.println(String.format("Engine: %s", engine));
		System.out.println(String.format("Body: %s", body));
		System.out.println(String.format("Transmission: %s", transmission));
		for (String acessory : acessories) {
			System.out.println(String.format("\t%s", acessory));
		}
	}

}
