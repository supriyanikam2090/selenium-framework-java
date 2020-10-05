package com.dhaynyog.common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

@Listeners({IInvokedListenerImpl.class})
public class BaseSelenium {

	@DataProvider(name="loginDataFromExcel")
	public String[][] getDataFromExcel() throws Exception
	{
		
		return ExcelReader.getExcelTableArray("/Users/ssb/Documents/ReadExcel1.xlsx", "Sheet1");
	}
	

    @DataProvider(name="loginData")
	public String[][] getArrayData(){
    	 
    	 String[][] loginData = {{"admin","admin123"},//0th index
    			                   // 0th , 1st 
    			            
    			                 {"supriya","supriya123"} //1st index
    	                        }; // 2 dimensional array declration and Initialzation 
    	 
    	 return loginData;
     }
      
    @DataProvider(name ="loginDataFromCsv")
      public String[][] getDataFromCsv() throws IOException{
    	  
    	String csvFile = "/Users/ssb/Documents/selenium/ReadCsvFile.csv";
		BufferedReader br = null;
		String line = "";
		String csvSplitBy = ",";
		String[][] loginData= new String[3][3];// two dimensional Array declaration only
		int i = 0;
		
		
		FileReader fr = new FileReader(csvFile); //Copy file frm hardisk to Ram 
		br = new BufferedReader(fr); // its read data from Ram
		while ((line = br.readLine())  != null) //it read data from Ram and Store it in line varibale
		{                                           //also it return null if there is no data in file
			String[] data = line.split(csvSplitBy); // it will create single array {"admin","admin123}
			loginData[i] = data; // and it will place in loginData's 0th index and then will increment
					
			System.out.println(line);
			i = i+1;
		}
		return loginData;
    }
    
}

