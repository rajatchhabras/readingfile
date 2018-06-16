package readingfile;
import java.io.*;
public class readingfile {

	public static void main(String[] args) throws IOException{
		File f1=new File("C:\\Users\\DELL\\eclipse-workspace\\readingfile\\src\\readingfile\\abc.txt");
		f1.createNewFile();
		FileInputStream fin=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\readingfile\\src\\readingfile\\abc.txt");
		int i;
		do
		{
			i=fin.read();
			if(i!=-1)
				System.out.print((char)i);
		}while(i!=-1);
		fin.close();
			
			
		}
		
	}

		

