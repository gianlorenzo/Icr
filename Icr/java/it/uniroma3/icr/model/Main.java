package it.uniroma3.icr.model;

import java.io.File;

public class Main {
	
	
	public static void main(String[] args) {
		File[] files = new File("C:\\Users\\NandG\\Documents\\images\\training").listFiles();
		
		for(File f : files){
			String path = f.getPath();
			
			String newPath = path.replace(f.separator,"/");
			System.out.println(newPath.substring(24, path.length()));
		}
			
			

		}
			
	}
	

