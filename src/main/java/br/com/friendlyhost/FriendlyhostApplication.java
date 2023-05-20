package br.com.friendlyhost;

import dto.*;
import entities.*;
import repository.*;
import services.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FriendlyhostApplication {

	public static void main(String[] args) {
		SpringApplication.run(FriendlyhostApplication.class, args);
	}
}