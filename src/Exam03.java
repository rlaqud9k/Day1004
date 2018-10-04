import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Student {
	private int bun;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot = kor+eng+mat;
	public Student() {}
	public Student(int bun, String name, int kor, int eng, int mat) {
		this.bun=bun;
		this.name=name;
		this.kor = kor;
		this.eng=eng;
		this.mat=mat;
		tot=kor+eng+mat;
	}
	public String toString() {
		return bun+"\t"+name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+tot;
	}
	public void dataSort(List list) {
		for(int x=0;x<list.size()-1;x++) {
			for(int y=x+1;y<list.size();y++) {
				Student st1= (Student)list.get(x);
				Student st2= (Student)list.get(y);
				//����Ʈ�� �ڵ����� �и��⶧���� �ӽð��� �ʿ����
				if(st1.tot>st2.tot) {
					list.set(y, st1);
					list.set(x, st2);  
				}
			}
		}
		
	}
}

	public class Exam03{
		public static void main(String[]ar) {
			//Ű����� ��ȣ====���� �Է�
			//��ȣ�� 0�̸� ����
			//1)�Է��ڷ� ���
			//2)������ �������� ���� �� ���
			
			Scanner scn = new Scanner(System.in);
			List <Student>list = new ArrayList<Student>();
//			while(true) {
//			System.out.println("�Է�");	
//			int bun = scn.nextInt();
//			if(bun==0) {
//				break;
//			}
//			String name = scn.next();
//			int kor = scn.nextInt();
//			int eng = scn.nextInt();
//			int mat = scn.nextInt();
//			list.add(new Student(bun,name,kor,eng,mat));
//			}
//			
//			for(int x=0;x<list.size();x++) {
//				System.out.println(list.get(x));
//			}
			do {
				System.out.print("�Է�");
				String[]str=scn.nextLine().split(",");
				int bun = Integer.parseInt(str[0]);
				if(bun==0) {
					break;
				}
				String name = str[1];
				int kor=Integer.parseInt(str[2]);
				int eng=Integer.parseInt(str[3]);
				int mat=Integer.parseInt(str[4]);
				list.add(new Student(bun,name,kor,eng,mat));
			}while(true);
				Student stu = new Student();
				stu.dataSort(list);
				for(int x=0;x<list.size();x++) {
					Student st=(Student)list.get(x);
					System.out.println(st);
				}
			//�Է��ڷ� ���
			//��Ʈ�޼ҵ�
			//�Է��ڷ� ���
	
		}

	}