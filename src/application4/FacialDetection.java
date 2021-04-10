package application4;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class FacialDetection {
	
	public void Detection() throws IOException
	{
		JOptionPane.showMessageDialog(null, "detect face");
        int b =0;
        int a;
        while (true) {
            if (b == 0) {
                File file = new File(("C:\\Users\\Mackrugeri\\Desktop\\file2.bat"));
                Desktop.getDesktop().open(file);
                b = b + 1;
            }
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            if (a == 1) {
                File file1 = new File(("C:\\Users\\Mackrugeri\\Desktop\\file.bat"));
                Desktop.getDesktop().open(file1);
                break;
            }
            if (a == 0) {
                break;
            }
        }
	}

}
