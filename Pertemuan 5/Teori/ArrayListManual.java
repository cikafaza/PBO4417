import java.util.ArrayList;
import java.util.List;
 
public class ArrayListManual{
	public List<Object> list = new ArrayList<Object>();
    public int currentIndex=-1;
	
	public boolean cekKosong(){
		return list.isEmpty();
	}
	public void tambah(Object object){
        list.add(object);
        currentIndex++;
		System.out.println("Data : "+list);
    }
    public Object kurang(){
        Object object=list.remove(currentIndex);
        currentIndex--;
        return object;
    }
    public int cekJumlah(){
        return list.size();
    }
}
