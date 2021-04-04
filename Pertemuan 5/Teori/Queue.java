import java.util.ArrayList;
import java.util.List;

public class Queue extends ArrayListManual{
	private int head;
	
	public Object kurang(){
        Object object=list.remove(head);
        head--;
        return object;
    }
	public Object peek(){
        return list.get(head);
    }
}
