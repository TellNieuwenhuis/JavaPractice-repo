import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for (int i = 0; i < lineItems.length; i++){
            sum += lineItems[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String>menuList){
        for (int i = 0; i < menuList.size(); i++){
            System.out.printf("%s. %s\n",i, menuList.get(i));
        }
    }
    
    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        System.out.println("Hello, " + userName + "!");
        int numAhead = customers.size();
        System.out.println("There are " + numAhead + " people(s) in front of you.");
        customers.add(userName);
        System.out.println(customers);
    }

    public void printCost(String product, double price, int maxQuantity) {
        System.out.println(product);
        for (int i = 1; i <= maxQuantity; i++) {
            // System.out.println(i + " " + product + "(s) will cost $" + (price * i));
            System.out.printf("%s = $%.2f\n", i, i * price);
        }
    }
    
}
