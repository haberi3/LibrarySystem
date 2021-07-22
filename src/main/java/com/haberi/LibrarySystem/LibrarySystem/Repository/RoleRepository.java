package com.haberi.LibrarySystem.LibrarySystem.Repository;

import com.haberi.LibrarySystem.LibrarySystem.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    Role findByRoleName(String name);
}
