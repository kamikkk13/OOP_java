package Interfaces;

import java.util.List;

import Classes.Actor;
/**
* интерфейс "поведение покупателей в маркете"
*/
public interface iMarketBehaviour {
    //прототипы методов
    /**
    * метод "пришел в магазин"
    */
    void acceptToMarket(iActorBehaviour actor); 
    /**
    * метод "покинул магазин"
    */
    void releaseFromMarket(List<Actor> actors); 
    /**
    * обновление статуса
    */
    void update();                              
}