<%@page import="java.util.List"%> 
<%@page import="org.tweet.entity.Tweet" %>
<%@page import="java.sql.Date" %>

;

<html>
    <head>
        <title>ADH401T Tweet App</title>
    </head>
    <body>
    <%
   	 Tweet tweet = new Tweet("Prop", "Example Tweet Message", new Date(System.currentTimeMillis()));
        if (request.getAttribute("tweet") != null) {
            tweet = (Tweet) request.getAttribute("tweet");
        }
    %>

    <h1>Student Record</h1>
    <div>Property: <%= tweet.getProperty()%></div>
    <div>Tweet Body: <%= tweet.getTweetBody()%></div>
    <div>Time Stamp: <%= tweet.getTimeStamp()%></div>

    <h1>Post New Tweet.</h1>

    <form action = "/MavenWebApp/post" method = "POST" >
             Property <input type = "text" name = "property"/> 
             Tweet <input type = "text" name = "tweetBody"  /> 
             <input type="submit" value="Post">
     </form>

    </body>
</html>