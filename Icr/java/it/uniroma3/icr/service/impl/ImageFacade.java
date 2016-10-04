package it.uniroma3.icr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.uniroma3.icr.dao.impl.ImageDaoImpl;
import it.uniroma3.icr.model.Image;


@Service
public class ImageFacade {

	@Autowired
	private ImageDaoImpl imageDaoImpl;
	
	public void addImage(Image i) {
		imageDaoImpl.insertImage(i);
	}
	
	public Image retriveImage(long id) {
		return this.imageDaoImpl.findImage(id);
	}
	
	public List<Image> retriveAllImages() {
			return this.imageDaoImpl.findAll();
		}
}
	

