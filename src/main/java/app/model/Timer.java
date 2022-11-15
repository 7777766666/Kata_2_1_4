package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("timer")    //говорим спрингу, что надо сканировать данный класс и создавать Бины (объекты ) данного класса
public class Timer {

    private Long nanoTime = System.nanoTime();  //метод возвращает текущее значение самого точного значения таймера в наносекундах

    public Timer() {                        //конструктор без параметров
        System.out.println("Constructor timer");        //на этапе написания программы смотрим, сколько раз вызывался метод
        this.nanoTime = nanoTime;               //сохраняем текущее самое точное время в системе
    }

    public Long getTime() {             //метод ничего не приннимает, возвращает значение самого точного системного времени
        System.out.println("get Time ");        //смотрим, сколько раз метод вызывался
        return nanoTime;            //возвращаем самое точное системное время в наносекундах
    }
}
