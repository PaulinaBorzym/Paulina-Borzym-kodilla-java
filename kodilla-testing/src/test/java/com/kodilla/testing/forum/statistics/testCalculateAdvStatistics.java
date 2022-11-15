package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class testCalculateAdvStatistics {

    @Mock
    private Statistics statisticsMock;

    @Test
    void testQuantityOfPost0() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double quantityOfPosts = statisticsClass.getNumberOfPosts();
        //Then
        Assertions.assertEquals(0, quantityOfPosts);
    }

    @Test
    void testQuantityOfPost1000() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        when(statisticsMock.postsCount()).thenReturn(1000);
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double quantityOfPosts = statisticsClass.getNumberOfPosts();
        //Then
        Assertions.assertEquals(1000, quantityOfPosts);
    }

    @Test
    void testQuantityComments0(){
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        when(statisticsMock.commentsCount()).thenReturn(0);
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double quantityOfComments = statisticsClass.getNumberOfComments();
        //Then
        Assertions.assertEquals(0, quantityOfComments);
    }

    @Test
    void testQuantityOfCommentsLessThenQuantityOfPosts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(200);
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double averageCommentsForPost = statisticsClass.getAverageNumberOfCommentsForPost();
        //Then
        Assertions.assertEquals(0.5, averageCommentsForPost);

    }
    @Test
    void testQuantityOfCommentsMoreThenQuantityOfPosts() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
        when(statisticsMock.commentsCount()).thenReturn(200);
        when(statisticsMock.postsCount()).thenReturn(100);
        statisticsClass.calculateAdvStatistics(statisticsMock);
        double averageCommentsForPost = statisticsClass.getAverageNumberOfCommentsForPost();
        //Then
        Assertions.assertEquals(2, averageCommentsForPost);
    }

    @Test
    void testQuantityOfUser0() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        //When
       when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
       statisticsClass.calculateAdvStatistics(statisticsMock);
       double userNumber = statisticsClass.getNumberOfUser();
       double averageNumberOfCommentsForUser = statisticsClass.getAverageNumberOfCommentsForUser();
       double averageNumberOfPostsForUser = statisticsClass.getAverageNumberOfPostsForUser();
        //Then
        Assertions.assertEquals(0,userNumber);
        Assertions.assertEquals(0, averageNumberOfCommentsForUser);
        Assertions.assertEquals(0,averageNumberOfPostsForUser);
    }
    @Test
    void testQuantityOfUsers100() {
        //Given
        StatisticsClass statisticsClass = new StatisticsClass();
        List<String> userNames = new ArrayList<>();
        //When
        for(int n=0;n<100;n++) {
            userNames.add("A"+n);
        }
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(3000);
        when(statisticsMock.commentsCount()).thenReturn(10000);

        statisticsClass.calculateAdvStatistics(statisticsMock);
        double averageNumberOfCommentsForUser = statisticsClass.getAverageNumberOfCommentsForUser();
        double averageNumberOfPostsForUser = statisticsClass.getAverageNumberOfPostsForUser();
        double averageNumberOfCommentsForPost = statisticsClass.getAverageNumberOfCommentsForPost();
        //Then
        Assertions.assertEquals(100, averageNumberOfCommentsForUser);
        Assertions.assertEquals(30,averageNumberOfPostsForUser);
        Assertions.assertEquals(3.3,averageNumberOfCommentsForPost);
    }
}
