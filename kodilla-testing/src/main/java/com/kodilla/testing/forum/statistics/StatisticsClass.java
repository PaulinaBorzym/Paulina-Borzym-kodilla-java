package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StatisticsClass {

    private double numberOfUser;
    private double numberOfPosts;
    private double numberOfComments;
    private double averageNumberOfPostsForUser;
    private double averageNumberOfCommentsForUser;
    private double averageNumberOfCommentsForPost;


    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUser = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();
        if(numberOfUser==0) {
            averageNumberOfPostsForUser = 0;
            averageNumberOfCommentsForUser = 0;
        } else {
            averageNumberOfPostsForUser = Math.round((numberOfPosts / numberOfUser)*10)/10.0;
            averageNumberOfCommentsForUser = Math.round((numberOfComments / numberOfUser)*10)/10.0;
        }
        if (numberOfPosts==0){
            averageNumberOfCommentsForPost = 0;
        } else {
            averageNumberOfCommentsForPost = Math.round((numberOfComments / numberOfPosts)*10)/10.0;
        }
    }
    public void showStatistic() {
        System.out.println("Number of User = " + numberOfUser);
        System.out.println("Number of posts = " + numberOfPosts);
        System.out.println("Number of comments = " + numberOfComments);
        System.out.println("Average number of posts for user = " + averageNumberOfPostsForUser);
        System.out.println("Average number of comments for user = " + averageNumberOfCommentsForUser);
        System.out.println("Average number of comments for post = " + averageNumberOfCommentsForPost);
    }

    public double getNumberOfUser() {
        return numberOfUser;
    }

    public void setNumberOfUser(int numberOfUser) {
        this.numberOfUser = numberOfUser;
    }

    public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public void setNumberOfPosts(int numberOfPosts) {
        this.numberOfPosts = numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public void setNumberOfComments(int numberOfComments) {
        this.numberOfComments = numberOfComments;
    }

    public double getAverageNumberOfPostsForUser() {
        return averageNumberOfPostsForUser;
    }

    public void setAverageNumberOfPostsForUser(double averageNumberOfPostsForUser) {
        this.averageNumberOfPostsForUser = averageNumberOfPostsForUser;
    }

    public double getAverageNumberOfCommentsForUser() {
        return averageNumberOfCommentsForUser;
    }

    public void setAverageNumberOfCommentsForUser(double averageNumberOfCommentsForUser) {
        this.averageNumberOfCommentsForUser = averageNumberOfCommentsForUser;
    }

    public double getAverageNumberOfCommentsForPost() {
        return averageNumberOfCommentsForPost;
    }

    public void setAverageNumberOfCommentsForPost(double averageNumberOfCommentsForPost) {
        this.averageNumberOfCommentsForPost = averageNumberOfCommentsForPost;
    }
}
