package com.example.springdemo;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception {
        Class clazz=Class.forName("com.example.springdemo.Demo");
       boolean bl= clazz.isAnnotationPresent(Anndemo.class);
        System.out.println(bl);
      Anndemo anndemo= (Anndemo) clazz.getAnnotation(Anndemo.class);
        System.out.println(anndemo.tableName());

        Class[] array=clazz.getInterfaces();
        for (Class aClass : array) {
            System.out.println(aClass.getName());
        }
        Demo demo= (Demo) clazz.newInstance();
        Field[] fields = demo.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName());
            System.out.println(field.getName());
        }
        Field fieldname= demo.getClass().getDeclaredField("name");
        fieldname.setAccessible(true);
        fieldname.set(demo,"xxxxx");
        System.out.println(demo.getName());



    }
}
