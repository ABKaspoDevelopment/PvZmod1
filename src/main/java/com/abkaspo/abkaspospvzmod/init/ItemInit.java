package com.abkaspo.abkaspospvzmod.init;

import java.util.ArrayList;
import java.util.List;

import com.abkaspo.abkaspospvzmod.objects.items.FoodBase;
import com.abkaspo.abkaspospvzmod.objects.items.ItemBase;

import net.minecraft.item.Item;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	public static final Item SEED_PACK = new ItemBase("seed_pack");
	public static final Item PEASHOOTER_PACK = new ItemBase("peashooter_pack");
	//food&seed
	public static final Item PEA = new FoodBase("pea", 16, 8f, false);
	
}
