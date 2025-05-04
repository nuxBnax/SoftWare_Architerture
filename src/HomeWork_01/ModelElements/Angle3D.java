
public class Angle3D {

private double vektorX, vektorY, vektorZ;

  public double getVectorX() {
    return vektorX;
  }

  public void setVectorX(double vektorX) {
    this.vektorX = vektorX;
  }

  public double getVectorY() {
    return vektorY;
  }

  public void setVectorY(double vektorY) {
    this.vektorY = vektorY;
  }

  public double getVectorZ() {
    return vektorZ;
  }

  public void setVectorZ(double vektorZ) {
    this.vektorZ = vektorZ;
  }
  
  public Point3D(double vektorX, double vektorY, double vektorZ) {
    this.vektorX = vektorX;
    this.vektorY = vektorY;
    this.vektorZ = vektorZ;
  }
}
