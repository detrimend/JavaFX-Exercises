package model;

import java.util.ArrayList;
import java.util.Objects;

public class GradeList
{
  private ArrayList<Grade> grades;

  public GradeList()
  {
    this.grades = new ArrayList<>();
  }

  public int size()
  {
    return grades.size();
  }

  public void addGrade(Grade grade)
  {
    if (Grade.isLegalGrade(grade.getGrade()))
    {
      grades.add(grade);
    }
  }

  public void addGrade(int index, Grade grade)
  {
    if (Grade.isLegalGrade(grade.getGrade()))
    {
      grades.add(index,grade);
    }
  }

  public void removeGrade(int index)
  {
    grades.remove(index);
  }

  public void removeGrade(Grade grade)
  {
    for (Grade i : grades)
    {
      if (grade.equals(i.getGrade()))
      {
        grades.remove(i);
      }
    }
  }

  public Grade getGrade(int index)
  {
    return grades.get(index);
  }

  public Grade getMaxGrade()
  {
    int maxGrade = -3;
    String maxCourse = "";
    for (int i = 0; i <= grades.size(); i++)
    {
      if (grades.get(i).getGrade() > maxGrade)
      {
        maxGrade = grades.get(i).getGrade();
        maxCourse = grades.get(i).getCourse();
      }
    }
    return new Grade(maxGrade,maxCourse);
  }

  public Grade getMinGrade()
  {
    int minGrade = 12;
    String minCourse = "";
    for (int i = 0; i <= grades.size(); i++)
    {
      if (grades.get(i).getGrade() < minGrade)
      {
        minGrade = grades.get(i).getGrade();
        minCourse = grades.get(i).getCourse();
      }
    }
    return new Grade(minGrade,minCourse);
  }

  public double getAverage()
  {
    double sum = 0.0;
    for (int i = 0; i <= grades.size(); i++)
    {
      sum += grades.get(i).getGrade();
    }
    return sum / grades.size();
  }

  public int getGradeCount(int grade)
  {
    int count = 0;
    for (int i = 0; i <= grades.size(); i++)
    {
      if (grades.get(i).getGrade() == grade)
      {
        count++;
      }
    }
    return count;
  }

  public String getGradeDistribution()
  {
    int count12 = 0;
    int count10 = 0;
    int count7 = 0;
    int count4 = 0;
    int count2 = 0;
    int count0 = 0;
    int countNeg3 = 0;
    for (int i = 0; i <= grades.size(); i++)
    {
      int grade = grades.get(i).getGrade();
      switch (grade)
      {
        case 12:
          count12++;
          break;

        case 10:
          count10++;
          break;

        case 7:
          count7++;
          break;

        case 4:
          count4++;
          break;

        case 2:
          count2++;
          break;

        case 0:
          count0++;
          break;

        case -3:
          countNeg3++;
          break;
      }
    }
    return "Grade 12 count: " + count12 + "\n"
        + "Grade 10 count: " + count10 + "\n"
        + "Grade 7 count: " + count7 + "\n"
        + "Grade 4 count: " + count4 + "\n"
        + "Grade 2 count: " + count2 + "\n"
        + "Grade 0 count: " + count0 + "\n"
        + "Grade -3 count: " + countNeg3 + "\n";
  }

  @Override public String toString()
  {
    return grades.toString();
  }

  @Override public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    GradeList gradeList = (GradeList) o;
    return Objects.equals(grades, gradeList.grades);
  }
}