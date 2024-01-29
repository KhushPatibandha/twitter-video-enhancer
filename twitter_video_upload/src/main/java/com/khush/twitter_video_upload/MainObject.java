package com.khush.twitter_video_upload;

import org.springframework.stereotype.Component;

import io.github.cdimascio.dotenv.Dotenv;

@Component
public class MainObject {
    private final Dotenv dotenv = Dotenv.load();
    private final String awsAccountID = dotenv.get("AWS_ACCOUNT_ID");
    private final String awsRegion = dotenv.get("AWS_REGION");
    
    private String tempBucketName = dotenv.get("TEMP_BUCKET_NAME");
    private String permBucketName = dotenv.get("PERM_BUCKET_NAME");

    private String snsTopicName = "twitterVideoTranscoderTopic";
    private String snsTopicForPermS3Name = "twitterVideoTranscoderPermS3Topic";

    private String sqsQueueName = "twitterVideoTranscoderQueue";
    private String sqsQueueForPermS3Name = "twitterVideoTranscoderPermS3Queue";

    private String lambdaFunctionName = "twitterVideoTranscoderLambdaFunction";
    private String lambdaS3FunctionName = "twitterVideoTranscoderPermS3LambdaFunction";

    private String roleNameForTaskExecution = "twitterVideoRoleForTaskExecution";
    
    private String roleName = "twitterVideoRoleForLambdaTrigger";
    private String roleNameForPermS3LambdaTrigger = "twitterVideoRoleForPermS3LambdaTrigger";

    private String containerName = "twittervideocontainer";
    private String taskDefinationName = "twitterVideoTaskDefination";
    private String clusterName = "twitterVideoCluster";
    private String securityGroupName = "twitterVideoSecurityGroup";

    private String tempBucketArn = "arn:aws:s3:::" + tempBucketName;
    private String permBucketArn = "arn:aws:s3:::" + permBucketName;

    private String snsTopicArn = "arn:aws:sns:" + awsRegion + ":" + awsAccountID + ":" + snsTopicName;
    private String snsTopicForPermS3Arn = "arn:aws:sns:" + awsRegion + ":" + awsAccountID + ":" + snsTopicForPermS3Name;

    private String sqsQueueArn = "arn:aws:sqs:" + awsRegion + ":" + awsAccountID + ":" + sqsQueueName;
    private String sqsQueueURL = "https://sqs." + awsRegion +".amazonaws.com/" + awsAccountID + "/" + sqsQueueName;
    private String sqsQueueUrlForPermS3 = "https://sqs." + awsRegion +".amazonaws.com/" + awsAccountID + "/" + sqsQueueForPermS3Name;
    private String sqsQueueArnForPermS3 = "arn:aws:sqs:" + awsRegion + ":" + awsAccountID + ":" + sqsQueueForPermS3Name;

    private String lambdaFunctionArn = "arn:aws:lambda:" + awsRegion + ":" + awsAccountID + ":function:" + lambdaFunctionName;
    private String lambdaS3FunctionArn = "arn:aws:lambda:" + awsRegion + ":" + awsAccountID + ":function:" + lambdaS3FunctionName;

    private String roleArnTaskExecution = "arn:aws:iam::" + awsAccountID + ":role/" + roleNameForTaskExecution;

    private String roleArn = "arn:aws:iam::" + awsAccountID + ":role/" + roleName;
    private String roleNameForPermS3LambdaTriggerArn = "arn:aws:iam::" + awsAccountID + ":role/" + roleNameForPermS3LambdaTrigger;

    private String taskDefinationArn = "arn:aws:ecs:" + awsRegion + ":" + awsAccountID + ":task-definition/" + taskDefinationName;
    private String clusterArn = "arn:aws:ecs:" + awsRegion + ":" + awsAccountID + ":cluster/" + clusterName;
    private String jarFilePath = "target/twitter_video_upload-0.0.1-SNAPSHOT.jar";
    private String lambdaHandler = "com.khush.twitter_video_upload.SQSLambdaTrigger::handleRequest";
    private String lambdaS3Handler = "com.khush.twitter_video_upload.S3LambdaTrigger::handleRequest";
    private String dockerImageLink = "docker.io/khushpatibandha/twitterimagexx:1.0";

    public String getTempBucketName() {
        return tempBucketName;
    }

    public String getPermBucketName() {
        return permBucketName;
    }

    public String getSnsTopicName() {
        return snsTopicName;
    }

    public String getSnsTopicForPermS3Name() {
        return snsTopicForPermS3Name;
    }

    public String getSqsQueueName() {
        return sqsQueueName;
    }

    public String getSqsQueueForPermS3Name() {
        return sqsQueueForPermS3Name;
    }

    public String getLambdaFunctionName() {
        return lambdaFunctionName;
    }

    public String getLambdaS3FunctionName() {
        return lambdaS3FunctionName;
    }

    public String getRoleNameForTaskExecution() {
        return roleNameForTaskExecution;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getRoleNameForPermS3LambdaTrigger() {
        return roleNameForPermS3LambdaTrigger;
    }

    public String getContainerName() {
        return containerName;
    }

    public String getTaskDefinationName() {
        return taskDefinationName;
    }

    public String getClusterName() {
        return clusterName;
    }

    public String getSecurityGroupName() {
        return securityGroupName;
    }

    public String getTempBucketArn() {
        return tempBucketArn;
    }

    public String getPermBucketArn() {
        return permBucketArn;
    }

    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    public String getSnsTopicForPermS3Arn() {
        return snsTopicForPermS3Arn;
    }

    public String getSqsQueueArn() {
        return sqsQueueArn;
    }

    public String getSqsQueueURL() {
        return sqsQueueURL;
    }

    public String getSqsQueueUrlForPermS3() {
        return sqsQueueUrlForPermS3;
    }

    public String getSqsQueueArnForPermS3() {
        return sqsQueueArnForPermS3;
    }

    public String getLambdaFunctionArn() {
        return lambdaFunctionArn;
    }

    public String getLambdaS3FunctionArn() {
        return lambdaS3FunctionArn;
    }

    public String getRoleArnTaskExecution() {
        return roleArnTaskExecution;
    }

    public String getRoleArn() {
        return roleArn;
    }

    public String getRoleNameForPermS3LambdaTriggerArn() {
        return roleNameForPermS3LambdaTriggerArn;
    }

    public String getTaskDefinationArn() {
        return taskDefinationArn;
    }

    public String getClusterArn() {
        return clusterArn;
    }

    public String getJarFilePath() {
        return jarFilePath;
    }

    public String getLambdaHandler() {
        return lambdaHandler;
    }

    public String getLambdaS3Handler() {
        return lambdaS3Handler;
    }

    public String getDockerImageLink() {
        return dockerImageLink;
    }

}
