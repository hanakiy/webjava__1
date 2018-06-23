package hanakishopping;

public class Cart {



  private String name;

  private int num;





  public Cart(String name, int num) {



    this.name = name;

    this.num = num;

  }



  public String getName() {

    return name;

  }

  // setter

  public void setName(String name) {

    this.name = name;

  }



  public int getNum() {

    return num;

  }



  public void setNum(int num) {

     this.num = num;

  }

}