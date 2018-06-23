package hanakishopping;


public class Item {



  private int id;

  private String name;

  private int price;



  public Item (int id, String name, int price) {



    this.id = id;

    this.name = name;

    this.price = price;

  }



  public int getId() {

    return id;

  }



  public void setId(int id) {

    this.id = id;

  }



  //商品名

  public String getName() {

    return name;

  }

  // setter

  public void setName(String name) {

    this.name = name;

  }



  public int getPrice() {

    return price;

  }



  public void setPrice(int price) {

     this.price = price;

  }

}