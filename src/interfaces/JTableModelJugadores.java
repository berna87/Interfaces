package interfaces;

import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class JTableModelJugadores extends AbstractTableModel{
	private ArrayList<Jugador> lista;
	private String[] nombreColumnas;
	
	public JTableModelJugadores(ArrayList<Jugador> l, String[] n){
		this.lista=l;
		this.nombreColumnas=n;
	}
	
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return lista.size();
	}

	@Override
	public int getColumnCount() {
		return 2;
	}
	

	@Override
	public String getColumnName(int column) {
		// TODO Auto-generated method stub
		return nombreColumnas[column];
	}


	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
			Jugador j = lista.get(rowIndex);
			if (columnIndex == 0 ) return j.getNombre();
			else if (columnIndex == 1 ) return j.getEquipo();
			else return "";
			
		
	}

	
}
