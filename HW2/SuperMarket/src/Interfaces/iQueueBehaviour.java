package Interfaces;

/**
* интерфейс, позволяющий управлять очередью покупателей в магазине
*/
public interface iQueueBehaviour {
    // прототипы методов
    /**
    * добавление покупателя в очередь в магазине
    */
    void takeInQueue(iActorBehaviour actor);  
    /**
    * удаление покупателя из очереди в магазине
    */
    void releaseFromQueue();    
    /**
    * сделать заказ
    */             
    void takeOrder();  
    /**
    * забрать заказ
    */                     
    void giveOrder();                         
    /**
    * заказ на возврат заказ
    */  
    void bringOderBack(iReturnOrder actor);  
    /**
    * забрать возврат заказа
    */                         
    void comeOrderBack(iReturnOrder actor);                    
}