class ExamGrades {
  double grades[] = new double[10];
  
  ExamGrades(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j) {
    this.grades[0] = a;
    this.grades[1] = b;
    this.grades[2] = c;
    this.grades[3] = d;
    this.grades[4] = e;
    this.grades[5] = f;
    this.grades[6] = g;
    this.grades[7] = h;
    this.grades[8] = i;
    this.grades[9] = j;
  }
  
  // TEMPLATE
  /*   Fields:
   *     this.grades      -- double
   * 
   *   Methods:
   *     this.highest()   -- double
   */
  
  // -> int
  // Returns the highest grade of this array of grades
  double highest() {
    double highNum = grades[0];
    for (int i = 1; i < this.grades.length; i++) {
      if (grades[i] > highNum) {
        highNum = grades[i];
      }
    }
    return highNum;
  }
  
}