package ru.solianko.letscodesweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.solianko.letscodesweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);
}
