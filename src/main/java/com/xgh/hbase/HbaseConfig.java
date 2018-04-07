package com.xgh.hbase;

import org.apache.hadoop.hbase.HBaseConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.hadoop.hbase.HbaseTemplate;

@Configuration
@EnableConfigurationProperties(HBaseProperties.class)
public class HbaseConfig {

    @Autowired
    HBaseProperties hBaseProperties;


    @Bean
    public HbaseTemplate getHbaseTemplate() {
        org.apache.hadoop.conf.Configuration configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.quorum", hBaseProperties.getZkQuorum());
        configuration.set("hbase.rootdir", hBaseProperties.getRootDir());
        configuration.setInt("hbase.zookeeper.property.clientPort",hBaseProperties.getClientPort());
        configuration.set("zookeeper.znode.parent", hBaseProperties.getZkBasePath());
        return new HbaseTemplate(configuration);
    }
}
