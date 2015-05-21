package com.sil3nt.platformer.core.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.sil3nt.platformer.core.Main;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Platform";
        config.width = 1280;
        config.height = 720;

		new LwjglApplication(new Main(), config);
	}
}
