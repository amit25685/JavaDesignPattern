package singletonpattern;

class EarlyInstance {

	private static EarlyInstance obj= new EarlyInstance();//Early, instance will be created at load time  
	private EarlyInstance() {}
	
	public static EarlyInstance getEarlyInstance() {
		return obj;
	}
	
	public void doSomething() {
		//write your code
	}
}
