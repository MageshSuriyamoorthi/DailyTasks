package industry;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class aaa1 {

   public static void main(String[] args) {

       String xlsxFile = "C:\\\\Users\\\\magesh.suriyamoorthi\\\\Downloads\\\\file_example_XLSX_10.xlsx";
       String line = "";

       try (BufferedReader br = new BufferedReader(new FileReader(xlsxFile))) {

           while ((line = br.readLine()) != null) {

               
               String Firstname = "Dulce";
               

               System.out.println("SalesJan [name= " + Firstname + " , name=" + Firstname + "]");

           }

       } catch (IOException e) {
           e.printStackTrace();
       }

   }

}
