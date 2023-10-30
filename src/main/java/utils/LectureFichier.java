package utils;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {
	
	//Lit le contenu du fichier en parametre, et retourne une liste contenant toutes les lignes du fichier.
	public static List<String> lire(String cheminFichier){
		List<String> lignes =null;
		try {
			File file = new File(cheminFichier);
			lignes = FileUtils.readLines(file,"UTF-8");
			lignes.remove(0);
			return lignes;
			
		}catch (IOException e){
			System.out.println(e.getMessage());
			return null;
		}
	}
}
