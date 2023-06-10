package com.abkaspo.abkaspospvzmod.objects.blocks;

import com.abkaspo.abkaspospvzmod.PvzmodMain;
import com.abkaspo.abkaspospvzmod.init.BlockInit;
import com.abkaspo.abkaspospvzmod.init.ItemInit;
import com.abkaspo.abkaspospvzmod.util.iHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements iHasModel{

	public BlockBase(String name, float hardness, String tool, int _tool, float resistance, Material material, int lighting) {

		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setLightOpacity(lighting);
		setHardness(hardness);
		setHarvestLevel(tool ,_tool);
		setResistance(resistance);
		setCreativeTab(PvzmodMain.ABKASPOSPVZBLOCKS);

		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
		
	}
	@Override
	public void registerModels() {
		PvzmodMain.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}
}
