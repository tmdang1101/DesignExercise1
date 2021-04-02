public class Main {
	public static void main(String[] args) {
		Traveler foreigner = new Traveler("Tuan Dang");
		foreigner.addInfo("not citizen");
		foreigner.addInfo("has US Visa");
		foreigner.addInfo("clean background");
		foreigner.addInfo("no substance or prohibited objects");
	
		System.out.println(foreigner.toString());
		
		
		Traveler citizen = new Traveler("Tom");
		citizen.addInfo("is citizen");
		citizen.addInfo("no US Visa");
		citizen.addInfo("minor crime (explained)");
		citizen.addInfo("too much meat and fish in luggage");
		
		System.out.println(citizen.toString());
	}
}
