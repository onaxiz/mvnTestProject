package com.gd.internship.me;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import com.github.javafaker.Faker;

public class K01 {
    public static void main(String[] args) {

        //theory
        Integer n = 77777;
        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(n);
        list.add(8);
        list.add(4, 4);

        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.indexOf(n) = " + list.indexOf(n));
        System.out.println("=======================================");

        list.remove(5);
        list.remove(4);
        list.remove(n);

        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println("list.get(4) = " + list.get(4));
        System.out.println("list.indexOf(n) = " + list.indexOf(n));


        System.out.println("=======================================");

        List<Integer> list2 = Arrays.asList(3,2,1,0,11,12,13,14);
        List<Integer> list3 = Stream.of(12, 21, 21, 30, 511, 612, 713, 814, 978, 15)
                .collect(Collectors.toList());

        List<Integer> list4 = new ArrayList<Integer>() {{
            add(154);
            add(242);
            add(96);
        }};

        //Java 9 :
        //List<String> l = List.of("Dobroe", "utro", ",", "strana", "!");

        System.out.println(list2);
        System.out.println("list2.size() = " + list2.size());
        System.out.println(list3);
        System.out.println("list3.size() = " + list3.size());
        System.out.println(list4);
        System.out.println("list4.size() = " + list4.size());

        System.out.println("=======================================");

        System.out.println(list);
        list.addAll(list2);
        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        System.out.println(list2);
        System.out.println("list2.size() = " + list2.size());

        System.out.println("=======================================");

        list.addAll(list3);
        list.addAll(list4);

        System.out.println("\n  > 12 =");
        for (Integer elt : list) {
            if (elt > 12) {
                System.out.print("..." + elt);
            }
        }
        System.out.println("\n n, n-1, n-2, ... =");
        for (ListIterator<Integer> it = list.listIterator(list.size()); it.hasPrevious(); ) {
            Integer elt = it.previous();
            System.out.print(" " + elt);
        }

        System.out.println("\n Remove if > 24 =");
        for (ListIterator<Integer> it = list.listIterator(list.size()); it.hasPrevious(); ) {
            Integer elt = it.previous();
            if (elt > 12) {
                it.remove();
            }
        }

        System.out.println(list);
        System.out.println("list.size() = " + list.size());
        // end of theory

        // Make my own list using javaFaker
        ArrayList<String> strings = new ArrayList<>();
        Faker faker = new Faker();

        for ( int i = 0; i < 15; i++){
            strings.add(faker.artist().name());
        }

        // theory
        System.out.println("strings");
        System.out.println(strings);
        System.out.println("strings.size() = " + strings.size());

        System.out.println(".reverse(strings)");
        Collections.reverse(strings);
        System.out.println(strings);

        System.out.println(".sort(strings)");
        Collections.sort(strings); // Optional - comparator
        System.out.println(strings);

        System.out.println(".shuffle(strings)");
        Collections.shuffle(strings);
        System.out.println(strings);

        System.out.println("|||||||||||||||||| Set ||||||||||||||");

        Set<Integer> set1 = new HashSet<Integer>(){{
            add(2);
            add(1);
            add(0);
            add(4);
            add(3);
            add(5);
            add(5);
            add(6);
            add(99);
            add(9);
            add(-1);
            add(-4);
            add(-7);
        }};

        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(5);
        set2.add(4);
        set2.add(3);
        set2.add(2);
        set2.add(1);
        set2.add(5);
        set2.add(0);
        set2.add(6);
        set2.add(99);
        set2.add(9);
        set2.add(-1);
        set2.add(-4);
        set2.add(-7);

        Set<Integer> set3 = new TreeSet<>();
        set3.add(5);
        set3.add(4);
        set3.add(3);
        set3.add(2);
        set3.add(1);
        set3.add(5);
        set3.add(0);
        set3.add(6);
        set3.add(99);
        set3.add(9);
        set3.add(-1);
        set3.add(-4);
        set3.add(-7);

        System.out.println("set1=" + set1);
        System.out.println("set2=" + set2);
        System.out.println("set3=" + set3);

        System.out.println("=======================================");

        List<Integer> ints = new ArrayList<>();

        for (int i = 0; i < 432; i++ )
            ints.add(faker.random().nextInt(50, 60));

        Set<Integer> intsNoDuplicates = new HashSet<>(ints);

        System.out.println("ints, size=" + ints.size());
        System.out.println("intsNoDuplicates, size=" + intsNoDuplicates.size());
        System.out.println("intsNoDuplicates=" + intsNoDuplicates);

        System.out.println("=======================================");
        Map<Long, String> map = new HashMap<>();

        for (int i = 0; i < 72; i++) {
            final Long key =faker.random().nextLong();
            final String value = faker.weather().description();

            map.put(key, value);
        }

        map.put(144L, faker.aviation().METAR());
        map.put(288L, faker.educator().course());

        System.out.println("map, size=" + map.size());
        System.out.println("map=" + map);
        System.out.println("map keys=" + map.keySet());
        System.out.println("map value=" + map.values());

        for (Map.Entry<Long, String> entry : map.entrySet()) {
            System.out.println("key=" + entry.getKey());
            System.out.println("value=" + entry.getValue());
            System.out.println("----------");
        }

        System.out.println("map.get(144L)=" + map.get(144L));
        System.out.println("map.get(0L)=" + map.get(0L));


        System.out.println("=======================================");

        String valueIfKeyGt0 = map.entrySet()
                .stream()
                .filter(entry -> entry.getKey() > 0)
                .findFirst()
                .get()
                .getValue();

        System.out.println("valueIfKeyGt0=" + valueIfKeyGt0);

// need some cast, I can not solve it
//        Set<Integer> setNoDuplicates2 =  ints.stream().distinct();
//
//        System.out.println("ints size=" + ints.size());
//        System.out.println("setNoDuplicates2 size=" + setNoDuplicates2.size());
//        System.out.println("setNoDuplicates2=" + setNoDuplicates2);
    }


}
