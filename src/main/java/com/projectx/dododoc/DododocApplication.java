package com.projectx.dododoc;

import com.projectx.dododoc.service.KoreanService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

@SpringBootApplication
public class DododocApplication {

	public static void main(String[] args)  {
		SpringApplication.run(DododocApplication.class, args);
	}
}
