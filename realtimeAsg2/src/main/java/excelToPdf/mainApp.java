package excelToPdf;

import java.io.IOException;


public class mainApp {
    public static void main(String[] args) throws IOException {
        readExcel read = new readExcel();
        read.readFromExcel();
        readExcel.printArrayList();

        writePdf writePdf = new writePdf();
        writePdf.writeToPdf(readExcel.getChessArrayList());
    }

}
