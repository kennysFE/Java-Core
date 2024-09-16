package Airline_Ticket_Management;

import java.io.Serializable;

public class AirlineTicket implements Serializable {

	// Atribute
	private String codeFlight;
	private String nameFlight;
	private String dateTakeOff;
	private String baggageSign;
	private int priceTicket;

	// Contructor

	public AirlineTicket() {
	}

	public AirlineTicket(String codeFlight, String nameFlight, String dateTakeOff, String baggageSign,
			int priceTicket) {
		this.codeFlight = codeFlight;
		this.nameFlight = nameFlight;
		this.dateTakeOff = dateTakeOff;
		this.baggageSign = baggageSign;
		this.priceTicket = priceTicket;
	}

	// Getter, Setter

	public String getCodeFlight() {
		return codeFlight;
	}

	public void setCodeFlight(String codeFlight) {
		this.codeFlight = codeFlight;
	}

	public String getNameFlight() {
		return nameFlight;
	}

	public void setNameFlight(String nameFlight) {
		this.nameFlight = nameFlight;
	}

	public String getDateTakeOff() {
		return dateTakeOff;
	}

	public void setDateTakeOff(String dateTakeOff) {
		this.dateTakeOff = dateTakeOff;
	}

	public String getBaggageSign() {
		return baggageSign;
	}

	public void setBaggageSign(String baggageSign) {
		this.baggageSign = baggageSign;
	}

	public int getPriceTicket() {
		return priceTicket;
	}

	public void setPriceTicket(int priceTicket) {
		this.priceTicket = priceTicket;
	}

	// toString Method
	@Override
	public String toString() {
		return "AirlineTicket [codeFlight=" + codeFlight + ", nameFlight=" + nameFlight + ", dateTakeOff=" + dateTakeOff
				+ ", baggageSign=" + baggageSign + ", priceTicket=" + priceTicket + "]";
	}

	// display
	public String display() {
		return toString();
	}

}
