package com.project.cassandra.person.repository;

import com.project.cassandra.person.Person;
import com.project.cassandra.person.PersonKey;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends CassandraRepository<Person, PersonKey> {

  List<Person> findByKeyFirstName(final String firstName);

  Person findOneByKeyFirstName(final String firstName);
}
