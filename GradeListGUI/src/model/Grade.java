package model;

import java.util.Objects;

public class Grade
{
  private int grade;
  private String course;
  public static final int[] LEGAL_GRADES = {12, 10, 7, 4, 2, 0, -3};

  public Grade(int grade, String course)
  {
    this.grade = grade;
    this.course = course;
  }

  public int getGrade()
  {
    return grade;
  }

  public String getCourse()
  {
    return course;
  }

  public static boolean isLegalGrade(int grade)
  {
    for (int i = 0; i < LEGAL_GRADES.length; i++)
    {
      if (grade == LEGAL_GRADES[i])
      {
        return true;
      }
    }
    return false;
  }

  @Override public boolean equals(Object obj)
  {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Grade grade1 = (Grade) obj;
    return grade == grade1.grade && Objects.equals(course, grade1.course);
  }

  @Override public String toString()
  {
    return "Grade{" + "grade=" + grade + ", course='" + course + '\'' + '}';
  }
}