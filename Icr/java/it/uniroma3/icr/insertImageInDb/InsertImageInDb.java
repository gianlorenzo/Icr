package it.uniroma3.icr.insertImageInDb;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FilenameUtils;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.model.Image;

@Repository
public class InsertImageInDb {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertImage(Image image) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(image);
		session.getTransaction().commit();
		
	}
	
public void getListJpegProperties() throws FileNotFoundException, IOException {
		
		getListJpegPropertiesType1();
		getListJpegPropertiesType2();
		getListJpegPropertiesType3();
	}
	
	public void getListJpegPropertiesType3() throws FileNotFoundException, IOException {
		File[] files3 = new File("C:\\Users\\NandG\\Documents\\sources\\rv12\\1\\t3\\").listFiles();
		
		for(int i=0;i<files3.length;i++) {
			//Prendo i campi dal percorso
			String nameComplete = files3[i].getName();
			
			String name = FilenameUtils.getBaseName(nameComplete);
			File typeImage = files3[i].getParentFile();
			String imageType = typeImage.getName();
			File pageImage = typeImage.getParentFile();
			String imagePage = pageImage.getName();
			File manuscriptImage = pageImage.getParentFile();
			String imageManuscript = manuscriptImage.getName();
			String [] parts = name.split("_");
			
			int x = Integer.valueOf(parts[0]);
			int y = Integer.valueOf(parts[1]);
			BufferedInputStream in = null;
	        
	        try {
	        	BufferedImage j = ImageIO.read(files3[i]);
	        	
	             int width = j.getWidth();
	             int height = j.getHeight();
	             int xImg = x;
	             int yImg = y;
	             String type = imageType;
	             String page = imagePage;
	             String manuscript = imageManuscript;
	             
	             Image img = new Image(width, height,type,page,manuscript,xImg,yImg);
	             this.insertImage(img);
			
		}
		
		finally {
	            if (in != null) {
	                try {
	                	
	                    in.close();
	                }
	                catch (IOException e) {
	                	e.printStackTrace();
	                }
	           }
	        }
		}
}

public void getListJpegPropertiesType2() throws FileNotFoundException, IOException {
File[] files2 = new File("C:\\Users\\NandG\\Documents\\sources\\rv12\\1\\t2\\").listFiles();

for(int i=0;i<files2.length;i++) {
	String nameComplete = files2[i].getName();
	
	String name = FilenameUtils.getBaseName(nameComplete);
	File typeImage = files2[i].getParentFile();
	String imageType = typeImage.getName();
	File pageImage = typeImage.getParentFile();
	String imagePage = pageImage.getName();
	File manuscriptImage = pageImage.getParentFile();
	String imageManuscript = manuscriptImage.getName();
	String [] parts = name.split("_");
	
	int x = Integer.valueOf(parts[0]);
	int y = Integer.valueOf(parts[1]);
	BufferedInputStream in = null;
    
    try {
    	BufferedImage j = ImageIO.read(files2[i]);
    	
    	 
         int width = j.getWidth();
         int height = j.getHeight();
         int xImg = x;
         int yImg = y;
         String type = imageType;
         String page = imagePage;
         String manuscript = imageManuscript;
         
        
         
         Image img = new Image(width, height,type,page,manuscript,xImg,yImg);
         this.insertImage(img);
}

 finally {
        if (in != null) {
            try {
            	
                in.close();
            }
            catch (IOException e) {
            	e.printStackTrace();
            }
       }
    }
}
}

public void getListJpegPropertiesType1() throws FileNotFoundException, IOException {
File[] files1 = new File("C:\\Users\\NandG\\Documents\\sources\\rv12\\1\\t1\\").listFiles();

for(int i=0;i<files1.length;i++) {
	String nameComplete = files1[i].getName();
	
	String name = FilenameUtils.getBaseName(nameComplete);
	File typeImage = files1[i].getParentFile();
	String imageType = typeImage.getName();
	File pageImage = typeImage.getParentFile();
	String imagePage = pageImage.getName();
	File manuscriptImage = pageImage.getParentFile();
	String imageManuscript = manuscriptImage.getName();
	String [] parts = name.split("_");
	
	int x = Integer.valueOf(parts[0]);
	int y = Integer.valueOf(parts[1]);
	BufferedInputStream in = null;
    
    try {
    	 BufferedImage j = ImageIO.read(files1[i]);

    	
         int width = j.getWidth();
         int height = j.getHeight();
         int xImg = x;
         int yImg = y;
         String type = imageType;
         String page = imagePage;
         String manuscript = imageManuscript;
         
         
         Image img = new Image(width, height,type,page,manuscript,xImg,yImg);
         this.insertImage(img);
   }

finally {
        if (in != null) {
            try {
            	
                in.close();
            }
            catch (IOException e) {
            	e.printStackTrace();
            }
       }
    }
}
}

}
