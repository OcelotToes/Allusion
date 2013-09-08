package allusion.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.Item;
import allsion.lib.Reference;
import allusion.core.AllusionBase;

public class AllusionItem extends Item {

	public AllusionItem(int par1) {
		super(par1);
		this.setCreativeTab(AllusionBase.tab);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg){
		this.itemIcon = reg.registerIcon(Reference.modid + ":" + this.getUnlocalizedName().substring(5));
	}
}
