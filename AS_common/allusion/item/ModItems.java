package allusion.item;

import allsion.lib.Ids;
import net.minecraft.item.Item;

public class ModItems {

	public static Item katana;
	public static void init(){
		
		katana = new ItemKatana(Ids.item_katana).setUnlocalizedName("katana");
	}
}
