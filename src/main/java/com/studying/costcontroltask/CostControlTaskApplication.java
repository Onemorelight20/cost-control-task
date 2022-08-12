package com.studying.costcontroltask;

import com.studying.costcontroltask.entity.User;
import com.studying.costcontroltask.logic.App;
import com.studying.costcontroltask.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CostControlTaskApplication implements CommandLineRunner {

    @Autowired
    UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(CostControlTaskApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        final String EXIT = "exit";
        while(true){
            String command = scanner.nextLine();
            System.out.println("Command: " + command);
            if(command.equals(EXIT)){
                break;
            }

        }
        System.out.println("THE END");
    }
}
