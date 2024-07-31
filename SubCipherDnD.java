import java.util.HashMap;
import java.util.Map;

public class SubCipherDnD {

  public Map<Character, Character> key = new HashMap<>(){{
    put('a', '%');
    put('b', '%');
    put('c', '%');
    put('d', '%');
    put('e', '%');
    put('f', '%');
    put('g', '%');
    put('h', '%');
    put('i', '%');
    put('j', '%');
    put('k', '%');
    put('l', '%');
    put('m', '%');
    put('n', '%');
    put('o', '%');
    put('p', '%');
    put('q', '%');
    put('r', '%');
    put('s', '%');
    put('t', '%');
    put('u', '%');
    put('v', '%');
    put('w', '%');
    put('x', '%');
    put('y', '%');
    put('z', '%');
  }};

  public static void main(String[] args) {
    String message = "fcmhk\nabcdebfghied\nfjcdbkjkjlmnl";
    System.out.println(message);
    
    // loop through all possibilites of mappings
    // convert the message using key
    // save and analyze if valid words exist
    // if valid words exist, keep decrypted message
  }
}