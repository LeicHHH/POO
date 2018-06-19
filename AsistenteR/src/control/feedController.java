package control;

import java.util.ArrayList;
import javafx.collections.FXCollections;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import util.rssreader.RSSFeedReader;
import util.rssreader.RSSItem;
import util.rssreader.stores.ArrayListRSSFeedStore;


public class feedController {
	      
          private ArrayListRSSFeedStore feedStore;
          private ArrayList<RSSItem> listRSS;
          private ListView<RSSItem> newsListView;
          
          public feedController() {
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
    	                              setText("Title:\n" + r.getTitle() +  "\nDate: " + r.getPubDate() + "\nLink:\n"+ r.getLink()  );
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
