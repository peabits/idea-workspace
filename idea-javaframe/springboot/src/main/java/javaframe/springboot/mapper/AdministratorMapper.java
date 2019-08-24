package javaframe.springboot.mapper;

import javaframe.springboot.pojo.Administrator;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Mybatis 注解方式
 */
@Mapper
public interface AdministratorMapper {

    @Select("select * from tb_administrator")
    List<Administrator> findAll();

}
