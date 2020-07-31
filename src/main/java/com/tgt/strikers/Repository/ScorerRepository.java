package com.tgt.strikers.Repository;

import com.tgt.strikers.model.Scorer;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface ScorerRepository extends CassandraRepository<Scorer,String> {
}
