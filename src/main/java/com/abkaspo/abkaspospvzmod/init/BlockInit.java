package com.abkaspo.abkaspospvzmod.init;

import java.util.List;

import com.abkaspo.abkaspospvzmod.objects.blocks.BlockBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;

public class BlockInit {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static Block ASPHALT = new BlockBase("asphalt",5f ,"pickaxe",8,6f, Material.ROCK, 0);
	public static Block GRAFFITIED_ASPHALT = new BlockBase("graffitied_asphalt",5f,"pickaxe",8,6f, Material.ROCK, 0);
	public static Block ROTATED_GRAFFITIED_ASPHALT = new BlockBase("rotated_graffitied_asphalt",5f,"pickaxe",8,6f, Material.ROCK, 0);
	public static Block SIDEWALK = new BlockBase("sidewalk",5f,"pickaxe", 8,6f,  Material.ROCK, 0);
	//crops
}
