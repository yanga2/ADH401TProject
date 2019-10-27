package org.tweet.service;

import java.util.List;

import javax.ejb.Local;

import org.tweet.entity.Tweet;

import twitter4j.Status;

@Local
public interface TweetService {

    Tweet postTweet(Tweet tweet);

    List<Tweet> retrieveTweets();
    
    Status createTweet(String tweet);

}