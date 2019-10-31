package service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class tweetEjb
 */
@Stateless
@LocalBean
public class tweetEjb {

    /**
     * Default constructor. 
     */
    public tweetEjb() {
        // TODO Auto-generated constructor stub
    }
    
public void addTweet(tweetEntity Tentity) {
	System.out.println("Adding a ew tweet into the database");
}
}
