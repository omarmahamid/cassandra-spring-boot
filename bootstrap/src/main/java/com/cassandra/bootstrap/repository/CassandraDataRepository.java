package com.cassandra.bootstrap.repository;


import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CassandraDataRepository<T> extends CassandraRepository<T, String>{
}
