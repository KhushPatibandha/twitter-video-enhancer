package com.khush.twitter_video_upload.Services;

public interface SQSService {
    public String createQueue(String sqsQueueName);
    public String logAllMessages();
}
