import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromoClient;
import Classes.SpecialClient;
import Classes.TaxService;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

public class App {
    public static void main(String[] args) throws Exception {
    //    Market market = new Market();                             //Создание экземпляра класса Market
    //    OrdinaryClient client1 = new OrdinaryClient("Boris");     //Создание экземпляра класса OrdinaryClient
    //    OrdinaryClient client2 = new OrdinaryClient("Dasha");
    //    SpecialClient client3 = new SpecialClient("Fedor", 1101); //Создание экземпляра класса SpecialClient
    //    market.acceptToMarket(client1);
    //    market.acceptToMarket(client2);
    //    market.acceptToMarket(client3);
    //    market.update();

       Market market = new Market();                                          //Создание экземпляра класса Market
       iActorBehaviour item1 = new OrdinaryClient("Boris");              // создаем не экземляры класса, а интерфейсы и уже им присваеваем класс
       iActorBehaviour item2 = new SpecialClient("Fedor", 1101);
       iActorBehaviour item3 = new OrdinaryClient("Dasha");
       iActorBehaviour item4 = new TaxService();
       iActorBehaviour item5 = new PromoClient("Olga", "sale10");   // создаем интерфейс и присваеваем ему класс PromoClient
       iReturnOrder item6 = new OrdinaryClient("Victor");
       

       market.acceptToMarket(item1);
       market.acceptToMarket(item2);
       market.acceptToMarket(item3);
       market.acceptToMarket(item4);
       market.acceptToMarket(item5);
       market.update();
       market.bringOderBack(item6);
       market.comeOrderBack(item6);
    }
}