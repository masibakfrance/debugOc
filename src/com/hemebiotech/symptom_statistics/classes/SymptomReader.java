package com.hemebiotech.symptom_statistics.classes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.hemebiotech.symptom_statistics.interfaces.ISymptomReader;


/**
 * SymptomReader is the class representing a symptom reader.
 * 
 * @author masibak
 * @version 1.0
 */
public class SymptomReader implements ISymptomReader {
	/**
	 * It reads the symptoms from a file
	 * 
	 * @param file
	 *            the file name
	 *
	 *@return symptoms as a list
	 */
	public List<String> getReadSymptomsFromTheFile(String file) {
		List<String> result = new ArrayList<String>();
		
		if (file!= null) {
			try {
				FileReader b = new FileReader(file);
				BufferedReader reader = new BufferedReader (b);
				String line = reader.readLine();
				
				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	
	
}
