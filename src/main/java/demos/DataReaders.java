package demos;

import java.util.List;

public class DataReaders {

	public static void main(String[] args) {
		readCSV();

	}
	
	public static void readCSV( ) {
		String filename = "/Users/anacarrasco/Downloads/UserAccounts.csv";
		
		List <String[]> records = utilities.CSV.get(filename);
		for (String[] record : records) {
			for (String field : record) {
				System.out.println(field);
			}
		}
	}

}
