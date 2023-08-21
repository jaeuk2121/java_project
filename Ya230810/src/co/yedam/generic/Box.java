package co.yedam.generic;

// T: type parameter
//<T> 제네릭. 해당되는 시점에

public class Box<T>//generic {
	T obj;
	
	T get() {
		return obj;
	}
	
	void set(T obj) {
		this.obj = obj;
	}
}
