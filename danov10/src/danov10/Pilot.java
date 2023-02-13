package danov10;

import java.util.Scanner;

public class Pilot {

	private String name, serviceNumber;
	private int birthYear, hoursOnFlight;
	protected static Scanner s = new Scanner(System.in);

	public Pilot(String name, String serviceNumber, int birthYear, int hoursOnFlight) {
		this.name = name;
		this.serviceNumber = serviceNumber;
		this.birthYear = birthYear;
		this.hoursOnFlight = hoursOnFlight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceNumber() {
		return serviceNumber;
	}

	public void setServiceNumber(String serviceNumber) {
		this.serviceNumber = serviceNumber;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int getHoursOnFlight() {
		return hoursOnFlight;
	}

	public void setHoursOnFlight(int hoursOnFlight) {
		this.hoursOnFlight = hoursOnFlight;
	}

	public static void addPilot() {

		System.out.println("Input pilot's name : ");
		String name = s.nextLine();
		System.out.println("Input pilot's service number : ");
		String serviceNumber = s.nextLine();
		System.out.println("Input pilot's birth year : ");
		int birthYear = Integer.parseInt(s.nextLine());
		System.out.println("Input pilot's hours flying : ");
		int hoursOnFlight = Integer.parseInt(s.nextLine());

		Pilot p = new Pilot(name, serviceNumber, birthYear, hoursOnFlight);

	}

	@Override

	public String toString() {
		return "Name : " + getName() + "\nService number : " + getServiceNumber() + "\nBirth year : " + getBirthYear()
				+ "\nHours flying : " + getHoursOnFlight();
	}
	
	public static String calculateAge(int birthYear) {
		return "Pilot's birth year is " + birthYear + " and his age is" + (2021-birthYear);
	}

}
