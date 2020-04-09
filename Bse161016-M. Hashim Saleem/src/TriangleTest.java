import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TriangleTest 
{

		Triangle Test = new Triangle();

		@ParameterizedTest
		@CsvFileSource(resources = "test.csv")
		void TestTriangle(int angle1,int angle2,int angle3, int side1,int side2,int side3, String expected) 
		{
			assertEquals(expected,Test.TriangleCheck(angle1,angle2,angle3,side1,side2,side3));
		}
	
}
