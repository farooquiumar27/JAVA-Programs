import java.io.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.io.font.*;
import com.itextpdf.kernel.font.*;
import com.itextpdf.io.font.constants.StandardFonts;
class pdf2
{
public static void main(String gg[ ])
{
try
{
PdfWriter pdfWriter=new PdfWriter(new File("pdf2.pdf"));
PdfDocument pdfDocument=new PdfDocument(pdfWriter);
Document document=new Document(pdfDocument);
PdfFont font=PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
Paragraph p1=new Paragraph("God is great , Ujjain is the clean city");
p1.setFont(font);
Paragraph p2=new Paragraph("God is great , Ujjain is the clean city");
p2.setFont(font);
p2.setFontSize(18);
PdfFont boldFont=PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
Paragraph p3=new Paragraph("God is great , Ujjain is the clean city");
p3.setFont(boldFont);
document.add(p1);
document.add(p2);
document.add(p3);
document.close( );
System.out.println("PDF file created");
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
}