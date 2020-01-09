package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadandWrite {
	
	void readFile() throws FileNotFoundException
	{
		FileInputStream fis= new FileInputStream("d:/content.txt");
	}
    void saveFile() throws FileNotFoundException{
    	String text= "this is demo";
    	FileOutputStream fos= new FileOutputStream("d:/blur.txt");
    }}


class Test8{
	
	public static void main(String[] args) {
		ReadandWrite rw= new ReadandWrite();
		try {			
			rw.saveFile();
		}
		catch(FileNotFoundException e) {
		
	}}}


