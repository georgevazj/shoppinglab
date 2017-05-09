package com.georgevazj.repository;

import com.georgevazj.entity.common.Log;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

/**
 * Created by jorge on 09/05/2017.
 */
@Service("logRepository")
public interface LogRepository extends MongoRepository<Log, String> {
}
