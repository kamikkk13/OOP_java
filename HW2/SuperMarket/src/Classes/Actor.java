package Classes;

import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * абстактный класс описывающий покупателя
 */

public abstract class Actor implements iActorBehaviour, iReturnOrder {
    /** Защищенные поля общие для всех покупателей*/
    /** имя покупателя*/
    protected String name; 
    /** флаг "получил заказ" */
    protected boolean isTakeOrder;
    /** флаг "сделал заказ" */
    protected boolean isMakeOrder;
    /** флаг "принес заказ на возврат" */
    protected boolean isBringROrderBack;
    /** флаг "возврат осуществлен" */
    protected boolean isReturnOrder;
    
     /**
     * конструктор покупателя 1 параметр
     * @param name намя покупателя
     */
    public Actor(String name) {
        this.name = name;
    }
    /** абстрактный метот получения имени покупателя*/
    public abstract String getName(); 

}