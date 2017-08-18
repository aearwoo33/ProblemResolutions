package com.alan.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxWordCount {
	public static final Integer maximumWordCount = 15;
	public static void main(String[] args) {
		File file = new File("test.in");
		try (FileWriter writer = new FileWriter(file)){
			
			for (int i=0; i < maximumWordCount; i++){
				writer.write("word" + i + " ");
			}
			writer.write( System.lineSeparator());
			writer.write("not long enough" + System.lineSeparator());
			writer.write("too long 11 2 3 4 48 8 8 8 8 8 8 8 8 1" + System.lineSeparator());
			writer.write("not long enough" + System.lineSeparator());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		MaxWordCount maxWordCount = new MaxWordCount();
		List<String> strList =  maxWordCount.getMaxWordList(file, maximumWordCount);
		
		for (String str : strList){
			System.out.println(str);
		}
	}
	
	public List<String> getMaxWordList(File file, int maxCount) {
		List<String> strList = new ArrayList<>();
		
		try (Scanner scanner = new Scanner(file)){
			
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] words = line.split(" ");
				if (maxCount == words.length) {
					strList.add(line);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return strList;
		
		
	}
}
