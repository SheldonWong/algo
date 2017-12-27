package com.gege.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FileUtils {
	
	//按行读取文件，返回行列表
	public static List<String> readLine(String filePath){
		List<String> list = new ArrayList<>();
		
		File file = new File(filePath);
		
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(file);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
			BufferedReader reader = new BufferedReader(inputStreamReader);
			String lineContent = "";
			while((lineContent = reader.readLine()) != null){
				list.add(lineContent);
			}
			fileInputStream.close();
			inputStreamReader.close();
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {  
	        e.printStackTrace();  
	    } 
		
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
