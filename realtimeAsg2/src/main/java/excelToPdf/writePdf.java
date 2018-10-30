package excelToPdf;



import java.io.FileOutputStream;
import java.util.ArrayList;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;



public class writePdf {
    public void writeToPdf( final ArrayList<Chess> chessArrayList)  {
        String file = "C:/Users/Dell/Downloads/realtimeAsg2/ChessResultLists.pdf";

        try
        {
            System.out.println("");
            System.out.println("PDF file is creating......");
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(file));
            Paragraph p1 = new Paragraph ("From the Tournament-Database of Chess-Results http://chess-results.com");
            Paragraph p2 = new Paragraph ("KEJOHANAN TERTUTUP KUANTAN 2018 LELAKI ");
            Paragraph p3 = new Paragraph ("Last update 29.09.2018 14:17:36");
            Paragraph p4 = new Paragraph ("Starting rank");
            Paragraph p5 = new Paragraph ("You find all details to this tournament under  http://chess-results.com/tnr380806.aspx?lan=1");
            Paragraph p6 = new Paragraph ("Chess-Tournament-Results-Server: Chess-Results");
            PdfPTable table = new PdfPTable(new float[] { 1, 6, 1, 1, 1, 3 });
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);

            for (Chess info : readExcel.getChessArrayList()) {
                table.addCell(info.getNo());
                table.addCell(info.getName());
                table.addCell(info.getFieldID());
                table.addCell(info.getFed());
                table.addCell(info.getRtg());
                table.addCell(info.getClub());
            }

            document.open();
            document.add(p1);
            document.add(p2);
            document.add(p3);
            document.add(p4);
            document.add(table);
            document.add(p5);
            document.add(p6);
            document.close();
            System.out.println("PDF file created successfully.......");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}