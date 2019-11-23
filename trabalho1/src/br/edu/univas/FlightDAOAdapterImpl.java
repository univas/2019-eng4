package br.edu.univas;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class FlightDAOAdapterImpl implements FlightDAOAdapter {

	private FlightDAO flightDAO;
	
	public FlightDAOAdapterImpl() {
		flightDAO = new FlightDAO(); 
	}
	
	@Override
	public List<Flight> getAll() {
		List<Flight> flights = flightDAO.getAll();
		
		for (Flight flight : flights) {
			adjustTimeZone(flight);
		}
		
		return flights;
	}
	
	private void adjustTimeZone(Flight flight) {
		ZonedDateTime arrivalSaoPaulo = flight.getArrival();
		ZonedDateTime arrivalLosAngeles = arrivalSaoPaulo.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		flight.setArrival(arrivalLosAngeles);
		
		ZonedDateTime departureSaoPaulo = flight.getDeparture();
		ZonedDateTime departureLosAngeles = departureSaoPaulo.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
		flight.setDeparture(departureLosAngeles);
	}

}
