package br.com.yolotech.cursospringudemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.yolotech.cursospringudemy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
