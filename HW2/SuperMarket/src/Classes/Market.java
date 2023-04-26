package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;
import Interfaces.iReturnOrder;

/**
* класс Маркет с полключенными интерфейсами
*/
public class Market implements iMarketBehaviour, iQueueBehaviour {
    //private List<Actor> queue;
    private List<iActorBehaviour> queue;                     //список из интерфейсов
   

    /**
     * конструктор очереди покупателей в маркете и очереди на возврат 
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();      //инициализация queue
    }

    /**
     * добавляем человека в очередь в магазине
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.getActor().getName()+" клиент пришел в магазин ");
        takeInQueue(actor);
    }

    /**добавление покупателя в очередь*/
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.getActor().getName()+" клиент добавлен в очередь ");
    }

    /**
     * удаляем человека из очереди в магазине
     */
    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for(Actor actor:actors)
        {
            System.out.println(actor.getName()+" клиент ушел из магазина ");
            queue.remove(actor);
        }
        
    }

    /**обновление статусов покупателя*/
    @Override
    public void update() {
       takeOrder();
       giveOrder();
       releaseFromQueue();
    }
    /**метод получения заказа */
    @Override
    public void giveOrder() {
        for(iActorBehaviour actor: queue)  //для всех покупателей из очереди
        {
            if(actor.isMakeOrder())         // если покупатель  уже сделал заказ
            {
                actor.setTakeOrder(true);    //установить флаг "получил заказ"
                System.out.println(actor.getActor().getName()+" клиент получил свой заказ ");
            }
        }
        
    }
    /**удаление из очереди*/
    @Override
    public void releaseFromQueue() {
       List<Actor> releaseActors = new ArrayList<>(); //список удаляемых покуптелей. в этом списке собирём всех, кто уже забрал заказ
       for(iActorBehaviour actor:queue)
       {
        if(actor.isTakeOrder()) //если покуптель получил заказ
        {
            releaseActors.add(actor.getActor()); //добавляем в список удаляемых клиенов
            System.out.println(actor.getActor().getName()+" клиент ушел из очереди ");
        }

       }
    releaseFromMarket(releaseActors); //удяляем, передав список удаляемых покупателей 
    }


    /**покупатель взял заказ*/
    @Override
    public void takeOrder() {
        for(iActorBehaviour actor:queue) //проходим всех покупателей в очереди
        {
            if(!actor.isMakeOrder()) //если сделал заказ
            {
                actor.setMakeOrder(true); //устанавливаем его статус "сделал заказ"
                System.out.println(actor.getActor().getName()+" клиент сделал заказ ");

            }
        }
        
    }
    /**принесен товар на возврат*/
    @Override
    public void bringOderBack(iReturnOrder actor) {
            if(!actor.isBringOrderBack()) //если принес заказ на возврат
            {
                actor.setBringOrderBack(true); //устанавливаем его статус "принес заказ на возврат"
                System.out.println(actor.getActor().getName()+" клиент принес заказ на возврат ");

            }
          
    }
    /**Возврат осуществлен*/
    @Override
    public void comeOrderBack(iReturnOrder actor) {

            if(!actor.isReturnOrder()) //если покупатель вернул заказ
            {
                actor.setReturnOrder(true); //устанавливаем его статус "возврат осуществлен"
                System.out.println(actor.getActor().getName()+" возврат товара осуществлен");
            }
    }

}