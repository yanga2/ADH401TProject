package org.tweet.rest;

import java.sql.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.tweet.entity.Tweet;

@Path("/tweet")
public class TweetRestAPI{

	@GET
    @Path("/ping")
    public Response ping() {
        return Response.ok().entity("Service online").build();
    }
 
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getNotification() {
        return Response.ok()
          .entity(new Tweet("Micheal", "Micheal Jackso ke lenyora", new Date(System.currentTimeMillis())))
          .build();
    }
 
    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postNotification(Tweet notification) {
        return Response.status(201).entity(notification).build();
    }
	
}
