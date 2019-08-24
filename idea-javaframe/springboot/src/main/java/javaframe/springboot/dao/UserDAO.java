package javaframe.springboot.dao;

import javaframe.springboot.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA 方式
 */
public interface UserDAO extends JpaRepository<User, Integer> {
}
