/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */
import java.util.*;

public class CommonStockClient {
    
    public static void main(String [] args) {
        
        //create a queue
        Queue<CommonStock> stockQueue = new LinkedList<CommonStock>();
        
        //day1 buy 100 shares at $20 per share
        stockQueue.add(new CommonStock("Stk", 100, 20));
        
        //day2 buy 20 shares at $24 per share
        stockQueue.add(new CommonStock("Stk", 20, 24));
        
        //day1 buy 200 shares at $36 per share
        stockQueue.add(new CommonStock("Stk", 200, 36));
        
        //day4 sell 150 shares at $30 per share
        CommonStock day1 = stockQueue.remove();
        CommonStock day2 = stockQueue.remove();
        CommonStock day3 = stockQueue.peek(); //retrieve it without removing it
        
        double pricePaid, priceSold, profit = 0.0;
        
        //calculate day 1 profit or loss
        pricePaid = day1.getShares() * day1.getPricePerShare();
        priceSold = day1.getShares() * 30;
        
        profit += (priceSold - pricePaid);
        
        //calculate day 2 profit or loss
        pricePaid = day2.getShares() * day2.getPricePerShare();
        priceSold = day2.getShares() * 30;
        
        profit += (priceSold - pricePaid);
        
        //calculate day 3 profit or loss
        pricePaid = (150 - day1.getShares() - day2.getShares()) 
                    * day3.getPricePerShare();
        priceSold = (150 - day1.getShares() - day2.getShares()) 
                    * 30;
        
        profit += (priceSold - pricePaid);
        
        System.out.println("Total profit or loss: " + profit);
        
        //update the day 3 shares in the queue
        day3.setShares(170);
        
        System.out.println(stockQueue);
        
    }
    
}
