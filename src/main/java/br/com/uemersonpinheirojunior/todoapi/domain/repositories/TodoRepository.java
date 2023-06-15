package br.com.uemersonpinheirojunior.todoapi.domain.repositories;

import br.com.uemersonpinheirojunior.todoapi.domain.entities.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodoRepository extends MongoRepository<Todo, UUID> {
}
