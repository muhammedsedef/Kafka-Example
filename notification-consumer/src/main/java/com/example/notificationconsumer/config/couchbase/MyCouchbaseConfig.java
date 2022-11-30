package com.example.notificationconsumer.config.couchbase;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class MyCouchbaseConfig extends AbstractCouchbaseConfiguration {


    @Value("${couchbase.notification-service.config.bootstrapHosts}")
    private String connectionString;

    @Value("${couchbase.notification-service.config.notificationBucketUsername}")
    private String username;

    @Value("${couchbase.notification-service.config.notificationPassword}")
    private String password;

    @Value("${couchbase.notification-service.config.notificationBucket}")
    private String bucketName;

    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return bucketName;
    }
}
