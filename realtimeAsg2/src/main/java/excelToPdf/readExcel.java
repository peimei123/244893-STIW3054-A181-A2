package excelToPdf;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;



public class readExcel {
    private final static String path = "C:/Users/Dell/Downloads/chessResultsList.xlsx";
    private static ArrayList<Chess> chessArrayList = new ArrayList<Chess>();


    public static void readFromExcel() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(path));
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet xssfSheet = xssfWorkbook.getSheetAt(0);
        Iterator<Row> rowIterator = xssfSheet.iterator();
        DataFormatter dataFormatter = new DataFormatter();

        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
             if(row.getRowNum()>=4&& row.getRowNum()<=154) {
                String no = dataFormatter.formatCellValue(row.getCell(0));
                String name = row.getCell(2).toString();
                String fidelID = row.getCell(3).toString();
                String fed = row.getCell(4).toString();
                String rtg = dataFormatter.formatCellValue(row.getCell(5));
                String club = row.getCell(6).toString();
                chessArrayList.add(new Chess(no, name, fidelID, fed, rtg, club));
            }

        }
    }


    public static void printArrayList() {
        for (Chess chess : chessArrayList) {
            System.out.printf("%-3s %-40s %-6s %-5s %-2s %-25s %n",chess.getNo(),chess.getName(),chess.getFieldID(),
                    chess.getFed(), chess.getRtg(), chess.getClub());
        }
    }

    public static ArrayList<Chess> getChessArrayList() {
        return chessArrayList;
    }


}