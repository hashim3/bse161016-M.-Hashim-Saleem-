import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;

import java.io.*;



public class TestTriangle {

	  
	Triangle test=new Triangle();
	
	   
	    
	   
	
	   
	   @Test
	   public void TestCases() throws IOException
	   {
		   String ExpectedResult="";
		   
		   
		   
		   FileOutputStream fos= new FileOutputStream("test.csv",true);
		   PrintWriter pw= new PrintWriter(fos);
		   
		 //  pw.println("Angel1, Angel2, Angel3, Side1, Side2, Side3, ExpectedResult");
		   
		   
		   
		   for(int s1=1; s1<=200; s1++)
		   {
			   if(s1==1 || s1==2 || s1==100 || s1==199 || s1==200)
			   {
				
			   for(int s2=1; s2<=200; s2++)
			   {
				   if(s2==1 || s2==2 || s2==100 || s2==199 || s2==200)
				   {

				   for(int s3=1; s3<=200; s3++)
				   {
					   if(s3==1 || s3==2 || s3==100 || s3==199 || s3==200)
					   {
						 
					   for(int a1=1; a1<=178; a1++)
					   {
						   if(a1==1 || a1==2 || a1==90 || a1==177 || a1==178)
						   {
							
						   for(int a2=1; a2<=178; a2++)
						   {
							   if(a2==1 || a2==2 || a2==90 || a2==177 || a2==178)
							   {
								   
							   for(int a3=1; a3<=178; a3++)
							   {
								   if(a3==1 || a3==2 || a3==90 || a3==177 || a3==178)
								   {
								   
								   ExpectedResult="";

								   if((a1+a2+a3)==180 && (s1+s2)>s3 && (s2+s3)>s1 && (s3+s1)>s2)
								   {
									   if(s1==s2 && s2==s3)
									   {
										   ExpectedResult="Equilateral Triangle ";
									   }
									   else if(s1==s2 || s2==s3 || s3==s1)
									   {
										   ExpectedResult="Isosceles Triangle ";
									   }
									   else if(s1!=s2 && s2!=s3 && s1!=s3)
									   {
										   ExpectedResult="Scalene Triangle ";
									   }
									   
									   if(a1<90 && a2<90 && a3<90)
									   {
										   ExpectedResult=ExpectedResult+" Acute Triangle";
									   }
									   else if(a1==90 || a2==90 || a3==90)
									   {
										   ExpectedResult=ExpectedResult+" Right Triangle";
									   }
									   else if(a1>90 || a2>90 || a3>90)
									   {
										   ExpectedResult=ExpectedResult+" Obtuse Triangle";
									   }
								   }
								   else
								   {
									   ExpectedResult="Invalid";
								   }
								   
								 
								   
								   
								//   System.out.println("Side 1:"+s1+"  Side 2:"+s2+"  Side 3:"+s3+"    Angel 1:"+a1+"  Angel 2:"+a2+"  Angel 3:"+a3+"     Expected Result: "+ExpectedResult+"   Result: "+Result  );

								   
								   	String print=a1+", "+a2+", "+a3+", "+s1+", "+s2+", "+s3+", "+ExpectedResult;
								   	
								   
								    
 
								    pw.println(print);

								   
								   
								   
								   ExpectedResult="";
								   
								   }
							   }
							   }
						   }
						   }
					   }
					   }
				   }
				   }
			   }
			   }
		   }
	   
	   
		   pw.close();
		   
		   System.out.println("Test Cases saved in Excel File");
		   
		   
		   
	   }
	   
	   

	   
	   
	   
}