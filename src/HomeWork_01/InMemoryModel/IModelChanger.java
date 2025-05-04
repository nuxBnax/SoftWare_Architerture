
public interface IModelChanger {
  void NotifyChange();

  void RegisterModelChanger(IModelChangeObserver o);
  
  void RemoveModelChanger(IModelChangeObserver o);
}
