package br.com.uemersonpinheirojunior.todoapi.domain.repositories;

import br.com.uemersonpinheirojunior.todoapi.domain.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends MongoRepository<User, UUID> {
}
