package it.uniroma3.icr.controller;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Symbol;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.model.Administrator;
import it.uniroma3.icr.model.Image;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.service.impl.SymbolFacade;
import it.uniroma3.icr.service.impl.TaskFacade;
import it.uniroma3.icr.service.editor.SymbolEditor;
import it.uniroma3.icr.service.impl.AdminFacade;
import it.uniroma3.icr.service.impl.ImageFacade;
import it.uniroma3.icr.service.impl.JobFacade;
import it.uniroma3.icr.service.impl.ResultFacade;

@Controller
public class AdminController {
	
	private @Autowired SymbolEditor symbolEditor;
	
	@Autowired
	private AdminFacade adminFacade;
	
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
	
	@Qualifier("adminValidator")
	private Validator validator;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Symbol.class, this.symbolEditor);
		binder.setValidator(validator);
	}
	
	@RequestMapping(value="/insertJob")
	private String newJob(@ModelAttribute Job job,@ModelAttribute Task task, Model model) {
		model.addAttribute("symbols", symbolFacade.retriveAllSymbols());
		model.addAttribute("images", imageFacade.retriveAllImages());
		model.addAttribute("job", job);
		model.addAttribute("task", task);
		return"administration/insertJob";
	}
	
	@RequestMapping(value="/homeAdmin")
	public String toHomeAdmin() {
		return"administration/homeAdmin";
	}
	
	@RequestMapping(value="/addJob", method = RequestMethod.POST)
	public String confirmJob(@ModelAttribute Job job,@ModelAttribute Task task,@ModelAttribute Image image,@ModelAttribute Result result, Model model) {
		
		List<Image> jobImages = new ArrayList<>();
		List<Image> imgs = imageFacade.retriveAllImages();

		for(int k=0;k<job.getNumberOfImages();k++) {
			image = imgs.get(k);
			jobImages.add(image);
		}
		job.setImages(jobImages);
		facadeJob.addJob(job);
		
		int numberTask = job.getNumberOfImages()/job.getTaskSize();
	
		for(int i = 0; i<numberTask;i++) {
			 task = new Task();
			
			task.setJob(job);
			facadeTask.addTask(task);
			
			for(Image j : job.getImages()) {
			
				result = new Result();
				result.setImage(j);
				result.setTask(task);
				facadeResult.addResult(result);
			}
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
	
	@RequestMapping(value="/registrationAdmin", method=RequestMethod.GET)
	public String registration(@ModelAttribute Administrator administrator, Model model) {
		return "registrationAdmin";
	}
	
	@RequestMapping(value="/addAdmin", method = RequestMethod.POST)
	public String confirmAdmin(@ModelAttribute Administrator administrator,
			@Validated Administrator a,BindingResult bindingResult,Model model) {
		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		String passwordEncode = passwordEncoder.encode(administrator.getPassword());
		administrator.setPassword(passwordEncode);
		adminFacade.addAdmin(administrator);
		return "login";
		
	}
	
	@RequestMapping(value="/confirmAdmin", method = RequestMethod.POST)
	public String addAdmin(@ModelAttribute Administrator administrator, 
			@Validated Administrator a,BindingResult bindingResult,Model model){
		
		Administrator p = adminFacade.retrieveAdmin(administrator.getUsername());
		if(bindingResult.hasErrors()) {
			return "registrationAdmin";
		}
		if(p!=null) {
			model.addAttribute("usernameError", "Username Already Exists");
			return "registrationAdmin";
		}
		
		model.addAttribute("administrator", administrator);
		return "registrationAdmin";
	}
	
	
}
	
	
	
	

	
	
	
	

