import java.util.ArrayList;
import java.util.List;

class Hak{
	int bun;
	String name;
	int jum;
	public Hak(){}
	public Hak(int bun, String name, int jum) {
		this.bun=bun;
		this.name=name;
		this.jum=jum;
	}
}
public class Exam02 {
//	static Hak[] h = new Hak[100];
	//List<Hak> hakList= new ArrayList<Hak>();
	public static void main(String[] args) {
	List<Hak>haklist =new ArrayList<Hak>();
	haklist.add(new Hak(1,"aaa",90));
	haklist.add(new Hak(5,"bbb",95));
	haklist.add(new Hak(2,"ddd",43));
	haklist.add(new Hak(3,"sss",12));
	haklist.add(new Hak(9,"qqq",93));
	haklist.add(new Hak(7,"aee",64));
	for(int x=0;x<haklist.size();x++) {
		System.out.println(haklist.get(x).bun+"\t"+haklist.get(x).name+"\t"+haklist.get(x).jum);
		//Hak hak = haklist.get(x);
		//System.out.println(hak.bun+"\t"+hak.name+"\t"+hak.jum);
	}
	//리스트 솔트하는법
	Hak h1= haklist.get(1);
	Hak h2= haklist.get(2);
	haklist.set(0, h2);
	haklist.set(1, h1);   
	for(int x=0;x<haklist.size();x++) {
		System.out.println(haklist.get(x).bun+"\t"+haklist.get(x).name+"\t"+haklist.get(x).jum);
		//Hak hak = haklist.get(x);
		//System.out.println(hak.bun+"\t"+hak.name+"\t"+hak.jum);
	}
	}

}
