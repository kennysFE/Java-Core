package lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamIO {
	public static void main(String[] args) throws IOException {
		 FileInputStream in = null;
	        FileOutputStream out = null;

	        try {
	        	// relative path 
	            in = new FileInputStream("./src/lab10/text");
	            
	            
	            out = new FileOutputStream("./src/lab10/outagain.txt");
	            int c;

	            while ((c = in.read()) != -1) {
	                out.write(c);
	            }
	        } finally {
	            if (in != null) {
	                in.close();
	            }
	            if (out != null) {
	                out.close();
	            }
	            System.out.println("end ");
	        }
	}
}
