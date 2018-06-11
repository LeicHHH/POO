package control;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class news {
	private StringProperty title;
	private StringProperty description;
	private StringProperty link;
	private StringProperty author;
	private StringProperty guid;

    public StringProperty getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = new SimpleStringProperty(title);
    }

    public StringProperty getDescription() {
        return description;
    }

    public void setDescription(String description) {
    	this.title = new SimpleStringProperty(description);
    }

    public StringProperty getLink() {
        return link;
    }

    public void setLink(String link) {
    	this.title = new SimpleStringProperty(link);
    }

    public StringProperty getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
     	this.title = new SimpleStringProperty(author);
    }

    public StringProperty getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
     	this.title = new SimpleStringProperty(guid);
    }

    @Override
    public String toString() {
        return "FeedMessage [title=" + title + ", description=" + description
                + ", link=" + link + ", author=" + author + ", guid=" + guid
                + "]";
    }

}
