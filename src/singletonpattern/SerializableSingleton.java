package singletonpattern;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {
	private static SerializableSingleton obj = new SerializableSingleton();// Early, instance will be created at load
																			// time

	private SerializableSingleton() {
	}

	public static SerializableSingleton getSerializableSingleton() {
		return obj;
	}

	protected Object readResolve() {
		return getSerializableSingleton();
	}
}
