import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<String> frutas = new HashSet<String>();
            frutas.add("Manzanas");
            frutas.add("Melissa");
            frutas.add("Kiwi");
            System.out.println(frutas);

        Set<Integer> nums = new LinkedHashSet<Integer>();
            nums.add(1);
            nums.add(5);
            nums.add(8);
            nums.add(4);
            System.out.println(nums);

        //For each
        for (Integer num : nums) {
            System.out.println(num);
        }

        Set<String> fruits = new TreeSet<String>();
            fruits.add("Zarzamora");
            fruits.add("Apple");
            fruits.add("Manzana");
            System.out.println(fruits);
        Set<Integer> numeros = new TreeSet<>();
            numeros.add(1);
            numeros.add(5);
            numeros.add(8);
            numeros.add(-4);
            System.out.println(numeros);
        mapas();
    }

    public static void mapas(){
        Map<String , Integer> edades = new HashMap<String , Integer>();
        edades.put("Melissa", 1);
        edades.put("Hugo", 5);
        edades.put("Paco", 8);
        System.out.println(edades);
        System.out.println(edades.get("Hugo"));
        System.out.println(edades.getOrDefault("Me", -4));
        for (Map.Entry<String , Integer> data : edades.entrySet()) {
            System.out.println(data.getKey() + ":" + data.getValue());
        }
    }
}