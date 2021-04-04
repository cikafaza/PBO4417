import java.util.ArrayList;
import java.util.List;

public class Stack extends ArrayListManual{
    public Object peek(){
        return list.get(currentIndex);
    }
    public void clear(){
        list.clear();
        currentIndex=-1;
    } 
}
