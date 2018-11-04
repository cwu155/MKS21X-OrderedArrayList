import java.util.ArrayList;
import java.util.List;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  public boolean add(T element){
    int holder = 0;
      for (int i = 0; i < this.size(); i++){
        if (element.compareTo(get(i)) >= 0){
        holder = i+1;
        }
      }
    super.add(holder, element);
    return true;
  }

  public void add (int index, T element){
    add(element);
  }

  public T set(int index, T element){
    remove(index);
    add(index, element);
    return element;
  }

}
