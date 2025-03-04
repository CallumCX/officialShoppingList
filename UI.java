import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.List;

public class UI {

    public UI() {
    }

    public static void main(String[] args) throws FileNotFoundException {
        List <String> currentList = new ArrayList<>();
        LinkedHashMap<String,Double> foodList = new LinkedHashMap<>();
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

        JTextField priceView = new JTextField("current price");
        priceView.setBounds(625,680,135,25);
        priceView.setHorizontalAlignment(JTextField.CENTER);
        priceView.setEditable(false);
        priceView.setFocusable(false);
        priceView.setVisible(true);
        mainWindow.add(priceView);

        JTextField foodView = new JTextField("all available foods");
        foodView.setBounds(750,100,135,25);
        foodView.setHorizontalAlignment(JTextField.CENTER);
        foodView.setEditable(false);
        foodView.setFocusable(false);
        foodView.setVisible(true);
        mainWindow.add(foodView);

        JTextArea listArea = new JTextArea();
        listArea.setEditable(false);
        listArea.setFocusable(false);
        for (String string:currentList) {
            listArea.append(string + "\n");
        }

        JScrollPane list = new JScrollPane(listArea);
        list.setBounds(468,150,200,500);
        list.setVisible(true);
        mainWindow.add(list);

        JTextArea priceArea = new JTextArea();
        priceArea.setEditable(false);
        priceArea.setFocusable(false);
        priceArea.setBounds(593,730,200,200);
        priceArea.setVisible(true);
        mainWindow.add(priceArea);
        priceArea.append(String.format("Current price is: £%.2f \n" , shopList.calculatePrice(currentList,foodList)));
        priceArea.append(String.format("Morrisons discount: £%.2f \n" , shopList.calculatePrice(currentList,foodList)*0.1));
        priceArea.append(String.format("Discounted price: £%.2f \n" , shopList.calculatePrice(currentList,foodList)*0.9));
        priceArea.repaint();

        JTextArea foodArea = new JTextArea();
        foodArea.setEditable(false);
        foodArea.setFocusable(false);
        foodArea.append("FRUIT: \n");
        for (Map.Entry<String,Double> stringDoubleEntry:foodList.entrySet()) {
            switch (stringDoubleEntry.getKey()) {
                case ("Raspberry"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("VEGETABLES: \n");
                    foodArea.repaint();
                    break;
                case ("Courgette"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("PASTA: \n");
                    foodArea.repaint();
                    break;
                case ("Conchiglie"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("MEAT & POULTRY: \n");
                    foodArea.repaint();
                    break;
                default:
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.repaint();
                    break;
            }
        }

        JScrollPane food = new JScrollPane(foodArea);
        food.setBounds(718,150,200,500);
        food.setVisible(true);
        mainWindow.add(food);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String addItem = itemInput.getText();
                shopList.addToList(addItem,foodList,currentList);
                updateList(listArea,currentList);
                updatePrice(priceArea,currentList,foodList);
                listArea.repaint();
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String removeItem = itemInput2.getText();
                shopList.removeFromlist(removeItem,currentList);
                updateList(listArea,currentList);
                updatePrice(priceArea,currentList,foodList);
                listArea.repaint();
            }
        });

        mainWindow.repaint();
        mainWindow.revalidate();
    }

    public static void updateList(JTextArea listArea,List<String> currentList) {
        listArea.setText("");

        for (String string:currentList) {
            listArea.append(string + "\n");
        }
    }

    public static void updatePrice(JTextArea priceArea,List<String> currentList,Map<String,Double> foodList) {
        priceArea.setText("");

        priceArea.append(String.format("Current price is: £%.2f \n" , shopList.calculatePrice(currentList,foodList)));
        priceArea.append(String.format("Morrisons discount: £%.2f \n" , shopList.calculatePrice(currentList,foodList)*0.1));
        priceArea.append(String.format("Discounted price: £%.2f \n" , shopList.calculatePrice(currentList,foodList)*0.9));
        priceArea.repaint();
    }
}
