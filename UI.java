import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
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




        JButton button3 = new JButton("clear shopping list");
        button3.setBounds(92,170,150,25);
        button3.setVisible(true);
        mainWindow.add(button3);




        JButton button4 = new JButton("save shopping list");
        button4.setBounds(92,250,150,25);
        button4.setVisible(true);
        mainWindow.add(button4);




        JCheckBox saveBox1 = new JCheckBox("save 1");
        JCheckBox saveBox2 = new JCheckBox("save 2");
        JCheckBox saveBox3 = new JCheckBox("save 3");
        saveBox1.setBounds(92,280,150,25);
        saveBox2.setBounds(92,300,150,25);
        saveBox3.setBounds(92,320,150,25);
        saveBox1.setEnabled(false);
        saveBox2.setEnabled(false);
        saveBox3.setEnabled(false);
        saveBox1.setVisible(true);
        saveBox2.setVisible(true);
        saveBox3.setVisible(true);
        mainWindow.add(saveBox1);
        mainWindow.add(saveBox2);
        mainWindow.add(saveBox3);




        JButton button5 = new JButton("save");
        button5.setBounds(100,350,135,25);
        button5.setEnabled(false);
        button5.setVisible(true);
        mainWindow.add(button5);




        JButton button6 = new JButton("cancel");
        button6.setBounds(100,380,135,25);
        button6.setEnabled(false);
        button6.setVisible(true);
        mainWindow.add(button6);




        JButton button7 = new JButton("load shopping list");
        button7.setBounds(275,250,150,25);
        button7.setVisible(true);
        mainWindow.add(button7);




        JCheckBox loadBox1 = new JCheckBox("save 1");
        JCheckBox loadBox2 = new JCheckBox("save 2");
        JCheckBox loadBox3 = new JCheckBox("save 3");
        loadBox1.setBounds(275,280,150,25);
        loadBox2.setBounds(275,300,150,25);
        loadBox3.setBounds(275,320,150,25);
        loadBox1.setEnabled(false);
        loadBox2.setEnabled(false);
        loadBox3.setEnabled(false);
        loadBox1.setVisible(true);
        loadBox2.setVisible(true);
        loadBox3.setVisible(true);
        mainWindow.add(loadBox1);
        mainWindow.add(loadBox2);
        mainWindow.add(loadBox3);




        JButton button8 = new JButton("load");
        button8.setBounds(283,350,135,25);
        button8.setEnabled(false);
        button8.setVisible(true);
        mainWindow.add(button8);




        JButton button9 = new JButton("cancel");
        button9.setBounds(283,380,135,25);
        button9.setEnabled(false);
        button9.setVisible(true);
        mainWindow.add(button9);




        JTextField stats = new JTextField("shopping statistics");
        stats.setBounds(190,440,135,25);
        stats.setHorizontalAlignment(JTextField.CENTER);
        stats.setEditable(false);
        stats.setFocusable(false);
        stats.setVisible(true);
        mainWindow.add(stats);




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




        JTextArea statsView = new JTextArea();
        statsView.setBounds(134,490,250,300);
        statsView.setEditable(false);
        statsView.setFocusable(false);
        statsView.setVisible(true);
        mainWindow.add(statsView);

        List<String> statsList = new ArrayList<>();
        double carbohydrates = 0;
        double fruitVeg = 0;
        double dairy = 0;
        double protein = 0;
        double carbPrice = 0;
        double fruitVegPrice = 0;
        double dairyPrice = 0;
        double proteinPrice = 0;

        for (Map.Entry<String,Double> stringDoubleEntry:foodList.entrySet()) {
            statsList.add(stringDoubleEntry.getKey());
        }

        for (String string:currentList) {
            if (statsList.indexOf(string) <= statsList.indexOf("Raspberry")){
                fruitVeg += 1;
                fruitVegPrice += foodList.get(string);
            } else if (statsList.indexOf(string) <= statsList.indexOf("Courgette") && statsList.indexOf(string) > statsList.indexOf("Raspberry")) {
                fruitVeg += 1;
                fruitVegPrice += foodList.get(string);
            }
            else if (statsList.indexOf(string) <= statsList.indexOf("Conchiglie") && statsList.indexOf(string) > statsList.indexOf("Courgette")){
                carbohydrates += 1;
                carbPrice += foodList.get(string);
            }
            else if (statsList.indexOf(string) <= statsList.indexOf("Duck Breast") && statsList.indexOf(string) > statsList.indexOf("Conchiglie")) {
                protein += 1;
                proteinPrice += foodList.get(string);
            }
            else if (statsList.indexOf(string) <= statsList.indexOf("Tofu") && statsList.indexOf(string) > statsList.indexOf("Duck Breast")) {
                dairy += 1;
                dairyPrice += foodList.get(string);
            }
        }
        if (!currentList.isEmpty()) {
            statsView.append(String.format("Fruit & veg percentage: %.2f",(fruitVeg / currentList.size()) * 100) + "%\n");
            statsView.append(String.format("Carbohydrates percentage: %.2f",(carbohydrates / currentList.size()) * 100) + "%\n");
            statsView.append(String.format("Protein percentage: %.2f",(protein / currentList.size()) * 100) + "%\n");
            statsView.append(String.format("Dairy percentage: %.2f",(dairy / currentList.size()) * 100) + "%\n");
            statsView.append("\n");
            statsView.append(String.format("Total amount spent on fruit & veg: £%.2f \n",fruitVegPrice));
            statsView.append(String.format("Total amount spent on carbohydrates: £%.2f \n",carbPrice));
            statsView.append(String.format("Total amount spent on protein: £%.2f \n",proteinPrice));
            statsView.append(String.format("Total amount spent on dairy: £%.2f \n",dairyPrice));
            statsView.repaint();
            statsView.revalidate();
        }
        else {
            statsView.append("Fruit & veg percentage: 0.0%\n");
            statsView.append("Carbohydrates percentage: 0.0%\n");
            statsView.append("Protein percentage: 0.0%\n");
            statsView.append("Dairy percentage: 0.0%\n");
            statsView.append("\n");
            statsView.append("Total amount spent on fruit & veg: £0.00 \n");
            statsView.append("Total amount spent on carbohydrates: £0.00 \n");
            statsView.append("Total amount spent on protein: £0.00 \n");
            statsView.append("Total amount spent on dairy: £0.00 \n");
            statsView.repaint();
            statsView.revalidate();
        }





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
                    foodArea.append("\n");
                    foodArea.append("VEGETABLES: \n");
                    foodArea.repaint();
                    break;
                case ("Courgette"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("\n");
                    foodArea.append("BREAD: \n");
                    foodArea.repaint();
                    break;
                case ("Teacake"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("\n");
                    foodArea.append("PASTA: \n");
                    foodArea.repaint();
                    break;
                case ("Conchiglie"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("\n");
                    foodArea.append("FISH: \n");
                    foodArea.repaint();
                    break;
                case ("Catfish"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("\n");
                    foodArea.append("MEAT & POULTRY: \n");
                    foodArea.repaint();
                    break;
                case ("Duck Breast"):
                    foodArea.append(stringDoubleEntry.getKey() + "\n");
                    foodArea.append("\n");
                    foodArea.append("DIARY: \n");
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
                updateStats(statsView,currentList,foodList);
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
                updateStats(statsView,currentList,foodList);
                listArea.repaint();
            }
        });




        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listArea.setText("");
                currentList.clear();
                updatePrice(priceArea,currentList,foodList);
                updateStats(statsView,currentList,foodList);
            }
        });




        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveBox1.setEnabled(true);
                saveBox2.setEnabled(true);
                saveBox3.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);

                mainWindow.repaint();
                mainWindow.revalidate();
            }
        });




        saveBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveBox2.setSelected(false);
                saveBox3.setSelected(false);
            }
        });




        saveBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveBox1.setSelected(false);
                saveBox3.setSelected(false);
            }
        });




        saveBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveBox2.setSelected(false);
                saveBox1.setSelected(false);
            }
        });




        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = null;
                if (saveBox1.isEnabled() && saveBox1.isSelected()) {
                    text = "save1";
                }
                else if (saveBox2.isEnabled() && saveBox2.isSelected()) {
                    text = "save2";
                }
                else if (saveBox3.isEnabled() && saveBox3.isSelected()) {
                    text = "save3";
                }

                try {
                    shopList.saveToFile(currentList,text);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });




        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadBox1.setEnabled(true);
                loadBox2.setEnabled(true);
                loadBox3.setEnabled(true);
                button8.setEnabled(true);
                button9.setEnabled(true);

                mainWindow.repaint();
                mainWindow.revalidate();
            }
        });




        loadBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadBox2.setSelected(false);
                loadBox3.setSelected(false);
            }
        });




        loadBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadBox1.setSelected(false);
                loadBox3.setSelected(false);
            }
        });




        loadBox3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadBox1.setSelected(false);
                loadBox2.setSelected(false);
            }
        });




        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = null;
                if (loadBox1.isEnabled() && loadBox1.isSelected()) {
                    text = "save1";
                }
                else if (loadBox2.isEnabled() && loadBox2.isSelected()) {
                    text = "save2";
                }
                else if (loadBox3.isEnabled() && loadBox3.isSelected()) {
                    text = "save3";
                }
                currentList.clear();
                try {
                    shopList.loadFile(currentList,text);
                } catch (FileNotFoundException ex) {
                    throw new RuntimeException(ex);
                }

                listArea.setText("");
                for (String string:currentList) {
                    listArea.append(string + "\n");
                }
                mainWindow.repaint();
                mainWindow.revalidate();
                updatePrice(priceArea,currentList,foodList);
                updateStats(statsView,currentList,foodList);
            }
        });




        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveBox1.setEnabled(false);
                saveBox1.setSelected(false);
                saveBox2.setEnabled(false);
                saveBox2.setSelected(false);
                saveBox3.setSelected(false);
                saveBox3.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
            }
        });




        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loadBox1.setEnabled(false);
                loadBox1.setSelected(false);
                loadBox2.setEnabled(false);
                loadBox2.setSelected(false);
                loadBox3.setSelected(false);
                loadBox3.setEnabled(false);
                button8.setEnabled(false);
                button9.setEnabled(false);
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




    public static void updateStats(JTextArea statsView,List<String> currentList,Map<String,Double> foodList) {
        statsView.setText("");

        List<String> statsList = new ArrayList<>();
        double carbohydrates = 0;
        double fruitVeg = 0;
        double dairy = 0;
        double protein = 0;
        double carbPrice = 0;
        double fruitVegPrice = 0;
        double dairyPrice = 0;
        double proteinPrice = 0;

        for (Map.Entry<String,Double> stringDoubleEntry:foodList.entrySet()) {
            statsList.add(stringDoubleEntry.getKey());
        }

        for (String string:currentList) {
            if (statsList.indexOf(string) <= statsList.indexOf("Raspberry")){
                fruitVeg += 1;
                fruitVegPrice += foodList.get(string);
            } else if (statsList.indexOf(string) <= statsList.indexOf("Courgette") && statsList.indexOf(string) > statsList.indexOf("Raspberry")) {
                fruitVeg += 1;
                fruitVegPrice += foodList.get(string);
            }
            else if (statsList.indexOf(string) <= statsList.indexOf("Conchiglie") && statsList.indexOf(string) > statsList.indexOf("Courgette")){
                carbohydrates += 1;
                carbPrice += foodList.get(string);
            }
            else if (statsList.indexOf(string) <= statsList.indexOf("Duck Breast") && statsList.indexOf(string) > statsList.indexOf("Conchiglie")) {
                protein += 1;
                proteinPrice += foodList.get(string);
            }
            else if (statsList.indexOf(string) <= statsList.indexOf("Tofu") && statsList.indexOf(string) > statsList.indexOf("Duck Breast")) {
                dairy += 1;
                dairyPrice += foodList.get(string);
            }
        }

        if (!currentList.isEmpty()) {
            statsView.append(String.format("Fruit & veg percentage: %.2f",(fruitVeg / currentList.size()) * 100) + "%\n");
            statsView.append(String.format("Carbohydrates percentage: %.2f",(carbohydrates / currentList.size()) * 100) + "%\n");
            statsView.append(String.format("Protein percentage: %.2f",(protein / currentList.size()) * 100) + "%\n");
            statsView.append(String.format("Dairy percentage: %.2f",(dairy / currentList.size()) * 100) + "%\n");
            statsView.append("\n");
            statsView.append(String.format("Total amount spent on fruit & veg: £%.2f \n",fruitVegPrice));
            statsView.append(String.format("Total amount spent on carbohydrates: £%.2f \n",carbPrice));
            statsView.append(String.format("Total amount spent on protein: £%.2f \n",proteinPrice));
            statsView.append(String.format("Total amount spent on dairy: £%.2f \n",dairyPrice));
            statsView.repaint();
            statsView.revalidate();
        }
        else {
            statsView.append("Fruit & veg percentage: 0.0%\n");
            statsView.append("Carbohydrates percentage: 0.0%\n");
            statsView.append("Protein percentage: 0.0%\n");
            statsView.append("Dairy percentage: 0.0%\n");
            statsView.append("\n");
            statsView.append("Total amount spent on fruit & veg: £0.00 \n");
            statsView.append("Total amount spent on carbohydrates: £0.00 \n");
            statsView.append("Total amount spent on protein: £0.00 \n");
            statsView.append("Total amount spent on dairy: £0.00 \n");
            statsView.repaint();
            statsView.revalidate();
        }

    }
}
