package Classes;

/**
 * класс обычного покупателя наследует абстрактный класс Actor
 */
public class OrdinaryClient extends Actor {

    /**
     * конструктор обчного покупателя 1 параметр
     * @param name намя покупателя
     */
    public OrdinaryClient(String name)
    {
        super(name); //вызов конструктора прородителя
    }   
    /**
    * переопределение метода от абстрактного класса Actor. Получения имени покупателя 
    */
    @Override
    public String getName() {        
        return super.name; 
    }
    /**метод возвращает статус покупателя сделал он заказ или нет*/
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }
    /**метод возвращает статус покупателя получил он заказ или нет*/
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    /**метод вуставнавливает статус покупателя "сделал заказ"*/
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }
    /**метод вуставнавливает статус покупателя "получил заказ"*/
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /**возвращает ссылку на самого себя*/
    @Override
    public Actor getActor() {
        return this;
    }
    /**устанавлиевает статус покупателя "принес заказ на возврат"*/
    @Override
    public void setBringOrderBack(boolean backOrder) {
        super.isMakeOrder = backOrder;
    }
    /**устанавлиевает статус покупателя "возврат осуществлен"*/
    @Override
    public void setReturnOrder(boolean returnOrder) {
        super.isTakeOrder = returnOrder;  
    }
    /** метод возвращает флаг принес покупатель возврат заказа или нет*/
    @Override
    public boolean isBringOrderBack() {
        return super.isBringROrderBack;
    }
    /** метод возвращает флаг осуществлен возврат заказа или нет*/
    @Override
    public boolean isReturnOrder() {
        return super.isReturnOrder;
    }
    
    
}