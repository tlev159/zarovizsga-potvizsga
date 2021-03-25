package hu.nive.ujratervezes.zarovizsga.cleaning;

public class Office implements Cleanable {

  private static final int PRICE = 100;
  private String address;
  private int area;
  private int floors;
  private BuildingType type;

  public Office(String address, int area, int floors) {
    this.address = address;
    this.area = area;
    this.floors = floors;
    this.type = BuildingType.OFFICE;
  }

  @Override
  public int clean() {

    return area * floors * PRICE;
  }

  @Override
  public String getAddress() {

    return address;
  }

  public int getArea() {

    return area;
  }

  public int getFloors() {

    return floors;
  }

  @Override
  public BuildingType getType() {
    return type;
  }
}
