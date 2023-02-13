package danov10;
import java.util.ArrayList;

public class TestPilot {

	private static ArrayList<Pilot> pilots = new ArrayList<>();
	private static ArrayList<RetiredPilot> retiredPilots = new ArrayList<>();

	public static void main(String[] args) {
		
		
		
	}
	
	public static boolean isThereAPilot(Pilot p1) {
		
		boolean thereIs = false;
		
		for(Pilot pilotForComparison : pilots) {
			if(pilotForComparison.getName().equals(p1.getName()) && pilotForComparison.getServiceNumber().equals(p1.getServiceNumber()) && pilotForComparison.getBirthYear() == p1.getBirthYear() && pilotForComparison.getHoursOnFlight() == p1.getHoursOnFlight()) {
				thereIs = true;
			}
		}
		
		return thereIs;
		
	}
	
	// В долния метод първо принтираме в конзолата всички съществуващи пилоти, като всеки има свой номер (0,1,2,3,4..), които номера са съответно индекса на този пилот в арейлиста pilots
	// , след това избираме пилот по неговия индекс и ъпдейтваме неговите данни.
	
	public static void updatePilot(Pilot p1) {
		
		int currentPilotToUpdate = 0;
		for(Pilot pilot : pilots) {
			pilot.toString();
			System.out.println("\nCurrent pilot's index : " + currentPilotToUpdate);
		}
		
		System.out.println("Choose a pilot by his pilot index : ");
		currentPilotToUpdate = Integer.parseInt(Pilot.s.nextLine());
		
		pilots.get(currentPilotToUpdate).setName(p1.getName());
		pilots.get(currentPilotToUpdate).setServiceNumber(p1.getServiceNumber());
		pilots.get(currentPilotToUpdate).setBirthYear(p1.getBirthYear());
		pilots.get(currentPilotToUpdate).setHoursOnFlight(p1.getHoursOnFlight());
		
		pilots.get(currentPilotToUpdate).toString();
		
	}
	
	public static String mostFlightHoursPilot() {
		
		Pilot p1 = new Pilot("", "", 0, 0);
		
		for(Pilot pilot : pilots) {
			if(pilot.getHoursOnFlight() > p1.getHoursOnFlight()) {
				p1 = pilot;
			}
		}
		
		return p1.toString();
		
	}

}
