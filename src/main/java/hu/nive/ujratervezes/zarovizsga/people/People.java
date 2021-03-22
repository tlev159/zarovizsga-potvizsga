package hu.nive.ujratervezes.zarovizsga.people;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class People {

  public int getNumberOfMales(String path) {
    int numberOfMales = 0;
    try (BufferedReader reader = Files.newBufferedReader(Path.of(path))) {
      String line;
      reader.readLine();
      while ((line = reader.readLine()) != null) {
        if (line.split(",")[4].equals("Male")) {
          numberOfMales++;
        }
      }
      return numberOfMales;
    }
    catch (IOException ioe) {
      throw new IllegalArgumentException("Can not read file!", ioe);
    }
  }
}
