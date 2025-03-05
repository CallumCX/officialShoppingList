import javax.swing.*;
import java.io.*;
import java.util.*;

public class shopList {
    List <String> shoppingList;


    public shopList(List<String> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public static void addToList(String givenItem,Map<String,Double> food,List<String> shoppingList) {
        if (food.containsKey(givenItem)) {
            shoppingList.add(givenItem);
        }
    }

    public static void removeFromlist(String givenItem,List<String> shoppingList) {
        if (shoppingList.contains(givenItem)) {
            shoppingList.remove(givenItem);
        }
    }

    public static double calculatePrice(List<String> shoppingList,Map<String,Double> food) {
        double price = 0.0;

        for (String string:shoppingList) {
            price += food.get(string);
        }
        return price;
    }

    public static void createDictionary(Map<String,Double> dict) throws FileNotFoundException {
        File file = new File("C:\\Users\\callu\\IdeaProjects\\officialShoppingList\\allFoods.txt");
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            String[] foodData = (reader.nextLine().trim().split(":"));
            String foodName = foodData[0];
            Double foodPrice = Double.parseDouble(foodData[1]);
            dict.put(foodName,foodPrice);
        }

        reader.close();
    }

    public static void saveToFile(List<String> shoppingList, String saveFile) throws IOException {
        FileWriter writer = new FileWriter(saveFile);

        for (String string:shoppingList) {
            writer.write(string + "\n");
        }

        writer.close();
    }

    public static void loadFile(List<String> shoppingList,String saveFile) throws FileNotFoundException {
        File file = new File(saveFile);
        Scanner reader = new Scanner(file);

        while (reader.hasNextLine()) {
            shoppingList.add(reader.nextLine());
        }

        reader.close();
    }

    public static void exit() {
        System.exit(0);
    }

}
