package Interfaces;

import Classes.Actor;
/**
* интерфейс "поведение покупателей"
*/
public interface iActorBehaviour {
    //прототипы метода
    void setMakeOrder(boolean makeOrder);   //сделать заказ
    void setTakeOrder(boolean pickUpOrder); //Забрал заказ
    boolean isMakeOrder();                  //статус покупателя "сделал заказ"
    boolean isTakeOrder();                  //статус покупателя "забрал заказ"
    Actor getActor();                       // метод вернет тип Actor
}