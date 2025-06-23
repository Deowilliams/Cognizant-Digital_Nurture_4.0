// Exercise 7: Observer Pattern
import java.util.*;

interface Observer {
    void update(String stock);
}

interface Stock {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockUpdate;

    public void setStockUpdate(String update) {
        this.stockUpdate = update;
        notifyObservers();
    }

    public void register(Observer o) {
        observers.add(o);
    }
    public void deregister(Observer o) {
        observers.remove(o);
    }
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockUpdate);
        }
    }
}

class MobileApp implements Observer {
    public void update(String stock) {
        System.out.println("Mobile App: " + stock);
    }
}

class WebApp implements Observer {
    public void update(String stock) {
        System.out.println("Web App: " + stock);
    }
}

class ObserverTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        Observer mobile = new MobileApp();
        Observer web = new WebApp();

        market.register(mobile);
        market.register(web);

        market.setStockUpdate("TCS at ₹3500");
    }
}
