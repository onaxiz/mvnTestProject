package com.gd.internship.me;
import com.gd.internship.me.User;
import com.github.javafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;

public class DZ02Streams {
    static long id  = 0;

    public static void main(String[] args) {
        Map<Long, User> idToUser = new HashMap<>();

        setMapData(idToUser);

        // if you need see all map
//        for (Map.Entry<Long, User> pair : users.entrySet()){
//            System.out.println(pair.getKey() + " : " + pair.getValue().getName());
//        }

        List<User> collectId = idToUser.entrySet().stream()
                .filter(pair -> pair.getKey() <= 121).map(x -> x.getValue())
                .collect(Collectors.toList());

        List<String> collectAge = idToUser.entrySet().stream()
                .filter(pair -> pair.getValue().getAge() > 18)
                .map(x -> x.getValue().getSurname())
                .collect(Collectors.toList());

        List<String> collectSurnamesA = idToUser.entrySet().stream()
                .filter(pair -> pair.getValue().getSurname().toCharArray()[0] == 'A')
                .map(x -> x.getValue().getSurname())
                .collect(Collectors.toList());

        long collectNamesC = idToUser.entrySet().stream()
                .filter(pair -> pair.getValue().getName().toCharArray()[0] == 'C')
                .count();

        List<String> collectFullName = idToUser.entrySet().stream()
                .map(x -> x.getValue().getSurname() + " "
                        + x.getValue().getName() + " "
                        + x.getValue().getPatronim() + " ")
                .collect(Collectors.toList());


        Optional<String> collectBirthDate= idToUser.entrySet().stream()
                .filter(pair -> pair.getValue().getBirthDate() == null)
                .map(x -> x.getValue().getName())
                .findFirst();
    }

    public static void setMapData(Map<Long,User> map){
        for (int i = 0; i <=256; i++) {
            Faker faker = new Faker();
            User user = new User();
            user.setId(id);
            user.setName(faker.name().name());
            user.setPatronim(faker.name().nameWithMiddle());
            user.setSurname(faker.name().lastName());
            user.setAge(faker.number().numberBetween(13, 120));
            user.setBirthDate(faker.date().birthday(user.getAge(), user.getAge()).toString());
            map.put(id, user);
            id++;
        }


    }
}
