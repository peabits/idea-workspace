package javaframe.springboot.dao;

import javaframe.springboot.pojo.Phone;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA 方式
 * CRUD + 分页
 */
public interface PhoneDAO extends JpaRepository<Phone, Integer> {
}
