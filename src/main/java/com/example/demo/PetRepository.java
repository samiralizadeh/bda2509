package com.example.demo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PetRepository {

    private final JdbcTemplate jdbc;

    public PetRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    // READ from PostgreSQL
    public List<Pet> findAll() {
        return jdbc.query(
                "SELECT * FROM pet",
                (rs, rowNum) -> new Pet(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("type"),
                        rs.getInt("age")
                )
        );
    }
}
