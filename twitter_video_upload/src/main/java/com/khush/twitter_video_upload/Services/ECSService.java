package com.khush.twitter_video_upload.Services;

import java.util.List;

public interface ECSService {
    public void createTaskDefination();
    public void createCluster();
    public List<String> getDefaultSubnets();
    public String createSecurityGroup(String securityGroupName);
    public String getSecurityGroupId(String securityGroupName);
    public void createRoleAndAttachPolicy();    
}
