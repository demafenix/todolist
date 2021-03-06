package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Todolist;
import repository.UserRepository;
import update.dataDelete;
import update.dataUpdate;
import validation.GroupOrder;

@Controller
public class LoginController{
	
	@Autowired
	UserRepository userRep;
	@RequestMapping(value="/index",method=RequestMethod.GET)
	public String index(Model model) {
		
		List<Todolist> todolist=userRep.findAllByOrderByDateAsc();
		model.addAttribute("list", todolist);
		return "index";
	}
	
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public String update(Model model) {
		return "update";
	}
	
	@RequestMapping(value="/indexpr",method=RequestMethod.POST)
	public String sortpriority(Model model) {
		List<Todolist> todolist=userRep.findAllByOrderByPriorityDescDateAsc();
		model.addAttribute("list", todolist);
		return "index";
	}
	
	@RequestMapping(value="/indexda",method=RequestMethod.POST)
	public String sortdate(Model model) {
		List<Todolist> todolist=userRep.findAllByOrderByDateAsc();
		model.addAttribute("list", todolist);
		return "index";
	}
	
	@RequestMapping(value="/indexup",method=RequestMethod.POST)
	public String indexUpadate(Model model,@Validated(GroupOrder.class) @ModelAttribute("dataUpdate") dataUpdate dataUpdate,BindingResult result)
	{
		if(result.hasErrors()) {
			return "update";
		}
		this.userRep.save(new Todolist(0,dataUpdate.getDate(),dataUpdate.getPriority(),dataUpdate.getData()));
		List<Todolist> todolist=userRep.findAllByOrderByDateAsc();
		model.addAttribute("list", todolist);
		return "index";
	}
	
	@RequestMapping(value="/indexdel",method=RequestMethod.POST)
	public String indexDelete(Model model,@Validated(GroupOrder.class) @ModelAttribute("dataDelete") dataDelete dataDelete,BindingResult result)
	{
		if(result.hasErrors()) {
			List<Todolist> todolist=userRep.findAllByOrderByDateAsc();
			model.addAttribute("list", todolist);
			return "index";
		}
		this.userRep.delete(this.userRep.findById(dataDelete.getId()));
		List<Todolist> todolist=userRep.findAllByOrderByDateAsc();
		model.addAttribute("list", todolist);
		return "index";
	}
	
}