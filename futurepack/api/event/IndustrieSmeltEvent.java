package futurepack.api.event;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class IndustrieSmeltEvent extends PlayerEvent
{
	public ItemStack smelt;
	public IndustrieSmeltEvent(EntityPlayer player, ItemStack it)
	{
		super(player);
		smelt = it;
	}

}