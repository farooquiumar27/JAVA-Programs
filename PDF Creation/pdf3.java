import java.io.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.io.image.*;

class pdf3
{
public static void main(String gg[ ])
{
try
{
PdfWriter pdfWriter=new PdfWriter(new File("pdf3.pdf"));
PdfDocument pdfDocument=new PdfDocument(pdfWriter);
Document document=new Document(pdfDocument);
Image img=new Image(ImageDataFactory.create("pic1.jpg"));
Paragraph p1=new Paragraph();
p1.add(img).add("God is great , Ujjain is the clean city");
document.add(p1);
document.close( );
System.out.println("PDF file created");
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
}