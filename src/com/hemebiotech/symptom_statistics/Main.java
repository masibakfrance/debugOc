package com.hemebiotech.symptom_statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import com.hemebiotech.symptom_statistics.classes.AnalyticCounter;
import com.hemebiotech.symptom_statistics.classes.SymptomReader;
import com.hemebiotech.symptom_statistics.classes.SymptomWriter;

public class Main {


	public static void main (String[] arg) {
		// déclaration des objets
		SymptomReader symptomReaderFromFile = new SymptomReader();
		AnalyticCounter analyticsCounter= new AnalyticCounter();
		SymptomWriter symptomWriterInFile = new SymptomWriter();
		
		// Récupération de la liste
		List<String> symptoms = new ArrayList<>();
		symptoms = symptomReaderFromFile.getReadSymptomsFromTheFile("symptoms.txt");
		
		// Compte les occurences
		Map<String,Integer> mapOccurences = analyticsCounter.getStringOccurrencesFromList(symptoms);

		// Sort symptoms alphabetically
		Map<String, Integer> result = new TreeMap<String, Integer>(mapOccurences);
		System.out.println(result);
		
		// écriture dans le fichier
		symptomWriterInFile.writeSymptomsInTheFile(result,"result.out");
		
		
		
		
		//là
		//SymptomWriterInFile.writeSymptomsInAlphabeticalOrder(SymptomCounter.getSymptomsAndTheirOccurrenceNumbers(SymptomReaderFromFile.getReadSymptomsFromTheFile("symptoms.txt")), "result.out");
		//Revoir les noms de methode 
		//la classe traitement dois avoir la methode qui compte et tri
		//la classe qui ecris fais que ecrire et non ranger
		// rajouter commentaires
		// générer la javadoc
		// envoyer sur github le projet (tu crée un repo sur github perso, et tu mets le projet fini en public) + mail mentor
		// -> push sur ta branche pas en master, et tu fais des changements
		// tu dois avoir 1 premier push NON COMPLET sur master
		// puis un secnd push complet sur branche de dev -> meme plusierus pushq possibles (montrer que tu as travaillé sur une branche differente de master)
		// ensuite un merge sur ta branche master -> projet final
		}
	
	}

