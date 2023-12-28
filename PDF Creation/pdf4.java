import java.io.*;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.*;
import com.itextpdf.layout.element.*;
import com.itextpdf.io.font.*;
import com.itextpdf.io.image.*;
import com.itextpdf.kernel.font.*;
import com.itextpdf.io.font.constants.*;
import com.itextpdf.layout.property.*;
class pdf4
{
public static void main(String gg[ ])
{
try
{
PdfWriter pdfWriter=new PdfWriter(new File("pdf4.pdf"));
PdfDocument pdfDocument=new PdfDocument(pdfWriter);
Document document=new Document(pdfDocument);
document.setMargins(15,15,15,15);
float columnWidth[ ]={1,5,5};
Table table=new Table(UnitValue.createPercentArray(columnWidth));
Cell headerCell=new Cell(1,3).add(new Paragraph("List of customers"));
table.addHeaderCell(headerCell);
PdfFont dataFont=PdfFontFactory.createFont(StandardFonts.TIMES_ROMAN);
PdfFont titleFont=PdfFontFactory.createFont(StandardFonts.TIMES_BOLD);
Paragraph title1=new Paragraph("S.No");
title1.setFont(titleFont);
title1.setFontSize(16);
Paragraph title2=new Paragraph("Customers");
title2.setFont(titleFont);
title2.setFontSize(16);
Paragraph title3=new Paragraph("Nationality");
title3.setFont(titleFont);
title3.setFontSize(16);
table.addHeaderCell(title1);
table.addHeaderCell(title2);
table.addHeaderCell(title3);
Object data[ ][ ]={
{1,"Ramesh","India"},
{2,"John","America"},
{3,"James","United Kingdom"},
{4,"Rusave","India"},
};
Paragraph cellPara;
Cell cell;
for(int e=0;e<data.length;e++)
{
for(int f=0;f<data[e].length;f++)
{
cellPara=new Paragraph(data[e][f].toString( ));
cellPara.setFont(dataFont);
cellPara.setFontSize(14);
cell=new Cell( );
cell.add(cellPara);
table.addCell(cell);
}
}
document.add(table);
document.close( );
System.out.println("PDF file created");
}
catch(Exception e)
{
System.out.println(e.getMessage( ));
}
}
}