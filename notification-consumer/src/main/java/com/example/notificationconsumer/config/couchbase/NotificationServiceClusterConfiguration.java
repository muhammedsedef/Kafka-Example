package com.example.notificationconsumer.config.couchbase;

import com.couchbase.client.core.env.TimeoutConfig;
import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.ClusterOptions;
import com.couchbase.client.java.env.ClusterEnvironment;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

//@Configuration
//@ConfigurationProperties(prefix = "couchbase.notification-service.config")
@Getter
@Setter
public class NotificationServiceClusterConfiguration {

    private String bootstrapHosts;
    private String notificationBucketUsername;
    private String notificationPassword;
    private Long queryTimeout;
    private Long kvTimeout;
    private Integer connectionTimeout;

    //@Bean(name = "notificationServiceCouchbase")
    public Cluster loginCluster() {
        return Cluster.connect(this.bootstrapHosts, buildClusterOptions());
    }

    private ClusterOptions buildClusterOptions() {
        return ClusterOptions
            .clusterOptions(this.notificationBucketUsername, this.notificationPassword)
            .environment(buildClusterEnvironment());
    }

    private ClusterEnvironment buildClusterEnvironment() {

        TimeoutConfig.Builder timeoutConfigBuilder = TimeoutConfig
            .queryTimeout(Duration.ofSeconds(this.queryTimeout))
            .kvTimeout(Duration.ofSeconds(this.kvTimeout))
            .connectTimeout(Duration.ofSeconds(this.connectionTimeout));

        return ClusterEnvironment.builder()
            .timeoutConfig(timeoutConfigBuilder)
            .build();
    }
}
