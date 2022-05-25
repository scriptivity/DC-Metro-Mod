
package net.mcreator.dcmetromod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dcmetromod.block.LogoBlockBlock;
import net.mcreator.dcmetromod.DcMetroModModElements;

@DcMetroModModElements.ModElement.Tag
public class DCRoofItemGroup extends DcMetroModModElements.ModElement {
	public DCRoofItemGroup(DcMetroModModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdc_roof") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LogoBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
