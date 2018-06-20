import java.util.*;

public class Main {
    public static void main(String[] args) {
        ex3();
    }

    public static void ex1() {
        int[] numbers_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> numbers_list = new ArrayList<>();
        for(int i = 0; i < numbers_array.length; i++){
            numbers_list.add(numbers_array[i]);
        }

        Set<Integer> numbers_set = new HashSet<>();
        for(Integer i : numbers_array) {
            numbers_set.add(i);
        }
    }

    public static void ex2() {
        int[] numbers_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> numbers_list = new ArrayList<>();
        for(int i = 0; i < numbers_array.length; i++){
            numbers_list.add(numbers_array[i]);
        }

        Set<Integer> numbers_set = new HashSet<>();
        for(Integer i : numbers_list) {
            numbers_set.add(i);
        }

        Map<Integer, Integer> numbers_map = new HashMap<>();
        Iterator<Integer> it_set = numbers_set.iterator();
        while (it_set.hasNext()) {
            int i = it_set.next();
            numbers_map.put(i, i + 10);
        }

        for(Map.Entry<Integer, Integer> entry : numbers_map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public static void ex3() {
        int[] numbers_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        List<Integer> numbers_list = new ArrayList<>();
        for(int i = 0; i < numbers_array.length; i++){
            numbers_list.add(numbers_array[i]);
        }

        Set<Integer> numbers_set = new HashSet<>();
        for(Integer i : numbers_list) {
            numbers_set.add(i);
        }

        Map<Integer, Integer> numbers_map = new HashMap<>();
        Iterator<Integer> it_set = numbers_set.iterator();
        while (it_set.hasNext()) {
            int i = it_set.next();
            numbers_map.put(i, i + 10);
        }

        //remove items

        for(Integer i : new ArrayList<>(numbers_list)) {
            numbers_list.remove(i);
        }

        while (numbers_list.size() > 0){
            numbers_list.remove(0);
        }



        Iterator<Integer> it_remove_set = numbers_set.iterator();
        while (it_remove_set.hasNext()) {
            it_remove_set.next();
            it_remove_set.remove();
        }

        numbers_map.remove(0);

    }
}
