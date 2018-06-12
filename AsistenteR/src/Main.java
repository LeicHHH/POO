
import java.io.IOException;
import control.Calls;
import control.task;
import view.feedController;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import view.taskController;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	      private taskController taskController;
	      private feedController feedController;
	      
	      private VBox mainLayout;
          private Stage primaryStage;
    @FXML private StackPane taskStackPane;
    @FXML private StackPane newsStackPane = new StackPane();
    @FXML private ListView<task> taskListView;
    @FXML private ListView<Calls> callList;
    
    public void initialize() {
    	this.primaryStage = new Stage();
    	this.taskStackPane  = new StackPane();
    	this.taskController = new taskController();
        this.feedController = new feedController();
        showNews();
    }
    
	public void start(Stage primaryStage) throws IOException {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("App POO");
		FXMLLoader loader = new FXMLLoader();
		loader.setLocation(Main.class.getResource("assistant.fxml"));
		mainLayout = loader.load();
	    Scene scene = new Scene(mainLayout);
	    primaryStage.setScene(scene);
	    primaryStage.show();	
	}

	      private void showNews() {
	    	  newsStackPane.getChildren().add(feedController.generateObservableNews());  		
	      }
	      
	      private void showTaskList() {
		  try {
			taskStackPane.getChildren().add(taskController.addTask());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

      @FXML private void updateButton() throws IOException, InterruptedException {
	 showTaskList();
	}
 public void removeTaskButton() {
    	taskController.removeButton(taskListView.getSelectionModel().getSelectedIndex());
    }
	
 public void newTaskButton() throws IOException {
		this.taskController.showAddTask();
		
	}
	
 public void editButton() throws IOException {
		taskController.editTask(taskListView.getSelectionModel().getSelectedIndex());
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
