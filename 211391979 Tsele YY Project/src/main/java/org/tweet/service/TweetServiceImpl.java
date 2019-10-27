package org.tweet.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.tweet.entity.Tweet;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Stateless
public class TweetServiceImpl implements TweetService{


    @PersistenceContext(name = "Tweet_APP_JPA")
    EntityManager entityManager;


    @Override
    public Tweet postTweet(Tweet tweet) {
    	System.out.println("***********************************************Inside Service Post Tweet");
        entityManager.persist(tweet);
		createTweet(tweet.getTweetBody());
        return tweet;
    }

    @Override
    public List<Tweet> retrieveTweets() {
    	System.out.println("***********************************************Inside Service Retrieve Tweets");
        return entityManager.createQuery("SELECT t FROM Tweet t", Tweet.class).getResultList();
    }
    
    public Status createTweet(String tweet) {
        Twitter twitter = getTwitterinstance();
        Status status;
		try {
			status = twitter.updateStatus(tweet);
		} catch (TwitterException e) {
			throw new RuntimeException(e);
		}
        return status;
    }
    
    private Twitter getTwitterinstance(){    
	    ConfigurationBuilder cb = new ConfigurationBuilder();
	    cb.setDebugEnabled(true)
	      .setOAuthConsumerKey("MNgsIO5xfJeXkvlxpjeOFJ3Z0")
	      .setOAuthConsumerSecret("V3W2Mcs3cDKsuyOnXllAJ5PL2xwsbN2D36xojWAy8zOyK7T3Cv")
	      .setOAuthAccessToken("900835856562442241-ABEX5kFunQ7PBw2EyM7ytWYUqR7YLB8")
	      .setOAuthAccessTokenSecret("j3c3HJd8YaLSGI1gWnnAFMF3dtLeebLKNqk3SWNrNmDvf");
	    TwitterFactory tf = new TwitterFactory(cb.build());
	    return tf.getInstance();
    }
}
