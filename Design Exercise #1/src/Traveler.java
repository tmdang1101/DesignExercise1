import java.util.*;

public class Traveler {
	private String name;
	private List<String> info;
	
	//creates a profile for the traveler with a name and a List of information
	//List because it is flexible to add info, and the order of info matters
	//a Map can also work
	public Traveler(String name) {
		this.name = name;
		this.info = new ArrayList<String>();
	}
	
	public void addInfo(String toAdd) {
		info.add(toAdd);
	}
	
	public String toString() {
		return String.format("Info on %s: ", this.name) + info.toString();
	}
}