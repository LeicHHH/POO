package view;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class addEditWindow {
	 
	public void initialize() throws IOException {	
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"addTask.fxml"));
	   AnchorPane taskLayout;
	   taskLayout = loader.load();
	   Stage stage = new Stage();
	   Scene scene = new Scene(taskLayout);
	   stage.setScene(scene);
	   stage.show();
	}

}
