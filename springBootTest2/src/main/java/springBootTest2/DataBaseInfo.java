package springBootTest2;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataBaseInfo {
	@Autowired
	private ApplicationContext applicationContext;
	@Bean
	public SqlSessionFactory sqlSessionFactory(
			DataSource dataSource) throws Exception {
		SqlSessionFactoryBean sessionFactory =
				new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setMapperLocations(applicationContext.getResources("classpath:mappers/**/*.xml"));
		return sessionFactory.getObject();
	}
	
	/*
	  @Bean 
	  public SqlSessionTemplate sqlSession ( 
			  SqlSessionFactory sqlSessionFactory) 
					  throws Exception{ 
		  return new SqlSessionTemplate(sqlSessionFactory); 
	  }
	 */
	 
}
