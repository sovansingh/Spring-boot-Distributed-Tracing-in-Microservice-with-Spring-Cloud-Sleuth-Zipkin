package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServer1Application.class, args);
	}

}
