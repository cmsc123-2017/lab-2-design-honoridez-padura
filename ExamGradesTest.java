import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ExamGradesTest extends TestCase {
  
  public void testHighestFirst() {
    
    ExamGrades g = new ExamGrades(100.0, 80.0, 99.9, 75.4, 89.5, 76.9, 77.4, 85.3, 65.5, 84.3);
    
    assertEquals(100.0, g.highest());
  }
  
  public void testHighestLast() {
    
    ExamGrades g = new ExamGrades(80.0, 99.9, 75.4, 89.5, 76.9, 77.4, 85.3, 65.5, 84.3, 100.0);
    
    assertEquals(100.0, g.highest());
  }
  
  public void testHighestMid() {

    
    ExamGrades g = new ExamGrades(80.0, 99.9, 100.0, 75.4, 89.5, 76.9, 77.4, 85.3, 65.5, 84.3);
    
    assertEquals(100.0, g.highest());
  }
  
}
