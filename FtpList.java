package Proj.pack;

/**
 * Hello world!
 *
 */
import org.apache.commons.net.ftp.FTPClient;
import java.io.IOException;

public class FtpList {

	
	public static void main(String[] args) {
		
		 FTPClient client = new FTPClient();
		 
	        try {
	            client.connect("ftp.mozilla.org");
	            client.login("anonymous", "");
	 
	         
	            String[] names = client.listNames();
	            for (String name : names) {
	                System.out.println("Name = " + name);
	            }

	            client.logout();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                client.disconnect();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

	}

}
