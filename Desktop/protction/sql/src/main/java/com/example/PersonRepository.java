package com.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    List<Person> findByName(String name);

    List<Person> findByAddress(String address);

    List<Person> findById(long id);+

    @Query("select p from Person p where p.name=:name and p.address=:address")
    List<Person> withNameAndAddressQuery(@Param("name")String name, @Param("address")String address);
}
