import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		FileReader fr=new FileReader("C:\\Users\\HP\\workspace\\LambdaExample\\src\\temp.txt");
		
		FileWriter fw=new FileWriter("temp1.txt",true);
		
		int temp_1;
        while ((temp_1 = fr.read()) != -1) {
            fw.write(temp_1);
        }
		fr.close();
		fw.close();
		
		
	}

}
