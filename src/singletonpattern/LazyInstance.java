package singletonpattern;

class LazyInstance {

	private static LazyInstance obj;

	private LazyInstance() {
	}

	public static LazyInstance getLazyInstance() {
		if (obj == null) {
			synchronized (LazyInstance.class) {
				if (obj == null) {
					obj = new LazyInstance();// instance will be created at request time
				}
			}
		}
		return obj;
	}

	public void doSomething() {
		// do something
	}
}
