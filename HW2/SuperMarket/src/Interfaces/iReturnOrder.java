package Interfaces;

import Classes.Actor;

/**
* интерфейс возврата товара
*/
public interface iReturnOrder {
    //прототипы метода
    /**
    * установить статус покупателя "принес заказ на возврат"
    */  
    void setBringOrderBack(boolean backOrder);
    /**
    * установить статус покупателя "возврат принят"
    */           
    void setReturnOrder(boolean returnOrder); 
    /**
    * статус покупателя "принес возврат"
    */       
    boolean isBringOrderBack();   
    /**
    * статус покупателя "возврат принят"
    */                    
    boolean isReturnOrder();    
    /**
    *  метод вернет тип Actor (ссылка на самого себя)
    */                        
    Actor getActor();                            
    
}