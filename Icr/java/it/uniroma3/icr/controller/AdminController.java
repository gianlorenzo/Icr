package it.uniroma3.icr.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Symbol;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.model.Image;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.service.impl.SymbolFacade;
import it.uniroma3.icr.service.impl.TaskFacade;
import it.uniroma3.icr.service.editor.SymbolEditor;
import it.uniroma3.icr.service.impl.ImageFacade;
import it.uniroma3.icr.service.impl.JobFacade;
import it.uniroma3.icr.service.impl.ResultFacade;

@Controller
public class AdminController {
	
	private @Autowired SymbolEditor symbolEditor;
	
	@Autowired
	private JobFacade facadeJob;
	
	@Autowired
	private TaskFacade facadeTask;
	
	@Autowired
	private ResultFacade facadeResult;
	
	@Autowired
	private SymbolFacade symbolFacade;;
	
	@Autowired
	private ImageFacade imageFacade;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Symbol.class, this.symbolEditor);
	}
	
	@RequestMapping(value="/insertJob")
	private String newJob(@ModelAttribute Job job, Model model) {
		model.addAttribute("symbols", symbolFacade.retriveAllSymbols());
		model.addAttribute("images", imageFacade.retriveAllImages());
		return"administration/insertJob";
	}
	
	@RequestMapping(value="/homeAdmin")
	public String toHomeAdmin() {
		return"administration/homeAdmin";
	}
	
	@RequestMapping(value="/addJob", method = RequestMethod.POST)
	public String confirmJob(@ModelAttribute Job job, Model model) {
		
		List<Image> imgs = imageFacade.retriveAllImages();
		
		job.setImage(imgs);
		
		facadeJob.addJob(job);
		
		int numberTask = job.getImages()/job.getTaskSize();
//		
//		int numPerc1 = (job.getImages()*job.getPercentageType1())/100;
//		
//		int numPerc2 = (job.getImages()*job.getPercentageType2())/100;
//		
//		int numPerc3 = (job.getImages()*job.getPercentageType3())/100;
		
		for(int i = 0; i<numberTask;i++) {
			Task task = new Task();
			
			task.setJob(job);
			facadeTask.addTask(task);
			
			
			for(Image j : job.getImage()) {
			
			Result result = new Result();
			
			result.setImage(j);
			
			result.setTask(task);
			
			facadeResult.addResult(result);
			}
		
			
			
		
//			for(int j=0;j<job.getImages();j++) {
//				
//			
//			
//			
//			for(int h=0; h<numPerc1;h++) {
//				if(job.getImage().get(h).getType().equals("t1"))
//					result.setImage(job.getImage().get(h));
//				facadeResult.updateResult(result);
//			}
//			
//			for(int m=0;m<numPerc2;m++) {
//				if(job.getImage().get(m).getType().equals("t2"))
//					result.setImage(job.getImage().get(m));
//				facadeResult.updateResult(result);
//
//			}
//			
//			for(int n=0;n<numPerc3;n++) {
//				if(job.getImage().get(n).getType().equals("t3"))
//					result.setImage(job.getImage().get(n));
//				facadeResult.updateResult(result);
//
//			}
//			
//			
//			
//			}
		}
			
			
		
		
		return "administration/jobRecap";
	}
	
	@RequestMapping(value="/insertSymbol")
	public String toAddSymbol(@ModelAttribute Symbol symbol) {
		return "administration/insertSymbol";
	}
	
	@RequestMapping(value="/addSymbol", method = RequestMethod.POST)
	public String addSymbol(@ModelAttribute Symbol symbol, Model model) {
		symbolFacade.insertSymbol(symbol);
		
		model.addAttribute("symbol", symbol);
		
		
		return"administration/insertSymbol";
		
	}
	
	
	
	
	

	
	
	
	
}
