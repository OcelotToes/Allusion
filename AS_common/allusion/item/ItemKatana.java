package allusion.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ItemKatana extends AllusionItem{

	public ItemKatana(int par1) {
		super(par1);
		setCreativeTab(CreativeTabs.tabTools);
	}

	@Override
	public EnumAction getItemUseAction(ItemStack stack){
		return EnumAction.bow;
	}
	
	@Override
    public ItemStack onItemRightClick(ItemStack stack, World par2World, EntityPlayer player)
    {
		if (player.onGround){
			player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
		}
		System.out.println("Call!");
        return stack;
    }

	@Override
	public void onPlayerStoppedUsing(ItemStack stack, World world, EntityPlayer player, int useCount){
	     int time = this.getMaxItemUseDuration(stack) - useCount;
	     if (player.onGround){   
	     if (time > 5)
	        {
	            player.addExhaustion(0.2F);
	            player.setSprinting(true);

	            float increase = (float) (0.02 * time + 0.2);
	            if (increase > 0.56f)
	                increase = 0.56f;
	            player.motionY += increase;

	            float speed = 0.05F * time; 
	            if (speed > 0.925f)
	                speed = 0.925f;
	            player.motionX = (double) (-MathHelper.sin(player.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * speed);
	            player.motionZ = (double) (MathHelper.cos(player.rotationYaw / 180.0F * (float) Math.PI) * MathHelper.cos(player.rotationPitch / 180.0F * (float) Math.PI) * speed);
	        }
	     }
	}
}
