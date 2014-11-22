package sk.upjs.ics.novotnyr.restlet;

public class Chocolate {
	private String title;
	
	private int percentage;
	
	public Chocolate() {
		// empty constructor
	}
	
	public Chocolate(String title, int percentage) {
		this.title = title;
		this.percentage = percentage;
	}
	
	public int getPercentage() {
		return percentage;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return new StringBuilder(title)
			.append(" (")
			.append(percentage)
			.append("%)")
			.toString();
	}
}
