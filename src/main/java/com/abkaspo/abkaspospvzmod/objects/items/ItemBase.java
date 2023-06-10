package com.abkaspo.abkaspospvzmod.objects.items;

import com.abkaspo.abkaspospvzmod.PvzmodMain;
import com.abkaspo.abkaspospvzmod.init.ItemInit;
import com.abkaspo.abkaspospvzmod.util.iHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements iHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(PvzmodMain.ABKASPOSPVZITEMS);
		
		ItemInit.ITEMS.add(this);
	}

	@Override
	public void registerModels() {
		PvzmodMain.proxy.registerItemRenderer(this, 0, "inventory");
	}

}
