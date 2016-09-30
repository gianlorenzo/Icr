package it.uniroma3.icr.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import it.uniroma3.icr.model.Image;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.model.Student;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.service.editor.ImageEditor;
import it.uniroma3.icr.service.impl.ImageFacade;
import it.uniroma3.icr.service.impl.JobFacade;
import it.uniroma3.icr.service.impl.StudentFacade;
import it.uniroma3.icr.service.impl.TaskFacade;

@Controller
public class TaskController {
	
	private @Autowired ImageEditor imageEditor;
	
	@Autowired
	public JobFacade facadeJob;
	
	@Autowired
	public ImageFacade imageFacade;

	@Autowired
	public TaskFacade taskFacade;
	
	@Autowired
	public StudentFacade studentFacade;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Image.class, this.imageEditor);
	}
	
	
	@RequestMapping(value="/newTask", method = RequestMethod.GET)
	public String task(@ModelAttribute Task task, Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String s = auth.getName();
		Student student = studentFacade.retrieveUser(s);
		List<Job> jobs = new ArrayList<>();
		if(!(auth instanceof AnonymousAuthenticationToken)) {
			jobs = facadeJob.retriveAlljobs();
			model.addAttribute("job", getMathRandomList(jobs));
			model.addAttribute("image", imageFacade.retriveAllImages());
			List<Image> img = imageFacade.retriveAllImages();
			task.setImages(img);
			task.setStudent(student);
			taskFacade.addTask(task);
			List<Long> images = new ArrayList<>();
			for(Image i : img)
				images.add(i.getId());
			model.addAttribute("images", images);
			
			
		}
		return "users/newTask";
	}
	
	@RequestMapping(value="/taskRecap", method = RequestMethod.POST)
	public String taskRecap(@ModelAttribute Task task, Model model,BindingResult result) {
		model.addAttribute("task", task);
		return "users/taskRecap";
		
	}
	
	public Job getMathRandomList(List<Job> list) {
        int index = (int) (Math.random() * list.size());
       return  list.get(index);
   }
	
	
	
}
