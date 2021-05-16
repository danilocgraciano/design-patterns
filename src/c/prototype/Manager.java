package c.prototype;

public class Manager implements Employee {

	private int wordsPerMinute;

	private String name;

	private String role;

	private String preferredLanguage;

	public Manager() {

	}

	public Manager(int wordsPerMinute, String name, String role, String preferredLanguage) {
		super();
		this.wordsPerMinute = wordsPerMinute;
		this.name = name;
		this.role = role;
		this.preferredLanguage = preferredLanguage;
	}

	public int getWordsPerMinute() {
		return wordsPerMinute;
	}

	public void setWordsPerMinute(int wordsPerMinute) {
		this.wordsPerMinute = wordsPerMinute;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getPreferredLanguage() {
		return preferredLanguage;
	}

	public void setPreferredLanguage(String preferredLanguage) {
		this.preferredLanguage = preferredLanguage;
	}

	@Override
	public Employee clone() {
		return new Manager(wordsPerMinute, name, role, preferredLanguage);
	}

	@Override
	public String getDetails() {
		return String.format("%s - %s - %s - %s", wordsPerMinute, name, role, preferredLanguage);
	}

}
