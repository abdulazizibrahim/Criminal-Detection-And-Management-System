package application4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
//import org.opencv.core.Core;
//import org.opencv.core.Mat;
//import org.opencv.imgcodecs.Imgcodecs;
//import org.opencv.videoio.VideoCapture;

public class StartController {
	@FXML
	private Button btnlogin;
	@FXML
	private Button btncomp;
	@FXML
	private AnchorPane capture;
	@FXML
	private Button 	capBtn;
	private FacialDetection face = new FacialDetection();
	
	public void login(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("Login.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Login");
			stage.setScene(new Scene(root1));
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
	}

	public void captureImage(ActionEvent event){
		try {
			face.Detection();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void Complaint(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader((getClass().getResource("Complaint.fxml")));
			Parent root1 = (Parent) fxmlLoader.load();
			Stage stage = new Stage();
			stage.setTitle("Complaint Registration");
			stage.setScene(new Scene(root1));
			stage.initStyle(StageStyle.TRANSPARENT);
			stage.show();
		}
		catch(Exception e)
		{
			System.out.println("cannot load window");
		}
		
	}

}
