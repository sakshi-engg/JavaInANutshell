package Java8_Features;

public class MethodReference {
    public static void main(String[] args) {
        ABC a = new ABC();
    
    // I i = a :: i.m1();
	// i.m1();
    // I i1 = A :: m3;
    }
}

class ABC {
	void m2(){
	System.out.print("Inside m2");
	}

	static void m3(){
	System.out.print("Inside m3");
	}
}

class demo implements I{
    public void m1(){
        System.out.println("m1");
    }
}

 interface I{
 void m1();
}


