package pl.kurs;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;

public class MenuTableSwimmers extends AbstractTableModel{
	private static final long serialVersionUID = 1L;

	Menu SwimmersDAO;
	public void setSwimmersDAO(Menu SwimmersDAO) {	this.SwimmersDAO = SwimmersDAO; }

	/**
	 * Lokalnie przechowywana lista obiekt�w.
	 * Co jakis czas synchronizowana z baz�.
	 */
	List<Swimmers> SwimmersList = new ArrayList<Swimmers>();

	/**
	 * Inicjalizacja lokalnej listy obiekt�w
	 */
	public void init() {
		SwimmersList = SwimmersDAO.get();
	}

	
	@Override
	public int getColumnCount() {
		return 8;
	}

	@Override
	public int getRowCount() {
		return SwimmersList.size();
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch(columnIndex) {
		case 0: return SwimmersList.get(rowIndex).getSwimmerId();
		case 1: return SwimmersList.get(rowIndex).getName();
		case 2: return SwimmersList.get(rowIndex).getSurname();
		case 3: return SwimmersList.get(rowIndex).getGender();
		case 4: return SwimmersList.get(rowIndex).getWeight();
		case 5: return SwimmersList.get(rowIndex).getHeight();
		case 6: return SwimmersList.get(rowIndex).getNationality();
		case 7: return SwimmersList.get(rowIndex).getTeam();
		}
		return null;
	}
	public String getColumnName(int columnIndex) {
		switch(columnIndex) {
		case 0: return "swimmerId";
		case 1: return "name";
		case 2: return "surname";
		case 3: return "gender";
		case 4: return "weight";
		case 5: return "height";
		case 6: return "nationality";
		case 7: return "team";
		}
		return "";
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return true;
	}
	
	@Override
	public void setValueAt(Object o,int rowIndex, int columnIndex) {
		try{
		Swimmers swimmers = SwimmersList.get(rowIndex);
		String txt = (String)o;
		switch(columnIndex) {
		case 0: swimmers.setSwimmerId(Integer.parseInt(txt));break;
		case 1: swimmers.setName(txt);break;
		case 2: swimmers.setSurname(txt);break;
		case 3: swimmers.setGender(txt.charAt(0));break;
		case 4: swimmers.setWeight(Integer.parseInt(txt));break;
		case 5: swimmers.setHeight(Integer.parseInt(txt));break;
		case 6: swimmers.setNationality(txt);break;
		case 7: swimmers.setTeam(txt);break;
		}
		SwimmersDAO.updateSwimmers(swimmers);
		}catch(Exception e) {
			// w przypadku b��du zmiana odrzucona i komunikat o b��dzie 
			JOptionPane.showMessageDialog(null, "B�edna warto�� wpisana do pola!","B��d",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	/**
	 * Dodanie samochodu do bazy
	 * @param car
	 */
	public void add(Swimmers swimmers) {
		SwimmersDAO.createSwimmers(swimmers);
		//od�wie� list� samochod�w
		SwimmersList = SwimmersDAO.get();
		//powiadom tabel� JTable, �e trzeba od�wie�y� widok
		fireTableDataChanged();
	}
	
	/**
	 * Stworzenie samochodu i dodanie go do bazy
	 */
	public void addNew() {
		Swimmers swimmers = new Swimmers();
		add(swimmers);
	}
	/**
	 * Usuni�cie z bazy samochodu wy�wietlanego w tabeli na podanej pozycji 
	 * @param rowIndex
	 */
	public void del(int rowIndex) {
		Swimmers swimmers = SwimmersList.get(rowIndex);
		SwimmersDAO.deleteSwimmers(swimmers.getSwimmerId());
		//od�wie� list� samochod�w
		SwimmersList = SwimmersDAO.get();
		//powiadom tabel� JTable, �e trzeba od�wie�y� widok
		fireTableDataChanged();
	}
}