package app;

import app.config.AppConfig;
import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Timer;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {

        ApplicationContext applicationContext = //обращаемся к главному интерфейсу спринг приложения за данными конфигурации
                new AnnotationConfigApplicationContext(AppConfig.class); //конфигурация через аннотации с указанием класса (или массива классов) помеченного аннотацией @Configuration
        for (int i = 0; i < 5; i++) {       //запускаем 5 циклов
            AnimalsCage bean =              // Бин некого животного
                    applicationContext.getBean(AnimalsCage.class);    // получаем объект объект (БИН) класса Animal
            bean.whatAnimalSay();                                      //вызываем метод whatAnimalSay на объекте/бине класса Animal
        }
    }
}
