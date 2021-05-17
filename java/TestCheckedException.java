package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckedException {

	public static void main(String[] args) throws IOException{
		//control+1 : fix
		FileReader fr = new FileReader("c:\\java\\HelloWorld.java");
		System.out.println("done");

	}

}
