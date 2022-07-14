package org.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        //Создаем спринг контейнер
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");

        Pet pet = context.getBean("myPet", Pet.class);
        pet.say();

        //Обязательно закрываем
        context.close();
    }
}