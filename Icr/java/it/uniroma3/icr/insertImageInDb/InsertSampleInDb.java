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
			File[] files = new File("C:\\Users\\NandG\\Documents\\samples\\a\\rv12\\1").listFiles();
			
			for(int i = 0; i<files.length;i++) {
				String nameComplete = files[i].getName();
				String samplePath = files[i].getAbsolutePath();
				
				String name = FilenameUtils.getBaseName(nameComplete);
				File pageImage = files[i].getParentFile();
				String pageName = pageImage.getName();
				File manuscriptImage = pageImage.getParentFile();
				String manuscriptName = manuscriptImage.getName();
				File symbolImage = manuscriptImage.getParentFile();
				String symbolTranscription = symbolImage.getName();
				String[] parts = name.split("_");
				
				int x = Integer.valueOf(parts[0]);
				int y = Integer.valueOf(parts[1]);
				
				Symbol s = this.findSymbol(symbolTranscription);
				
				BufferedInputStream in = null;
				
				try {
					BufferedImage j = ImageIO.read(files[i]);
					
					int width = j.getWidth();
					int height = j.getHeight();
					int xImg = x;
					int yImg = y;
					String path = samplePath;
					String page = pageName;
					String manuscript = manuscriptName;
					String type = s.getType();
					
					Sample sample = new Sample(width,height,xImg,yImg,
							path,manuscript,page,type);
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

	
	
	
	
	
	

