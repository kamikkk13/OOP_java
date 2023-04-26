package VendingMachines;

import Products.product;
import Products.product;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    
    private int volume;
    private List<product> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume){
        this.volume = volume;
        products = new ArrayList<product>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(product prod)
    {
        products.add(prod);
    }

    public void addSales(String line)
    {
        workLog.add(line);
    }

    public product getProdByName(String name)
    {
        for(product prod: products)
        {
            if(prod.getName().contains(name))
            {
                return prod;
            }
        }
        return null;
    }

    public List<product> getProdAll()
    {
        return products;
    }

}