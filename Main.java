package com.collections_homework_part2;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	Random random = new Random();

	//---------------------A------------------------------
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long start,finish;

        start = System.nanoTime();
        for(int i=0;i<10e5;i++){
            arrayList.add(random.nextInt((int)10e3));
        }
        finish=System.nanoTime();
        System.out.println("Array List filled with Integer values in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e3;i++){
            arrayList.add(random.nextInt((int)10e5), random.nextInt((int)10e3));
        }
        finish=System.nanoTime();
        System.out.println("Array List added into random position in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e3;i++){
            arrayList.add(0, random.nextInt((int)10e3));
        }
        finish=System.nanoTime();
        System.out.println("Array List added into beginning in "+(finish-start)/10e6+" milliseconds");




        start = System.nanoTime();
        for(int i=0;i<10e5;i++){
            linkedList.add(random.nextInt((int) 10e3));
        }
        finish=System.nanoTime();
        System.out.println("Linked List filled with Integer values in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e3;i++){
            linkedList.add(random.nextInt((int)10e5), random.nextInt((int)10e3));
        }
        finish=System.nanoTime();
        System.out.println("Linked List added into random position with Integer values in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e3;i++){
            linkedList.add(0, random.nextInt((int)10e3));
        }
        finish=System.nanoTime();
        System.out.println("Linked List added into beginning in "+(finish-start)/10e6+" milliseconds");


    /* Выводы: Array List filled with Integer values in 12118276 microseconds
    Linked List filled with Integer values in 12740840 microseconds
При миллионе элементов время заполнения обоих структур приблизительно одинаковое.Для других количеств элементов
ArrayList обычно заполняется быстрее(до 5 раз).
Самые большие отличия во времени(до 10000 раз ) наблюдаются при вставке в начало или конец. Также его предпочтительно
использовать, когда заранее сложно предсказать размер списка, и есть вероятность переполнения памяти. Во всех остальных
случаях лучше использовать ArrayList.

        */


        //----------------------B---------------------------


       HashSet<Integer> hashSet = new HashSet<>();
        start = System.nanoTime();
        for(int i=0;i<10e6;i++){
        hashSet.add(random.nextInt((int)10e5));
        }
        finish = System.nanoTime();
        System.out.println("Hash Set filled in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e4;i++){
            hashSet.contains(new Integer(random.nextInt((int)10e4)));
        }
        finish = System.nanoTime();
        System.out.println("Search in HashSet: "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e6;i++){
            hashSet.remove(new Integer(random.nextInt((int) 10e4)));
        }
        finish = System.nanoTime();
        System.out.println("Remove operation in HashSet: "+(finish-start)/10e6+" milliseconds");
        hashSet.clear();


        LinkedHashSet<Integer> linkedhashSet = new LinkedHashSet<>();
        start = System.nanoTime();
        for(int i=0;i<10e6;i++){
            linkedhashSet.add(random.nextInt((int)10e5));
        }
        finish = System.nanoTime();
        System.out.println("Linked Hash Set filled in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e4;i++){
            linkedhashSet.contains(new Integer(random.nextInt((int)10e4)));
        }
        finish = System.nanoTime();
        System.out.println("Search in LinkedHashSet: "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e6;i++){
            linkedhashSet.remove(new Integer(random.nextInt((int) 10e4)));
        }
        finish = System.nanoTime();
        System.out.println("Remove operation in LinkedHashSet: "+(finish-start)/10e6+" milliseconds");



        TreeSet<Integer> treeSet = new TreeSet<>();
        start = System.nanoTime();
        for(int i=0;i<10e6;i++){
            treeSet.add(random.nextInt((int)10e5));
        }
        finish = System.nanoTime();
        System.out.println("TreeSet filled in "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e4;i++){
            treeSet.contains(new Integer(random.nextInt((int)10e4)));
        }
        finish = System.nanoTime();
        System.out.println("Search in TreeSet: "+(finish-start)/10e6+" milliseconds");

        start = System.nanoTime();
        for(int i=0;i<10e6;i++){
            treeSet.remove(new Integer(random.nextInt((int) 10e4)));
        }
        finish = System.nanoTime();
        System.out.println("Remove operation in TreeSet: "+(finish-start)/10e6+" milliseconds");


        /*Выводы: для конкретной машины скорость работы HashSet и LinkedHashSet для всех операций сопоставима.
        LinkedHashSet сохраняет порядок вставки объектов, и применяется в тех случаях, когда требуется упорядочивание
        в порядке вставки (например при организации очередей или стеков). TreeSet работает значительно медленнее для всех операций, но
        поддерживает хранение данных в упорядоченном виде. В таких случаях альтернативы TreeSet нет. Во всех случаях, когда
        не требуется хранить данные в порядке вставки или в естественном порядке, лучше применять HashSet.
         */

        //--------------------------C--------------------------------
        HashMap<Integer,Long> hashMap = new HashMap<Integer,Long>();
         start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            hashMap.put(new Integer(random.nextInt((int) 10e4)),new Long(random.nextLong()));
        }
         finish = System.nanoTime();
        System.out.println("HashMap filled in "+ (finish-start)/10e6+"milliseconds");

        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            hashMap.containsKey(random.nextInt((int)10e4));
        }
        finish = System.nanoTime();
        System.out.println("Search in HashMap: "+ (finish-start)/10e6+"milliseconds");

        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            hashMap.remove(random.nextInt((int) 10e4));
        }
        finish = System.nanoTime();
        System.out.println("Search in HashMap: "+ (finish-start)/10e6+"milliseconds");



        LinkedHashMap<Integer,Long> linkedHashMap = new LinkedHashMap<>();
        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            linkedHashMap.put(new Integer(random.nextInt((int) 10e4)),new Long(random.nextLong()));
        }
        finish = System.nanoTime();
        System.out.println("LinkedHashMap filled in "+ (finish-start)/10e6+"milliseconds");

        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            linkedHashMap.containsKey(random.nextInt((int)10e4));
        }
        finish = System.nanoTime();
        System.out.println("Search in LinkedHashMap: "+ (finish-start)/10e6+"milliseconds");

        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            linkedHashMap.remove(random.nextInt((int) 10e4));
        }
        finish = System.nanoTime();
        System.out.println("Search in LinkedHashMap: "+ (finish-start)/10e6+"milliseconds");


        TreeMap<Integer,Long> treeMap = new TreeMap<>();
        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            treeMap.put(new Integer(random.nextInt((int) 10e4)),new Long(random.nextLong()));
        }
        finish = System.nanoTime();
        System.out.println("TreeMap filled in "+ (finish-start)/10e6+"milliseconds");

        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            treeMap.containsKey(random.nextInt((int)10e4));
        }
        finish = System.nanoTime();
        System.out.println("Search in TreeMap: "+ (finish-start)/10e6+"milliseconds");

        start=System.nanoTime();
        for(int i=0;i<10e5;i++){
            treeMap.remove(random.nextInt((int) 10e4));
        }
        finish = System.nanoTime();
        System.out.println("Search in TreeMap: "+ (finish-start)/10e6+"milliseconds");

        /*Выводы: HashMap и LinkedHashMap работают за сопоставимое время, LinkedHashMap лучше применять для
        организации данных в порядке сортировки, TreeMap для организации данных по возрастанию или с применением компаратора,
        в общих случаях, когда такая организация не требуется, лучше применять HashMap.
         */







    }
}
