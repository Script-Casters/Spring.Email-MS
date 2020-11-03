package com.scriptcasters.services.email.respository;

import com.scriptcasters.services.email.model.GeneralMailLog;
import org.springframework.data.repository.CrudRepository;


public interface GeneralMailLogRepository extends CrudRepository<GeneralMailLog, Long> {
}
