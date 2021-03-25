package hu.nive.ujratervezes.zarovizsga.cleaning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CleaningService {

  private List<Cleanable> cleanables = new ArrayList<>();

  public void add(Cleanable cleanable) {
    cleanables.add(cleanable);
  }

  public int cleanAll() {
    int sumOfCleaningAllBuildings = 0;
    for (Cleanable cleanable : cleanables) {
      sumOfCleaningAllBuildings += cleanable.clean();
    }
    cleanables.clear();
    return sumOfCleaningAllBuildings;
  }

  public int cleanOnlyOffices() {
    int sumOfCleaning = 0;
    Iterator<Cleanable> it = cleanables.iterator();
    while (it.hasNext()) {
      Cleanable office = it.next();
      sumOfCleaning = ifIsAnOfficeGetSumOfCleaning(sumOfCleaning, it, office);
    }
    return sumOfCleaning;
  }

  private int ifIsAnOfficeGetSumOfCleaning(int sumOfCleaning, Iterator<Cleanable> it, Cleanable office) {
    if (office.getType() == BuildingType.OFFICE) {
      sumOfCleaning += office.clean();
      it.remove();
    }
    return sumOfCleaning;
  }

  public List<Cleanable> findByAddressPart(String address) {
    List<Cleanable> result = new ArrayList<>();
    for (Cleanable cleanable:cleanables) {
      if (cleanable.getAddress().contains(address)) {
        result.add(cleanable);
      }
    }
    return result;
  }

  public String getAddresses() {
    StringBuilder sb = new StringBuilder();
    for (Cleanable cleanable:cleanables) {
      sb.append(cleanable.getAddress()).append(", ");
    }
    return sb.delete(sb.length() - 2
            , sb.length()).toString();
  }

  public List<Cleanable> getCleanables() {
    return cleanables;
  }
}
