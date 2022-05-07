package meca.KeyEvent;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;

public class ClientProxy extends CommonProxy{

	public static KeyBinding keyBindings1 = new KeyBinding("key.jump.desc", Keyboard.KEY_SPACE, "key.mecamod.category");//

	@Override
	public void registerClientInfo() {
			ClientRegistry.registerKeyBinding(keyBindings1);
	}

}
