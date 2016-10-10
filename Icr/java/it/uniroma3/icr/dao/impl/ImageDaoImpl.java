package it.uniroma3.icr.dao.impl;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.*;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.uniroma3.icr.dao.ImageDao;
import it.uniroma3.icr.model.Image;

@Repository
public class ImageDaoImpl implements ImageDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void insertImage(Image image) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(image);
		session.getTransaction().commit();
		
	}

	@Override
	public Image findImage(long id) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		Image i = (Image) session.get(Image.class, id);
		
		return i;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Image> findAll() {
		Session session = sessionFactory.openSession();
		String hql = "FROM Image";
		Query query = session.createQuery(hql);
		List<Image> empList = query.list();
		System.out.println("Image List:"+empList);
		return empList;
	}
	
	
	
	@Override	
	public void getListJpegProperties() throws FileNotFoundException, IOException {
		
		getListJpegPropertiesType1();
		getListJpegPropertiesType2();
		getListJpegPropertiesType3();
	}


	private void getListJpegPropertiesType3() throws FileNotFoundException, IOException {
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
		        	in = new BufferedInputStream(new FileInputStream(files3[i]));
		        	
		        	 byte[] buf = new byte[2];
		             int count = in.read(buf, 0, 2);
		             if (count < 2) {
		                 throw new RuntimeException("Not a valid Jpeg file!");
		             }
		             if ((buf[0]) != (byte) 0xFF || (buf[1]) != (byte) 0xD8) {
		                 throw new RuntimeException("Not a valid Jpeg file!");
		             }
		             int width = 0;
		             int height = 0;
		             int xImg = x;
		             int yImg = y;
		             String type = imageType;
		             String page = imagePage;
		             String manuscript = imageManuscript;
		             
		             char[] comment = null;
	
		             
		             boolean hasDims = false;
		             boolean hasComment = false;
		             int ch = 0;
		             
		             while (ch != 0xDA && !(hasDims && hasComment)) {
		                 /* Find next marker (JPEG markers begin with 0xFF) */
		                 while (ch != 0xFF) {
		                     ch = in.read();
		                 }
		                 /* JPEG markers can be padded with unlimited 0xFF's */
		                 while (ch == 0xFF) {
		                     ch = in.read();
		                 }
		                 /* Now, ch contains the value of the marker. */
		                 
		                 int length = 256 * in.read();
		                 length += in.read();
		                 if (length < 2) {
		                     throw new RuntimeException("Not a valid Jpeg file!");
		                 }
		                 
		                 /* Now, length contains the length of the marker. */
	
		                 if (ch >= 0xC0 && ch <= 0xC3) {
		                     in.read();
		                     height = 256 * in.read();
		                     height += in.read();
		                     width = 256 * in.read();
		                     width += in.read();
		                     for (int foo = 0; foo < length - 2 - 5; foo++) {
		                         in.read();
		                     }
		                     hasDims = true;
		                 }
		                 else if (ch == 0xFE) {
		                	 comment = new char[length-2];
		                     for (int foo = 0; foo < length - 2; foo++)
		                         comment[foo] = (char) in.read();
		                     hasComment = true;
		                 }
		                 else {
		                     // just skip marker
		                     for (int foo = 0; foo < length - 2; foo++) {
		                         in.read();
		                     }
		                 }
		             }
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

private void getListJpegPropertiesType2() throws FileNotFoundException, IOException {
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
	    	in = new BufferedInputStream(new FileInputStream(files2[i]));
	    	
	    	 byte[] buf = new byte[2];
	         int count = in.read(buf, 0, 2);
	         if (count < 2) {
	             throw new RuntimeException("Not a valid Jpeg file!");
	         }
	         if ((buf[0]) != (byte) 0xFF || (buf[1]) != (byte) 0xD8) {
	             throw new RuntimeException("Not a valid Jpeg file!");
	         }
	         int width = 0;
	         int height = 0;
	         int xImg = x;
	         int yImg = y;
	         String type = imageType;
	         String page = imagePage;
	         String manuscript = imageManuscript;
	         
	         char[] comment = null;

	         
	         boolean hasDims = false;
	         boolean hasComment = false;
	         int ch = 0;
	         
	         while (ch != 0xDA && !(hasDims && hasComment)) {
	             /* Find next marker (JPEG markers begin with 0xFF) */
	             while (ch != 0xFF) {
	                 ch = in.read();
	             }
	             /* JPEG markers can be padded with unlimited 0xFF's */
	             while (ch == 0xFF) {
	                 ch = in.read();
	             }
	             /* Now, ch contains the value of the marker. */
	             
	             int length = 256 * in.read();
	             length += in.read();
	             if (length < 2) {
	                 throw new RuntimeException("Not a valid Jpeg file!");
	             }
	             
	             /* Now, length contains the length of the marker. */

	             if (ch >= 0xC0 && ch <= 0xC3) {
	                 in.read();
	                 height = 256 * in.read();
	                 height += in.read();
	                 width = 256 * in.read();
	                 width += in.read();
	                 for (int foo = 0; foo < length - 2 - 5; foo++) {
	                     in.read();
	                 }
	                 hasDims = true;
	             }
	             else if (ch == 0xFE) {
	            	 comment = new char[length-2];
	                 for (int foo = 0; foo < length - 2; foo++)
	                     comment[foo] = (char) in.read();
	                 hasComment = true;
	             }
	             else {
	                 // just skip marker
	                 for (int foo = 0; foo < length - 2; foo++) {
	                     in.read();
	                 }
	             }
	         }
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

private void getListJpegPropertiesType1() throws FileNotFoundException, IOException {
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
	    	in = new BufferedInputStream(new FileInputStream(files1[i]));
	    	
	    	 byte[] buf = new byte[2];
	         int count = in.read(buf, 0, 2);
	         if (count < 2) {
	             throw new RuntimeException("Not a valid Jpeg file!");
	         }
	         if ((buf[0]) != (byte) 0xFF || (buf[1]) != (byte) 0xD8) {
	             throw new RuntimeException("Not a valid Jpeg file!");
	         }
	         int width = 0;
	         int height = 0;
	         int xImg = x;
	         int yImg = y;
	         String type = imageType;
	         String page = imagePage;
	         String manuscript = imageManuscript;
	         
	         char[] comment = null;

	         
	         boolean hasDims = false;
	         boolean hasComment = false;
	         int ch = 0;
	         
	         while (ch != 0xDA && !(hasDims && hasComment)) {
	             /* Find next marker (JPEG markers begin with 0xFF) */
	             while (ch != 0xFF) {
	                 ch = in.read();
	             }
	             /* JPEG markers can be padded with unlimited 0xFF's */
	             while (ch == 0xFF) {
	                 ch = in.read();
	             }
	             /* Now, ch contains the value of the marker. */
	             
	             int length = 256 * in.read();
	             length += in.read();
	             if (length < 2) {
	                 throw new RuntimeException("Not a valid Jpeg file!");
	             }
	             
	             /* Now, length contains the length of the marker. */

	             if (ch >= 0xC0 && ch <= 0xC3) {
	                 in.read();
	                 height = 256 * in.read();
	                 height += in.read();
	                 width = 256 * in.read();
	                 width += in.read();
	                 for (int foo = 0; foo < length - 2 - 5; foo++) {
	                     in.read();
	                 }
	                 hasDims = true;
	             }
	             else if (ch == 0xFE) {
	            	 comment = new char[length-2];
	                 for (int foo = 0; foo < length - 2; foo++)
	                     comment[foo] = (char) in.read();
	                 hasComment = true;
	             }
	             else {
	                 // just skip marker
	                 for (int foo = 0; foo < length - 2; foo++) {
	                     in.read();
	                 }
	             }
	         }
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


	
	
	

	
	


