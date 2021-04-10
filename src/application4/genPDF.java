package application4;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

import javax.swing.JOptionPane;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class genPDF
{
	private Document document = new Document(PageSize.A4, 20, 20, 20, 20);
	private PdfPTable table;
	private ArrayList<PdfPTable> tabs = new ArrayList<PdfPTable>();
	private PdfPCell cell = new PdfPCell();   /// pdfCell(new Phrase(string))
	
	
	//
	public void createPDF(Deque<LinkedList<String>> lst, String path) throws DocumentException{
		table =  new PdfPTable(lst.element().size());
		boolean flag = true;
		Phrase ph;

		for(LinkedList<String> l : lst) {
			while(!l.isEmpty()) {
				
				if(flag) {     //// for header
					this.cell = new PdfPCell();
					ph = new Phrase(l.element() );
					this.cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					this.cell.addElement(ph);
					this.cell.setBackgroundColor(new BaseColor(0, 173, 239));
					this.table.addCell(cell);
					l.pop();
				}
				else {
					this.cell = new PdfPCell();
					ph = new Phrase(l.element() );
					this.cell.addElement(ph);
					this.table.addCell(this.cell);
					l.pop();
				}
			}
			flag = false;
		}
		try {									
			PdfWriter.getInstance(document, new FileOutputStream(path));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			System.out.println("file not found.");
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.getMessage()	;
			System.out.println("File not opened.");
		}
		document.open();
		try {
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
			Font f = new Font(FontFamily.TIMES_ROMAN,27);
			Paragraph p = new Paragraph("Criminal Data",f);
			p.setAlignment(p.ALIGN_CENTER);
			document.addTitle("CDMS");
			document.add(new Phrase("Time: " + dtf.format(now).toString()));
			document.addAuthor("Daddy");
			document.setPageCount(1);
			document.add(p);
			document.add(new Paragraph("\n"));
			document.add(table);
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.getMessage();
			System.out.println("Table did not add.");
		}
		document.close();
	}
	
	
	
	
	

}
