package nookerzaza.mods.asiancraft.countries.japanese.init;

import net.minecraft.block.Block;
import nookerzaza.mods.asiancraft.common.util.AsiancraftRegistry;
import nookerzaza.mods.asiancraft.countries.japanese.blocks.BlockJapaneseDirt;
import nookerzaza.mods.asiancraft.countries.japanese.blocks.BlockJapaneseCobbleStone;
import nookerzaza.mods.asiancraft.countries.japanese.blocks.BlockJapaneseCoveredCherryBlossomGrass;
import nookerzaza.mods.asiancraft.countries.japanese.blocks.BlockJapaneseStone;
import nookerzaza.mods.asiancraft.countries.japanese.blocks.ItemBlockJapaneseDirt;

public class JapaneseBlocks 
{
	public static Block covered_jp_cherryblossom;
	public static Block japanese_stone;
	public static Block japanese_cobblestone;
	public static Block japanese_dirt;
	
	public static void init()
	{
		initblocks();
		register();
	}
	
	public static void initblocks()
	{
		japanese_stone = new BlockJapaneseStone("japanese_stone");
		japanese_cobblestone = new BlockJapaneseCobbleStone("japanese_cobblestone");
		covered_jp_cherryblossom = new BlockJapaneseCoveredCherryBlossomGrass("covered_cherryblossom_grass");
		japanese_dirt = new BlockJapaneseDirt("japanese_dirt");
	}
	
	public static void register()
	{
		AsiancraftRegistry.registerblocks(japanese_stone);
		AsiancraftRegistry.registerblocks(japanese_cobblestone);
		AsiancraftRegistry.registerblocks(covered_jp_cherryblossom);
		AsiancraftRegistry.registerblocks(japanese_dirt,new ItemBlockJapaneseDirt(japanese_dirt));
	}
	
	public static void registerrenderer()
	{
		AsiancraftRegistry.registerRender(japanese_stone);
		AsiancraftRegistry.registerRender(japanese_cobblestone);
		AsiancraftRegistry.registerRender(covered_jp_cherryblossom);
		AsiancraftRegistry.registerRenderAsMetadata(japanese_dirt, 0);
		AsiancraftRegistry.registerRenderAsMetadata(japanese_dirt, 1);
	}
}
