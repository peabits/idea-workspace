package javaframe.springboot.config;

import com.github.pagehelper.PageHelper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * 注解 @Configuration 表示 PageHelperConfig 这个类是用来做配置的。
 * 注解 @Bean 表示启动 PageHelper 这个拦截器。
 */
@Configuration
public class PageHelperConfig {

    @Bean
    public PageHelper pageHelper() {
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        // offsetAsPageNum 设置为 true 时，会将 RowBounds 第一个参数 offset 当成 pageNum 页码使用.
        properties.setProperty("offsetAsPageNum", "true");
        // rowBoundsWithCount 设置为 true 时，使用 RowBounds 分页会进行 count 查询.
        properties.setProperty("rowBoundsWithCount", "true");
        // reasonable 启用合理化时，如果 pageNum<1 会查询第一页，如果 pageNum>pages 会查询最后一页。
        properties.setProperty("reasonable", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }

}
