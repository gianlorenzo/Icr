package it.uniroma3.icr.controller;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import it.uniroma3.icr.model.Image;
import it.uniroma3.icr.model.Job;
import it.uniroma3.icr.model.Result;
import it.uniroma3.icr.model.Student;
import it.uniroma3.icr.model.Symbol;
import it.uniroma3.icr.model.Task;
import it.uniroma3.icr.service.editor.ImageEditor;
import it.uniroma3.icr.service.editor.TaskEditor;
import it.uniroma3.icr.service.impl.ImageFacade;
import it.uniroma3.icr.service.impl.JobFacade;
import it.uniroma3.icr.service.impl.ResultFacade;
import it.uniroma3.icr.service.impl.StudentFacade;
import it.uniroma3.icr.service.impl.TaskFacade;

@Controller
public class TaskController {
	
	private @Autowired ImageEditor imageEditor;
	
	private @Autowired TaskEditor taskEditor;
	
	@Autowired
	public JobFacade facadeJob;
	
	@Autowired
	public ImageFacade imageFacade;

	@Autowired
	public TaskFacade taskFacade;
	
	@Autowired
	public StudentFacade studentFacade;
	
	@Autowired ResultFacade resultFacade;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Image.class, this.imageEditor);
		binder.registerCustomEditor(Task.class, this.taskEditor);
		
	}

	
	
	@RequestMapping(value="/newTask", method = RequestMethod.GET)
	public String task(@ModelAttribute Task task,@ModelAttribute Job job,@ModelAttribute Result result,
			@ModelAttribute Image image ,Model model) {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String s = auth.getName();
		Student student = studentFacade.retrieveUser(s);
		List<Task> tasks = taskFacade.retriveAllTask();
		task = getMathRandomList(tasks);
		
		if(task.getStudent() == null){
			task.setStudent(student);
			taskFacade.updateTask(task);
		}
		model.addAttribute("task", task);

		return "users/newTask";
	}
	
	@RequestMapping(value="/taskRecap", method = RequestMethod.POST)
	public String taskRecap(@ModelAttribute Task task,@ModelAttribute Result result,
			Model model) {
		List<Result> results = resultFacade.findTaskResult(task);
		for(Result r : results) {
			r.setAnswer("yes");
			resultFacade.updateResult(r);
		}
		return "users/taskRecap";

	}

		
		
	
	@RequestMapping(value="/taskComplete")
	public String taskComplete(@ModelAttribute Task task,@ModelAttribute Result result, Model model) {
		
		return "users/task";
		
	}
	
	public Task getMathRandomList(List<Task> list) {
        int index = (int) (Math.random() * list.size());
       return  list.get(index);
   }
	
	
	
}