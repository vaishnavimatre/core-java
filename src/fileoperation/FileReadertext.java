package fileoperation;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadertext {
	public static void main(String args[])throws IOException {
		File file =new File("\\Users\\VAISHNAVI MATRE\\eclipse-workspace\\corejava\\src\\fileoperation\\UserDB.txt");
		FileReader fr=new FileReader(file);
		BufferedReader br=new BufferedReader(fr);
		String Line="";
		while((Line=br.readLine())!=null){
			System.out.println(Line);
		}
	}
	}


