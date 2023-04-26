package Classes;

/**
 * класс vip покупателя наследует абстрактный класс Actor
 */
public class SpecialClient extends Actor{
    private int idVIP;
    /**
     * конструктор vip покупателя 2 параметра
     * @param name намя покупателя
     * @param idVIP "номер вип карты"
     */
    public SpecialClient(String name, int idVIP){
        super(name);                                //вызов конструктора прородителя
        this.idVIP = idVIP;                         
    }
    //переопределение метода getName
    @Override
    public String getName() {
        return super.name;
    }
    /**
    * метод возвращает номер вип клиента
    */
    public int getIdVIP() {
        return idVIP;
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