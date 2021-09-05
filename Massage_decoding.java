import java.io.*;
import java.util.*;
import java.lang.*;

public class Massage_decoding {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String metadata;
		BufferedReader buff= new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Data Packets: ");
		metadata=buff.readLine();
		printmassage(metadata);
	}
	static void printmassage(String metadata)
	{
//		taking first 8 bit as f_byte
		String f_byte=metadata.substring(0,8);
		int len=metadata.length();
//		System.out.print(f_byte);
//		2nd byte length of the hidden massage
		String s_byte=metadata.substring(8, 16);
		int num_of_char=decimal(s_byte);
		System.out.println("Length of the massage: "+num_of_char);
		String sub;
		String xor = "";
		String massage="";
		for(int i=16;i<len;i=i+8)
		{
			sub=metadata.substring(i,i+8);
//			System.out.println("Substring:"+sub);
//			XOR with first byte 
			xor="";
			for(int j=0;j<8;j++)
			{
				if(sub.charAt(j)==f_byte.charAt(j))
				{
					xor+="0";
					
				}
				else
				{
					xor+="1";
				}
			}
			int num=decimal(xor);
//			System.out.println("Number: "+num);
			massage+=(char)num;	
		}
//		System.out.println("Xor value"+xor);
		System.out.println("And the Massage is: "+massage);
		
	}
//	finding decimal value of the binary substring 
	static int decimal(String data)
	{
		int deci_value=0,count=0;
		int c = 0;
		for(int i=data.length()-1;i>=0;i--)
		{
			char ch=data.charAt(i);
			if(ch=='0')
			{
				deci_value+=0;	
				count++;
			}
			else
			{
				c=(int) Math.pow(2, count);
				deci_value=deci_value+c;
				count++;
			}	
		}
//		System.out.print(deci_value);
		return deci_value;
		
	}

}
