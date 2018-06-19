package control;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import java.io.IOException;

public class MainController {
	 @FXML private StackPane taskStackPane= new StackPane();
	 @FXML private StackPane newsStackPane = new StackPane();	   
	 @FXML private ListView<task> taskListView = new ListView<>();
	 @FXML private callController callController = new callController();
     @FXML private feedController feedController = new feedController();
	 @FXML private taskController taskController = new taskController();
     @FXML private CheckBox busyCheckBox = new CheckBox();
     
   @FXML private void initialize() throws InterruptedException, IOException {
		System.out.println("Application started");
		taskController.init(this);
		feedController.init(this);
		callController.init(this);
		loadNews();
		loadTasks();
	}
	public void loadTasks() throws IOException{
		this.taskStackPane = taskController.getListView(this.taskStackPane);
	}
	
	@FXML private void newTaskButton(Event e) throws IOException {
		this.taskController.addButton();
	}
	@FXML private void busyButton(Event e) {
		if(busyCheckBox.isPressed()) {
			
		}
		else {
			
		}
	}
    private void loadNews() {
		newsStackPane.getChildren().add(feedController.generateObservableNews());
	}
}