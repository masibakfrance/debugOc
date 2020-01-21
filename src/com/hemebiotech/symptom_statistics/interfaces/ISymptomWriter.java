package com.hemebiotech.symptom_statistics.interfaces;

import java.util.Map;

import com.hemebiotech.symptom_statistics.classes.AnalyticCounter;
/**
 * Anything that will write symptom data and their numbers of occurrence in a source.
 * @author masibak
 *
 */
public interface ISymptomWriter {
	public void writeSymptomsInTheFile(Map<String, Integer> map, String file);
}
