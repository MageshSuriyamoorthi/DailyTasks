package readingXlsx;


import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class Excelreader {
public static void main(String[] args) {
      String xlsxFile = "D:\\\\eclipse-workspace\\\\readingXlsx\\\\Book1.xlsx";
      String line = "";
      String xlsxSplitBy = "\t";

      try (BufferedReader br = new BufferedReader(new FileReader(xlsxFile))) {

          while ((line = br.readLine()) != null) {

              // use comma as separator
              String[] name = line.split(xlsxSplitBy);

              System.out.println("SalesJan [name= " + name[0] + " , name=" + name[1] + " , name=" + name[2]+"]" );

          }

      } catch (IOException e) {
          e.printStackTrace();
      }

  }
}

