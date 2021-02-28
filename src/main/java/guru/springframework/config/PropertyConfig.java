package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")  //is looking into the property file to solve the below strings
public class PropertyConfig {

    @Autowired
    Environment env;  // in EditConfiguration can be added your own environment param. ( ex: USERNAME with a specific value) The Autowire will override the local prop variable with the default ones

    @Value("${guru.user}") // when we use the @Value it will match the values that we created in the properties file (datasource.properties)
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
//        fakeDataSource.setUser(env.getProperty("USERNAME"));  //*** Dvalue taken from the environment properties
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;   //returnes a simple bean
    }
}
