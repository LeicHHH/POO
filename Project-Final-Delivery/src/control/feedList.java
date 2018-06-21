package control;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import util.rssreader.RSSFeedReader;
import util.rssreader.RSSItem;
import util.rssreader.stores.ArrayListRSSFeedStore;


public class feedList {
	      
          private ArrayListRSSFeedStore feedStore;
          private ArrayList<RSSItem> listRSS;
          private ListView<RSSItem> newsListView;
          
          public feedList() {
        	  this.feedStore  = new ArrayListRSSFeedStore();
        	  RSSFeedReader.read("http://rss.cnn.com/rss/edition.rss",feedStore);
        	  this.listRSS = feedStore.getList();
          }
         
       
          public ListView<RSSItem> generateObservableNews() {
        	    this.newsListView = new ListView<>();
        	    
    	  	    newsListView.setItems(FXCollections.observableList(listRSS));
    	          newsListView.setCellFactory(new Callback<ListView<RSSItem>, ListCell<RSSItem>>(){
    	    
    	              public ListCell<RSSItem> call(ListView<RSSItem> p) {
    	                   
    	                  ListCell<RSSItem> cell = new ListCell<RSSItem>(){
    	                	  
    	                      protected void updateItem(RSSItem r, boolean bln) {
    	                          super.updateItem(r, bln);
    	                          if (r != null) {
    	                              setText("Title:\n" + r.getTitle() +  "\nDate: " + r.getPubDate() + "\n Click to open LINK"  );
    	                             
    	                            	    newsListView.setOnMouseClicked(event -> {
    	                            	    	try {
													Desktop.getDesktop().browse(new URI(r.getLink()));
												} catch (IOException | URISyntaxException e) {
													// TODO Auto-generated catch block
													e.printStackTrace();
												}
												
											});
    	                            	}
    	                          }
    	                      
    	   
    	                  };
    	                   
    	                  return cell;
    	              }
    	          });
    	          return  newsListView;
          }


		public void init(MainController mainController) {
			// TODO Auto-generated method stub
			
		}
}
