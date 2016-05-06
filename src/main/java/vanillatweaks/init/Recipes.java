package vanillatweaks.init;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes {
	private static boolean initDone = false;
	public static void init(){
		if(initDone)return;

		initDone = true;
	}
}
