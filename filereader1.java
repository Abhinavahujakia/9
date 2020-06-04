package filereader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filereader1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File obj=new File("E:\\type\\writer2.txt");
		FileWriter fw=new FileWriter(obj);
		BufferedWriter bw=new BufferedWriter(fw);
		
		for(int i=0;i<4;i++)
		{			
		
			for(int j=0;j<6;j++)
			{
				bw.write(j+"\t");
				bw.write("abhi");
				
			}
			bw.newLine();
		}
		
		bw.close();
	}

}
