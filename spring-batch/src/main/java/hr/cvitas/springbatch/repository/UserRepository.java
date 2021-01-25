package hr.cvitas.springbatch.repository;

import hr.cvitas.springbatch.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
