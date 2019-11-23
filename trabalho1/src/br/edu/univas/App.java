package br.edu.univas;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

public class App {

	public static void main(String[] args) {
		/* 
		 * Valor: 5 pontos
		 * Data Entrega: 19/09/2019
		 * Como Entregar: Subir o código para o Github do aluno e enviar o link do Github para o email: rodrigolfsi@gmail.com
		 * Descrição:
		 * Um segundo cliente apareceu para nossa aplicação. Mas esse cliente gostaria de saber as horas do voo no fuso horário
		 * de Los Angeles - EUA. Atualmente a aplicação entrega os horarios dos voos no fuso horário de São Paulo.
		 * Utilizando algum design pattern aprendido, altere a aplicação, sem mexer nas classes FlightDAO e Fligh, para 
		 * atender esse novo cliente.
		 */
		
		FlightDAOAdapter flightDAO = new FlightDAOAdapterImpl();
		List<Flight> flights = flightDAO.getAll();
		
		for (Flight flight : flights) {
			//TODO DESCOMENTAR ESSA LINHA
			//System.out.println(flight);
		}
		
		
		ZonedDateTime time = ZonedDateTime.parse("2019-09-20T06:05:00+00:00[America/Sao_Paulo]");
		ZoneId utcZoneID = ZoneId.of("America/Los_Angeles");
		LocalDateTime ldt = time.toLocalDateTime();
		ZonedDateTime asd = ldt.atZone(utcZoneID);
		System.out.println(asd);
		
	}
}

