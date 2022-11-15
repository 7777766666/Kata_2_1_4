package app.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration      //аннотация укахывает, что клас содержит методы определения Бин
@ComponentScan(basePackages = "app")        //аннотация указывает, с какой папки и ниже сканировать компоненты, имеющие аннотация компонент
public class AppConfig {
}
