import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordAnalyzerTest {


  @Test
  public void testFRC_aardvark() {
    WordAnalyzer wa = new WordAnalyzer("aardvark");
    assertEquals('a', wa.firstRepeatedCharacter());
  }
  
  @Test
  public void testFRC_roommate() {
    WordAnalyzer wa = new WordAnalyzer("roommate");
    assertEquals('o', wa.firstRepeatedCharacter());
  }

  @Test
  public void testFRC_mate() {
    WordAnalyzer wa = new WordAnalyzer("mate");
    assertEquals(0, wa.firstRepeatedCharacter());
  }

  @Test
  public void testFRC_test() {
    WordAnalyzer wa = new WordAnalyzer("test");
    assertEquals(0, wa.firstRepeatedCharacter());
  }

  @Test
  public void testFMC_mississippi() {
    WordAnalyzer wa = new WordAnalyzer("mississippi");
    assertEquals('i', wa.firstMultipleCharacter());
  }

  @Test
  public void testFMC_mate() {
    WordAnalyzer wa = new WordAnalyzer("mate");
    assertEquals(0, wa.firstMultipleCharacter());
  }

  @Test
  public void testFMC_test() {
    WordAnalyzer wa = new WordAnalyzer("test");
    assertEquals('t', wa.firstMultipleCharacter());
  }

  @Test
  public void testCRC_mississippi() {
    WordAnalyzer wa = new WordAnalyzer("mississippi!!!");
    assertEquals(4, wa.countRepeatedCharacters());
  }

  @Test
  public void testCRC_test() {
    WordAnalyzer wa = new WordAnalyzer("test");
    assertEquals(0, wa.countRepeatedCharacters());
  }

  @Test
  public void testCRC_aabbcdaaaabb() {
    WordAnalyzer wa = new WordAnalyzer("aabbcdaaaabb");
    assertEquals(4, wa.countRepeatedCharacters());
  }


}