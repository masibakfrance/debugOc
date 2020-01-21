package com.hemebiotech.symptom_statistics.classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.hemebiotech.symptom_statistics.interfaces.ISymptomWriter;

import java.util.Map.Entry;
/**
 * SymptomWriter is the class representing a symptom writer.
 *
 * @author masibak
 * @version 1.0
 */
public class SymptomWriter implements ISymptomWriter {
	SymptomReader symptoms = new SymptomReader();
	/**
	 * It writes the symptoms in a file.
	 * 
	 * @param symtomsAndOccurence
	 * 						     The symptom and its number of occurrences
	 * 
	 * @param file
	 *            The name of the file in which the symptoms will be written and their number of occurrences.
	 */
	public void writeSymptomsInTheFile(Map<String, Integer> symtomsAndOccurence, String file) {
	    Set<Entry<String,Integer>> setHm = symtomsAndOccurence.entrySet();
	    Iterator<Entry<String,Integer>> it = setHm.iterator();
	    FileWriter result;
		try {
			result = new FileWriter(file);
			BufferedWriter out= new BufferedWriter(result);
	     while(it.hasNext()){
	        Entry<String,Integer> e = it.next();
	        try {
				out.write(  e.getKey()+ " : " +e.getValue()+"\n");
				
			} catch (IOException e1) {
				// que catch cette exception ?
				e1.printStackTrace();
			}
		}
		out.close();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
