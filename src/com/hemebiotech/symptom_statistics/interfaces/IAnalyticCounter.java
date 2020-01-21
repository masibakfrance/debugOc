package com.hemebiotech.symptom_statistics.interfaces;

import java.util.List;
import java.util.Map;

import com.hemebiotech.symptom_statistics.classes.SymptomReader;
/**
 * Anything that will count symptom data from a list
 * The important part is, the return value from the operation, which is a map,
 * that may contain the symptoms and values
 * 
 * The implementation does not need to order the map
 * 
 * @author masibak
 *
 */
public interface IAnalyticCounter {
	public Map<String,Integer> getStringOccurrencesFromList(List<String> list);
}
