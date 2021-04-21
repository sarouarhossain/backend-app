package com.test.app.repositories;

import com.test.app.models.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserTableRepository extends JpaRepository<UserTable,Long> {
}
