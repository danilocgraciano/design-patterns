package s.adapter;

public class HRSystem {
	public String[][] getEmployees() {
		String[][] employees = new String[4][];
		employees[0] = new String[] { "100", "Fulano 1", "Coordenador de TI" };
		employees[1] = new String[] { "101", "Ciclano 1", "Coordenador de TI" };
		employees[2] = new String[] { "102", "Beltrano 1", "Desenvolvedor Senior" };
		employees[3] = new String[] { "103", "Fulano 2", "Product Owner" };
		return employees;
	}
}
