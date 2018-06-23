package hanakishopping;

import java.util.ArrayList;

public class ListService {



  public static ArrayList<Item> getItemList() {



  ArrayList<Item> itemlist= new ArrayList<Item>();

  itemlist.add(new Item(1, "キリン", 100));

  itemlist.add(new Item(2, "ぞう", 200));

  itemlist.add(new Item(3, "ライオン", 300));



  return itemlist;

  }

}