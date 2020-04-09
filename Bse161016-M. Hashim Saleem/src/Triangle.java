public class Triangle {    public Triangle() {		}
	public String TriangleCheck(int A1, int A2, int A3, int S1, int S2, int S3)
	   {	String Triangle="";	
		   int check=0;
		   if(A1>0 && A1<179 && A2>0 && A2<179 && A3>0 && A3<179)
		   {  if(A1+A2+A3==180)
			   {  check=1; }
			   else 
				{  return "Invalid"; }  }
		   if(check==1)
		   {   if(S1>0 && S2>0 && S3>0)
				{	if ((S1+S2)>S3 && (S1+S3)>S2 && (S2+S3)>S1) 
				   {   check=1;   }  
				} else
		        	{   return "Invalid"; }   }
		    if(check==1)
		   {    if(S1==S2 && S2==S3)
			   {
				   Triangle="Equilateral Triangle ";
			   }
			   else if(S1==S2 || S2==S3 || S3==S1)
			   {
				   Triangle="Isosceles Triangle ";
			   }
			   else if(S1!=S2 && S2!=S3 && S1!=S3)
			   {
				   Triangle="Scalene Triangle ";
			   }
			   if(A1<90 && A2<90 && A3<90)
			   {
				   Triangle=Triangle+" Acute Triangle";
			   }
			   else if(A1==90 || A2==90 || A3==90)
			   {
				   Triangle=Triangle+" Right Triangle";
			   }
			   else if(A1>90 || A2>90 || A3>90)
			   {
				   Triangle=Triangle+" Obtuse Triangle";
			   }   }
		   return Triangle;   }   }
