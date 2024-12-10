package Test;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class LineCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String inputFilePath = "C:\\Users\\Administrator\\eclipse-workspace\\Test\\src\\MyFamily_Input";    // Input file path
 String outputFilePath = "C:\\Users\\Administrator\\eclipse-workspace\\Test\\src\\MyFamily_Output";  // Output file path
 int count = 0;
 try (FileReader fileReader = new FileReader(inputFilePath)) {
 int character;
 boolean isNewLine = true;
 while ((character = fileReader.read()) != -1) {
 if (character == '\n') {       
 count++;
 isNewLine = true;
 } else {
isNewLine = false;
}
 }
if (!isNewLine) {
 count++;
 }
try (FileWriter fileWriter = new FileWriter(outputFilePath)) {
 fileWriter.write("Number of lines: " + count);
		            }
 System.out.println("Line count written to " + outputFilePath);
} catch (IOException e) {
 System.out.println("An error occurred: " + e.getMessage());
		        }
		    }
		
	}


