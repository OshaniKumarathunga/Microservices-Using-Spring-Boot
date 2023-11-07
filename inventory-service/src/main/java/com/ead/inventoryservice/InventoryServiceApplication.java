package com.ead.inventoryservice;

import com.ead.inventoryservice.dao.InventoryRepository;
import com.ead.inventoryservice.entity.Inventory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("red dhal 200g");
			inventory.setQuantity(100);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("red rice 300g");
			inventory.setQuantity(100);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
		};
	}

}
