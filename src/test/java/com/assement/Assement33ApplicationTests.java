package com.assement;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assement.repository.ItemRepository;

@SpringBootTest
class Assement33ApplicationTests {
	
	@Autowired
	private ItemRepository itemRepository ;
	
	 @Test
	    void contextLoads() {
	        System.out.println(itemRepository);
	    
	   
	    }
	}

	