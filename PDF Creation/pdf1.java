import java.io.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;

class pdf1
{
public static void main(String gg[ ])
{
try
{
PdfWriter pdfWriter=new PdfWriter(new File("pdf1.pdf"));
PdfDocument pdfDocument=new PdfDocument(pdfWriter);
Document document=new Document(pdfDocument);
document.add(new Paragraph("God is great , Ujjain is the clean city"));
document.close( );
System.out.println("PDF file created");
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
}