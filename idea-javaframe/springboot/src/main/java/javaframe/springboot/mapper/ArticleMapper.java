package javaframe.springboot.mapper;

import javaframe.springboot.pojo.Article;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Mybatis xml 方式
 */
@Mapper
public interface ArticleMapper {

    List<Article> findAll();

}
