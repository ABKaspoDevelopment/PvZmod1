package com.abkaspo.abkaspospvzmod.objects.items;

import com.abkaspo.abkaspospvzmod.PvzmodMain;
import com.abkaspo.abkaspospvzmod.init.ItemInit;
import com.abkaspo.abkaspospvzmod.util.iHasModel;

import net.minecraft.item.ItemFood;

public class FoodBase extends ItemFood implements iHasModel {
	public FoodBase(String name, int amount,float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setAlwaysEdible();
		setCreativeTab(PvzmodMain.ABKASPOFOODSEED);
		
		ItemInit.ITEMS.add(this);
	}
	@Override
    public void registerModels() {
		PvzmodMain.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
