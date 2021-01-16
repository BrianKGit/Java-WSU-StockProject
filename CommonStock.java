/*
 * Author: Brian Klein
 * Date:
 * Program:
 * Description:
 */

public class CommonStock {
    
    //data members
    private String stockSymbol;
    private int shares;
    private double pricePerShare;

    public CommonStock() {
    }

    public CommonStock(String stockSymbol, int shares, double pricePerShare) {
        this.stockSymbol = stockSymbol;
        this.shares = shares;
        this.pricePerShare = pricePerShare;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }
    
    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }
    
    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
    }

    public double getPricePerShare() {
        return pricePerShare;
    }

    public void setPricePerShare(double pricePerShare) {
        this.pricePerShare = pricePerShare;
    }

    @Override
    public String toString() {
        return  "[" + stockSymbol + ", " + shares + ", $" + pricePerShare + "]";
    }
    
    
    
}
