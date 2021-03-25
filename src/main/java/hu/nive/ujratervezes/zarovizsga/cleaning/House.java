package hu.nive.ujratervezes.zarovizsga.cleaning;

public class House implements Cleanable {

  private static final int PRICE = 80;
  private String address;
  private int area;
  private BuildingType type;

  public House(String address, int area) {
    this.address = address;
    this.area = area;
    this.type = BuildingType.HOUSE;
  }

  public int getArea() {
    return area;
  }

  @Override
  public BuildingType getType() {
    return type;
  }

  @Override
  public int clean() {

    return area * PRICE;
  }

  @Override
  public String getAddress() {

    return address;
  }
}
