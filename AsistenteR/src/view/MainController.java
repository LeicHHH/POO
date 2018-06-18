package view;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import control.task;

public class MainController {
	 @FXML private StackPane taskStackPane = new StackPane();
	 @FXML private StackPane newsStackPane = new StackPane();	   
	 @FXML private ListView<task> taskListView = new ListView<>();
	 @FXML private callController callController = new callController();
     @FXML private feedController feedController = new feedController();
	 @FXML private taskController taskController = new taskController();

     
   @FXML private void initialize() throws InterruptedException {
		System.out.println("Application started");
		taskController.init(this);
		feedController.init(this);
		callController.init(this);
		loadNews();
		loadTasks();
	}
   public void refresh() throws InterruptedException {
	   for(int i = 0; i< 10000; i++)
	   TimeUnit.SECONDS.sleep(5);
   }

	public void loadTasks(){
		this.taskStackPane.getChildren().add(taskController.getListView());
	}
	
	@FXML private void newTaskButton(Event e) throws IOException {
		this.taskController.addButton();
	}


    private void loadNews() {
		newsStackPane.getChildren().add(feedController.generateObservableNews());
	}
}