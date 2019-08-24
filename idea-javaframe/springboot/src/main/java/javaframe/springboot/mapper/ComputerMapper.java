package javaframe.springboot.mapper;

import javaframe.springboot.pojo.Computer;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Mybatis 注解方式
 * CRUD + 分页
 */
@Mapper
public interface ComputerMapper {

    @Select("select * from tb_computer")
    List<Computer> findAll();

    @Insert("insert into tb_computer (brand, price) value (#{brand}, #{price})")
    int save(Computer computer);

    @Delete("delete from tb_computer where id = #{id}")
    void delete(int id);

    @Select("select * from tb_computer where id = #{id}")
    Computer get(int id);

    @Update("update tb_computer set brand = #{brand}, price = #{price} where id = #{id}")
    int update(Computer computer);

}
