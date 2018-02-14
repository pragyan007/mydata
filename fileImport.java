package fileImport;
import java.io.*;
import java.util.*;

public class fileImport {

    public static void main(String[] args) {
    	Random rd = new Random();
    	int n = rd.nextInt(10)+1;
        File file= new File("C:/Users/pragyan.mishra/Desktop/Book1.csv");
        List<List<String>> lines = new ArrayList<>();
        Scanner inputStream;

        try{
            inputStream = new Scanner(file);

            while(inputStream.hasNext()){
                String line= inputStream.next();
                String[] values = line.split(",");
                lines.add(Arrays.asList(values));
            }

            inputStream.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int lineNo = 1;
        for(List<String> line: lines) {
            int columnNo = 1;
            for (String value: line) {
                System.out.println("Line " + lineNo + " Column " + columnNo + ": " + value);
                if (columnNo==1)
                {
                	//x=value
                	double a = Double.parseDouble(value)+6*n;
                	System.out.println("Value of equation involving X:" + a);
                }
                else if (columnNo==2)
                {
					//y=value
                	double b = Double.parseDouble(value)+2+n;
                	System.out.println("Value of equation involving Y:" + b);
                }
                
                columnNo++;
            }
            lineNo++;
        }
    }

}