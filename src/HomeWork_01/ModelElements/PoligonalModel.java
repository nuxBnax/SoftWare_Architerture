
import java.util.ArrayList;

public class PoligonalModel {

  private List<Poligon> poligons;
  private List<Texture> textures;

  public List<Poligon> getPoligons() {
  	return poligons;
  }
  
  public List<Texture> getTexture() {
  	return textures;
  }
  
  public PoligonalModel(List<Poligon> poligons) {
  	this.poligons = poligons;
  }

  public PoligonalModel(List<Poligon> poligons, List<Texture> textures) {
  	this.poligons = poligons;
  	this.textures = textures;
  }
}
