package com.spring.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {
	
	private List<String> fortuneList;
	private String fortuneFile = ".\\src\\fortunes.txt";
	private Random myRandom;
	
	public DatabaseFortuneService() {
		fortuneList = new ArrayList<String>();
		
		try {
			BufferedReader br =  new BufferedReader(new FileReader(fortuneFile));
			String tempLine;
			while((tempLine = br.readLine()) != null) {
				fortuneList.add(tempLine);
			}
			br.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Override
	public String getFortune() {
		myRandom = new Random();
		return fortuneList.get(myRandom.nextInt(fortuneList.size()));
	}

}
