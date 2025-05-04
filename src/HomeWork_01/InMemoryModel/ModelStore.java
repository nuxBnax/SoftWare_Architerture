
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {

  private List<IModelChangeObserver> observers = new ArrayList<>();
  private List<PoligonalModel> models = new ArrayList<>();
  private List<Scene> scenes = new ArrayList<>();
  private List<Flash> flashes = new ArrayList<>();
  private List<Camera> cameras = new ArrayList<>();

  public Scene getScene(int n_scene) {

    return Scenes.get(n_scene);
  }

  public void add(PoligonalModel model) {
    models.add(model);
    NotifyChange();
  }

  @Override
  public void NotifyChange() {
    for (IModelChangeObserver observer : observers) {
      observer.ApplyUpdateModel();
    }

  }

  @Override
  void RegisterModelChanger(IModelChangeObserver o) {
    observers.add(o);
  }

  @Override
  void RemoveModelChanger(IModelChangeObserver o) {
    observers.remove(o);
  }
}
