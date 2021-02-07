package com.tts.subscriberlist.subscriber;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface SubscriberRepository extends CrudRepository<Subscriber, Long> {
    //@Query("SELECT p FROM Subscriber p WHERE CONCAT(p.name) LIKE %?1%")
    //public List<Product> search(String keyword);
    List<Subscriber> findByFirstName(String firstName);
}
