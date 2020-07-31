package com.tgt.strikers.Repository;

import com.tgt.strikers.model.Admin;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface AdminRepository extends CassandraRepository<Admin,String> {
}
