package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
	private List<PersonaGB> lista;
	public Agenda(){
		lista = new ArrayList<PersonaGB>();
	}
	public void addPersona(PersonaGB p){
		lista.add(p);
	}
	public PersonaGB getPersona(int i){
		return lista.get(i);
	}
}
