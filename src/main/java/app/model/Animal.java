package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("animal")        //когда совпадает с названием класса можно не писать скобки
//аннотация компонент даёт понять спрингу, что надо сканировать данный класс и создвать его Бины (объекты)
public abstract class Animal {

    public Animal() {   //пустой конструктор по умолчанию, можно не писать
        //     System.out.println("Animal creat test Bean");   // проверяем сработал или нет + сколько раз
    }
}
