import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UI {

    public UI() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        List <String> currentList = new ArrayList<>();
        HashMap<String,Double> foodList = new HashMap<>();
        shopList.createDictionary(foodList);

        JFrame mainWindow = new JFrame();
        mainWindow.setSize(1000, 1000);
        mainWindow.setResizable(false);
        mainWindow.setTitle("Shopping list creator!");
        mainWindow.setLayout(null);
        mainWindow.setVisible(true);

        JButton button1 = new JButton("add to list");
        button1.setBounds(100,100,135,25);
        button1.setVisible(true);
        mainWindow.add(button1);

        JTextField itemInput = new JTextField();
        itemInput.setBounds(250,100,135,25);
        itemInput.setVisible(true);
        mainWindow.add(itemInput);

        JButton button2 = new JButton("remove an item");
        button2.setBounds(100,135,135,25);
        button2.setVisible(true);
        mainWindow.add(button2);

        JTextField itemInput2 = new JTextField();
        itemInput2.setBounds(250,135,135,25);
        itemInput2.setVisible(true);
        mainWindow.add(itemInput2);

        JTextField listView = new JTextField("current shopping list");
        listView.setBounds(500,100,135,25);
        listView.setHorizontalAlignment(JTextField.CENTER);
        listView.setEditable(false);
        listView.setFocusable(false);
        listView.setVisible(true);
        mainWindow.add(listView);

        JTextField foodView = new JTextField("all available foods");
        foodView.setBounds(750,100,135,25);
        foodView.setHorizontalAlignment(JTextField.CENTER);
        foodView.setEditable(false);
        foodView.setFocusable(false);
        foodView.setVisible(true);
        mainWindow.add(foodView);

        JTextArea listArea = new JTextArea();
        listArea.setBounds(468,150,200,500);
        listArea.setEditable(false);
        listArea.setFocusable(false);

        JScrollPane list = new JScrollPane(listArea);
        list.setBounds(468,150,200,500);
        list.setVisible(true);
        mainWindow.add(list);

        JTextArea foodArea = new JTextArea();
        foodArea.setEditable(false);
        foodArea.setFocusable(false);
        for (Map.Entry<String,Double> stringDoubleEntry:foodList.entrySet()) {
            foodArea.append(stringDoubleEntry.getKey());
        }
        foodArea.repaint();

        JScrollPane food = new JScrollPane(foodArea);
        food.setBounds(718,150,200,500);
        food.setVisible(true);
        mainWindow.add(food);

        mainWindow.repaint();
        mainWindow.revalidate();
    }
}
