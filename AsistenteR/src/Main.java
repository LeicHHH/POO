
import java.io.IOException;
import java.util.ArrayList;

import control.Calls;
import control.task;
import control.news;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.util.Callback;
import view.taskController;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;
import javafx.collections.FXCollections;

public class Main extends Application {
          private VBox mainLayout;
          private Stage primaryStage;
          private taskController taskController = new taskController();;
    @FXML private ListView<task> taskListView;
    @FXML private ListView<news> newsList = new ListView<news>();
    @FXML private ListView<Calls> callList =  new ListView<Calls>();
    
    public Main() {
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

	
	private void showTaskList() {
		this.taskListView = new ListView<>();
		ObservableList<task> taskObservable = FXCollections.observableList(taskController.getList().getList());
	    taskListView.setItems(taskObservable);
	    taskListView.setCellFactory(Callback<ListView<task>,ListCell<task>>);
	}

 public void updateButton() {
		System.out.println(this.taskController.getList().getList().get(0).getText());

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
