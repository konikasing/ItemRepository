package com.assement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assement.assement33.entiies.Item;
import com.assement.repository.ItemRepository;

@Service
public class ItemServiceImpl implements ItemService {
	
	
	@Autowired
	private ItemRepository itemRepository ;
	
	
	
	@Override
	public void saveReg(Item item) {
		itemRepository.save(item);
		
	}
}
