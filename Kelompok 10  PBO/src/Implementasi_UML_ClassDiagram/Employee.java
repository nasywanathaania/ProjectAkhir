package Implementasi_UML_ClassDiagram;

abstract class Employee {
  private String name;
  private String afm;
  
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setAfm(String afm) {
    this.afm = afm;
  }
  public String getAfm() {
    return afm;
  }
  abstract int payment();
}
