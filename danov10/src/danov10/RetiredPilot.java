package danov10;

public class RetiredPilot extends Pilot {

	private int retireYear;

	public RetiredPilot(String name, String serviceNumber, int birthYear, int hoursOnFlight, int retireYear) {
		super(name, serviceNumber, birthYear, hoursOnFlight);
		this.retireYear = retireYear;
	}

	public int getRetireYear() {
		return retireYear;
	}

	public void setRetireYear(int retireYear) {
		this.retireYear = retireYear;
	}

	public static void retirePilot(Pilot p1) {

		System.out.println("Input pilot's retirement year : ");
		int retireYear = Integer.parseInt(Pilot.s.nextLine());

		RetiredPilot r = new RetiredPilot(p1.getName(), p1.getServiceNumber(), p1.getBirthYear(), p1.getHoursOnFlight(), retireYear);

		r.toString();

	}

	@Override

	public String toString() {
		return "Name : " + getName() + "\nService number : " + getServiceNumber() + "\nBirth year : " + getBirthYear()
				+ "\nHours flying : " + getHoursOnFlight() + "\nRetirement year : " + getRetireYear();
	}

}
