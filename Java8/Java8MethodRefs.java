package java8;

/*https://www.studytonight.com/java-8/java-8-method-reference*/
interface JavaInterface{
	void showInterfaceInfo();
}

public class Java8MethodRefs {
	static void show() {
		System.out.println("This is called using method reference");
	}
	public static void main(String[] args) {
		// Referring Method
		JavaInterface ji = Java8MethodRefs::show;
		ji.showInterfaceInfo();
	}
}