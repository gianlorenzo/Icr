package it.uniroma3.icr.insertImageInDb;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FilenameUtils;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.model.Sample;
import it.uniroma3.icr.model.Symbol;

@Repository
public class InsertSampleInDb {
	
	private static final String path ="C:\\Users\\NandG\\Documents\\images\\samples\\";
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void insertSample(Sample sample) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(sample);
		session.getTransaction().commit();
		session.close();
	}
	
	public Symbol findSymbol(String transcription) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String s = "FROM Symbol s WHERE s.transcription = :transcription";
		Query query = session.createQuery(s);
		query.setParameter("transcription", transcription);
		Symbol symbol = (Symbol) query.uniqueResult();
		session.close();
		return symbol;
	}
	
	public void getSampleImage() throws FileNotFoundException, IOException {
		File[] files = new File(path).listFiles();
		
		for(int i=0;i<files.length;i++) {
			
			//prendo nomi cartelle transcription
			String transcriptionSymbol = files[i].getName();
			
			//prendo i nomi dei manoscritti
			File[] manuscripts = files[i].listFiles();
			for(int j=0;i<manuscripts.length;i++) {
				String manuscriptName = manuscripts[j].getName();
				
				//prendo i nomi delle pagine
				File[] pages = manuscripts[j].listFiles();
				for(int h=0; h<pages.length;h++) {
					String pageName = pages[h].getName();
					
					File[] images = pages[h].listFiles();
					for(int g=0;g<images.length;g++) {
						String nameComplete = images[g].getName();
						String pathFile = images[g].getPath();
						
						String newPath = pathFile.replace(images[g].separator, "/");						
						String name = FilenameUtils.getBaseName(nameComplete);
						String[] parts = name.split("_");
						
						int x = Integer.valueOf(parts[0]);
						int y = Integer.valueOf(parts[1]);
						
						BufferedInputStream in = null;
						
						try {
							BufferedImage b = ImageIO.read(images[g]);
							
							Symbol s = this.findSymbol(transcriptionSymbol);
							String type = s.getType();
							int width = b.getWidth();
							int height = b.getHeight();
							int xImg = x;
							int yImg = y;
							String page = pageName;
							String manuscript = manuscriptName;
							String path = newPath.substring(24, newPath.length());
							
							Sample sample = new Sample(width,height,xImg,yImg,manuscript,
									page,type,path);
							
							sample.setSymbol(s);
							this.insertSample(sample);
							
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
			
			
			
		}
		
			
	}
}	
	
	
	
	
	

