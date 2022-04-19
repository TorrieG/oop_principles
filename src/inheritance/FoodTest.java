package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {

        /*
        Create a food1 object and define below info for it
        taste = delicious
        name = sushi
        isSpicy = true
        isOrganic = true

        First, print the name of the food
        Then, print if the food is organic
        Finally, print the object itself
         */

        Food food1 = new Food();
        food1.taste = "delicious";
        food1.name = "sushi";
        food1.isSpicy = true;
        food1.setOrganic(true);

        System.out.println("Food name is = " + food1.name);
        System.out.println("The food is organic = " + food1.isOrganic());
        System.out.println(food1);

        /*
        Create a vegetable1 object and define below info for it
        taste = good
        name = parsley
        isSpicy = false
        isOrganic = true
        color = green

        First, print the name of the vegetable and color of the vegetable
        Then, print if the vegetable is organic
        Finally, print the object itself
         */

        Vegetable vegetable1 = new Vegetable();
        vegetable1.taste = "good";
        vegetable1.name = "parsley";
        vegetable1.isSpicy = false;
        vegetable1.setOrganic(true);
        vegetable1.color = "green";

        System.out.println(vegetable1.name);
        System.out.println(vegetable1.color);
        System.out.println(vegetable1.isOrganic());
        System.out.println(vegetable1);

        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";
        System.out.println(vegetable2);

        ArrayList<Food> allFoods = new ArrayList<>();
        allFoods.add(food1);
        allFoods.add(vegetable1);
        allFoods.add(vegetable2);

        /*
        I have one Food object -> sushi
        I have 2 Vegetable objects -> parsley, broccoli

        Count and print how many elements in the list has a name that has more than 5 characters

        RESULT:
        2
         */

        int a = 0;
        for (Food allFood : allFoods) {
            if (allFood.name.length() > 5)a++;
        }

        System.out.println(a);

        System.out.println("\n-------Count Task BONUS solution--------\n");
        System.out.println(allFoods.stream().filter(food -> food.name.length() > 5).count());

    }
}
