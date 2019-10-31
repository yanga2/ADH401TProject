package model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name ="tblTableName") 
public class tweetEntity  {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	
	private String tweetBody;
	public Long getID() {
		return ID;
	}
	public void setID(Long iD) {
		ID = iD;
	}
	public String getTweetBody() {
		return tweetBody;
	}
	public void setTweetBodty(String tweetBody) {
		this.tweetBody = tweetBody;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	private Date timestamp;
	
}
