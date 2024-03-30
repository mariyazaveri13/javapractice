package generics;
///genneric class
class MyClass<T>{
	private T data;
	
	public void setData(T obj) {
		data=obj;
	}
	
	public T getData() {
		return data;
	}
	
}

class MyArray<T>{
	@SuppressWarnings("unchecked")
	private T arr[] =(T[]) new Object[10];
	int count = 0;
	
	public void append(T v) {
		arr[count++]=v;
	}
	
	public void display() {
		for(int i =0;i<count;i++) {
			System.out.println(arr[i]);
		}
	}
	
}

public class GenericsDemo01 {

	//generic method
	static <E> void displayElements(E... es) {
		for(E x:es) {
			System.out.print(x+" ");
		}
	}
	
	//generic arg
	static void fun(MyArray<? extends Number> obj) {
		obj.display();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyClass<String> strGeneric = new MyClass<>();
		strGeneric.setData("Mariyaa");
		System.out.println(strGeneric.getData());
		
		MyClass<Integer> intGeneric = new MyClass<>();
		intGeneric.setData(29);
		System.out.println(intGeneric.getData());
		System.out.println();

		MyArray<String> strArrGen  = new MyArray<>();
		strArrGen.append("Hii");
		strArrGen.append("Helo");
		strArrGen.append("Tata");
		strArrGen.append("Bye");
		
		strArrGen.display();
		System.out.println();
		MyArray<Integer> intArrGen = new MyArray<>();
		intArrGen.append(10);
		intArrGen.append(300);
		intArrGen.append(8);
		intArrGen.append(29);
		intArrGen.display();
		
		MyArray m = new MyArray();
		m.append(90);
		m.append("hiii");
		
		System.out.println();
		m.display();
		
		//generic methods
		System.out.println();
		displayElements("hiii","heeellloo","hjjjhjhjhjh");
		System.out.println();
		displayElements(55,55414,55);

		System.out.println();
		fun(m);
	}

}
