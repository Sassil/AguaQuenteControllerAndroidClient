package org.aquacontroller.aguaquentecontroller.application;

public class Application extends android.app.Application {
    private static Application instance;
    @Override
    public void onCreate() {
	super.onCreate();
	instance = this;
    }

    public static Application getInstance() {
	return instance;
    }
}
