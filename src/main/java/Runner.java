import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

//        SCOTTISH ISLANDS
        List<String> scottishIslands = new ArrayList<>();
        scottishIslands.add("Jura");
        scottishIslands.add("Mull");
        scottishIslands.add("Skye");
        scottishIslands.add("Arran");
        scottishIslands.add("Tresco");

//        1. Add "Coll" to the end of the list
        scottishIslands.add("Coll");


//        2. Add "Tiree" to the start of the list
        scottishIslands.add(0, "Tiree");


//        3. Add "Islay" after "Jura" and before "Mull"
        scottishIslands.add(2, "Islay");
        System.out.println(scottishIslands);

//        4. Print out the index position of "Skye"
        System.out.println("The index of the element Skye is " + scottishIslands.indexOf("Skye"));

//        5. Remove "Tresco" from the list by name

        scottishIslands.remove("Tresco");

//        6. Remove "Arran" from the list by index
        scottishIslands.remove(5);

//        7. Print the number of islands in your arraylist
        System.out.println("the number of Scottish Islands in this Array is " + scottishIslands.size());


//        8. Sort the list alphabetically
        scottishIslands.sort(Comparator.naturalOrder());

//        9. Print out all the islands using a for loop
        for (int i = 0; i< scottishIslands.size(); i++) {
            String islandList = scottishIslands.get(i);
            System.out.println(islandList);
        }


        System.out.println(scottishIslands);

//        NUMBERS
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1, 1, 4, 2, 7, 1, 6, 15, 13, 99, 7);

        System.out.println("List of all numbers: " + numbers);

//        1. Print out a list of the even integers

        List n= numbers.stream().filter(i->i%2==0).collect(Collectors.toList());

        System.out.println("The even numbers are " +n);

//        2. Print the difference between the largest and smallest value

//        Obtain largest value in an Array List using for loop:

        int max = numbers.get(0);

        for (int i= 0; i<numbers.size(); i++) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
            }

        }
//          Obtain smallest value in an Array List using for loop:
        int min = numbers.get(0);

        for (int i= 0; i<numbers.size(); i++) {
            if (numbers.get(i) < min) {
                min = numbers.get(i);
            }

        }
        System.out.println("The difference between the highest and lowest value is " + (max- min));

//        3. Print True if the list contains a 1 next to a 1 somewhere.
//        4. Print the sum of the numbers,

        int sum = 0; // Name variable and it's initial int value
        for (int num: numbers) //This makes the int 'num' run through every value in our Array List
        {
            sum +=num; //Here, each time one number from our array is added to our sum, it moves onto the next
        }
        System.out.println("The sum of all values is " + sum);
//        5. Print the sum of the numbers...
//           ...except the number 13 is unlucky, so it does not count...
//           ...and numbers that come immediately after a 13 also do not count.
//
//          So [7, 13, 2] would have sum of 9.

    }

}
