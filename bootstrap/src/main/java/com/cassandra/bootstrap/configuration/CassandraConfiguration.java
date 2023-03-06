package com.cassandra.bootstrap.configuration;

import com.datastax.oss.driver.api.core.CqlSession;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Paths;

@Configuration
public class CassandraConfiguration{

    @Value("${astra.credentials.keyspace}")
    private String keySpace;

    @Value("${astra.credentials.username}")
    private String username;

    @Value("${astra.credentials.password}")
    private String password;

    @Value("${astra.path.bundle.file}")
    private String pathAstraDBBundleFile;


    protected String getKeyspaceName() {
        return this.keySpace;
    }


    @Bean
    public CqlSession session(){
        return CqlSession.builder()
                .withCloudSecureConnectBundle(Paths.get(pathAstraDBBundleFile))
                .withAuthCredentials(username, password)
                .withKeyspace(getKeyspaceName())
                .build();
    }

}
