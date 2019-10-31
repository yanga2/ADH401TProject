//Name: Mola TK 212214361

package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import Model.Tweets;

@ManagedBean(name ="controller")
@SessionScoped

public class tweetsController {

 @ManagedProperty(value = "#{Tweets1}")
	private Tweets Tweets1; //Instantiating the model inside the controller

 public void addNewTweet() {  //Method to add new tweet
	 System.out.println("****Your tweets has been sent :) ****");
	 Object em;
	 Object tweetEntity;
	((Object) em).persistet(tweetEntity);
 }

public Tweets getTweets1() {
	return Tweets1;
}

public void setTweets1(Tweets tweets1) {
	Tweets1 = tweets1;
}
}
