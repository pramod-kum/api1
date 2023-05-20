package com.geekster.Gulshan1.repository;

import com.geekster.Gulshan1.model.Userr;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Userr , Integer> {
}
