package model;

public class GradeListModelManager implements GradeListModel
{
  private GradeList grades;

  public GradeListModelManager()
  {
    grades = new GradeList();
  }

  @Override public void addGrade(Grade grade)
  {
    grades.addGrade(grade);
  }

  @Override public void removeGrade(int index)
  {
    grades.removeGrade(index);
  }

  @Override public void removeGrade(Grade grade)
  {
    grades.removeGrade(grade);
  }

  @Override public int gradeListSize()
  {
    return grades.size();
  }

  @Override public Grade getGrade(int index)
  {
    return grades.getGrade(index);
  }

  @Override public Grade getMaxGrade()
  {
    return grades.getMaxGrade();
  }

  @Override public Grade getMinGrade()
  {
    return grades.getMinGrade();
  }

  @Override public double getAverageGrade()
  {
    return grades.getAverage();
  }

  @Override public boolean isLegalGrade(int grade)
  {
    return isLegalGrade(grade);
  }

  @Override public String validateLogin(String user, String password)
  {
    return "";
  }

  @Override public boolean isLoggedIn()
  {
    return false;
  }

  @Override public boolean login(String user, String password)
  {
    return false;
  }
}
