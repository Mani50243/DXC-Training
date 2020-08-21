package javamanideep;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import mytask.Student1;

public class FileTask {
	public static void main(String[] args) {
		
		
		
		try {
			FileReader fi=new FileReader("data.txt");
			BufferedReader bi=new BufferedReader(fi);
			
			String s=bi.readLine();
			boolean b;
			ArrayList<Student1> st=new ArrayList<>();
			while(true) {
				s=bi.readLine();
				if(s == null) {
					break;
				}
				String[] data=s.split(",");
				Student1 s1=new Student1();
				s1.setRollno(Integer.parseInt(data[0]));
				s1.setClid(Integer.parseInt(data[1]));
				s1.setName(data[2]);
				s1.setGender(data[3]);
				s1.setSem(data[4]);
				s1.setMarks(Integer.parseInt(data[5]));
				st.add(s1);	
			}
			for(Student1 sio:st) {
				System.out.println(sio);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileReader fr=new FileReader("data.txt");
			BufferedReader brd=new BufferedReader(fr);
			String s;
			String rs;
			s=brd.readLine();
			do {
			rs=s.replaceAll(",","     ");
			System.out.println(rs);
			
			}while((s=brd.readLine())!=null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
