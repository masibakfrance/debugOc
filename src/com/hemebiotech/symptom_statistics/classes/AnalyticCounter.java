package com.hemebiotech.symptom_statistics.classes;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hemebiotech.symptom_statistics.interfaces.IAnalyticCounter;

/**
 * SymptomCounter is the class representing a symptom counter.
 * 
 * @author masibak
 * @version 1.0
 */
public class AnalyticCounter implements IAnalyticCounter {
	/**
	 * count the number of occurrences of a list of Strings,
	 * 
	 * @param list
	 * 			  the list of Strings
	 * 
	 * @return the symptom and its number of occurrences
	 */
	public Map<String, Integer> getStringOccurrencesFromList(List<String> list) {
		Map<String,Integer> mapSymptomsOccurence = new HashMap<>();
		for (String entry : list) { // Parcours de la liste entrée en paramètre de la fonction
			// Cas 1 : l'entrée est déjà présente dans la liste
			if(mapSymptomsOccurence.containsKey(entry)) {
				mapSymptomsOccurence.put(entry,(mapSymptomsOccurence.get(entry)+1));
			// Cas 2 : l'entrée n'est pas présente => on l'ajoute dans la map
			} else {
				mapSymptomsOccurence.put(entry,1);
			}
		}	
		return mapSymptomsOccurence;
	}
	
}
