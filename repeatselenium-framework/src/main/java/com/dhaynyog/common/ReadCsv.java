package com.dhaynyog.common;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      
 {//hard-disk gives unique number to file called I-node (index node)
 // OS has one prgm which used to convert file-name to I-node called NameI (name to I-node)
// file is stored on Harddisk in any clyender 
//(Hard disk has clyender -->clyenders has sectors-->sectors has block->and data is stored is in block
//your are given filename to OS ->OS serach for inode-> inode serach for block->
	 //OS read data from block and then it take data from harddisk to Ram
	 // Ram is also called as Buffer/Cache
	 
			String csvFile = "/Users/ssb/Documents/selenium/ReadCsvFile.csv";
			BufferedReader br = null;
			String line = "";
			String csvSplitBy = ",";
			
			FileReader fr = new FileReader(csvFile); //Copy file frm hardisk to Ram 
			br = new BufferedReader(fr); // its read data from Ram
			while ((line = br.readLine())  != null) //it read data from Ram and Store it in line varibale
			{                                           //also it return null if there is no data in file
				String[] country = line.split(csvSplitBy);
						
				System.out.println(line);
			}
	    }

    }

}
