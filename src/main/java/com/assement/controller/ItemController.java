package com.assement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assement.assement33.entiies.Item;
import com.assement.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService ;

		//localhost:8080/create
	
	@RequestMapping("/create")
	public String viewCreateItemForm() {
		return "create_item";
	}
    
	@RequestMapping("/saveReg")
	public String saveoneItem(Item item) { 
		itemService.saveReg(item);
		//System.out.println(item.getName());
		//System.out.println(item.getCategory());
		//System.out.println(item.getQuantity());
		//System.out.println(item.getStatus());
		//System.out.println("Done");
		return "create_item";
		
		
	}
}