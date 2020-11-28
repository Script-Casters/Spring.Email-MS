package com.scriptcasters.services.email.respository;

import com.scriptcasters.services.email.model.GeneralMail;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralMailLogRepository extends CrudRepository<GeneralMail, Long> {
}
