package ru.solianko.letscodesweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.solianko.letscodesweater.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
