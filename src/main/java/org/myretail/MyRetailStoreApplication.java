package org.myretail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRetailStoreApplication {

	// For better approach, this value can be read from application property file
	public static String DATABASE_NAME = "MyRetailProducts";

	public static void main(String[] args) {
		SpringApplication.run(MyRetailStoreApplication.class, args);
	}
}
