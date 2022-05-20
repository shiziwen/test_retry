package tron.test;

import com.jcabi.aspects.RetryOnFailure;

import java.io.IOException;
import java.net.URL;

public class Main {
  public static void main(String[] args) {
    try {
      new Main().load();
    } catch (Exception e) {
    }
  }

  @RetryOnFailure(attempts = 10, delay = 1)
  public String load() {
    System.out.println("hello, world");
    throw new RuntimeException();
  }
}
