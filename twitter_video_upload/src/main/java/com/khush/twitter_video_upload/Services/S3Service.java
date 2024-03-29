package com.khush.twitter_video_upload.Services;

import java.net.URL;

public interface S3Service {
    public void createTempBucket();
    public URL putPreSignedUrlGeneratorForTempBucket();
    public URL getPreSignedUrlGeneratorForAnyBucket(String bucketName, String objectKeyForGet);
    public String deleteObjectForTempBucket(String objectKeyForDelete);
    public void createPermBucket();
}
