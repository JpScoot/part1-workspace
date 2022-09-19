/*
 * This code is sample code, provided AS-IS, and we make NO
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.data.io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PersonDataClient {

  /**
   * To run one method at a time, uncomment the call to the one you want to execute.
   */
  public static void main(String[] args) {
     writeData();
    readData();
  }

  /**
   * TASK: write the following data (as Strings and Java primitives) to file 'person.dat': your-name
   * (String)  your-age (int)  your-shoe-size (double)  marital-status (boolean)
   * <p>
   * Here's a sample: Java Programmer     54              9.5                      true
   * <p>
   * Use a DataOutputStream wrapped around a FileOutputStream. Use a try-with-resources to
   * initialize the stream and auto-close it.
   */
  private static void writeData() {
    // TODO
    try (DataOutputStream out = new DataOutputStream(new FileOutputStream("person.dat"))) {
      out.writeUTF("Java Programmer");
      out.writeInt(54);
      out.writeDouble(17.5);
      out.writeBoolean(true);


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  /**
   * TASK: read the data written to 'person.dat' back in to the appropriate Java datatypes.
   * <p>
   * You need to read it in the same sequence as it was written. Then print to stdout to see it.
   * <p>
   * Use a DataInputStream wrapped around a FileInputStream. Use a try-with-resources to initialize
   * the stream and auto-close it.
   */
  private static void readData() {
    // TODO
    try (DataInputStream in = new DataInputStream(new FileInputStream("person.dat"))) {
      String name = in.readUTF();
      System.out.println(name);
      int age = in.readInt();
      System.out.println(age);
      double shoeSize = in.readDouble();
      System.out.println(shoeSize);
      boolean isMarried = in.readBoolean();
      System.out.println(isMarried);


    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}