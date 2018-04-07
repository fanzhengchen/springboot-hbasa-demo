package com.xgh.hbase;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.data.hbase")
@Data
public class HBaseProperties {

    // Addresses of all registered ZK servers.
    private String zkQuorum;

    // Location of HBase home directory
    private String rootDir;

    // Root node of this cluster in ZK.
    private String zkBasePath;

    // 2181
    private int clientPort;
}
