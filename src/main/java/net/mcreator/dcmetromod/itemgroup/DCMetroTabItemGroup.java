
package net.mcreator.dcmetromod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.dcmetromod.block.LogoBlockBlock;
import net.mcreator.dcmetromod.DcMetroModModElements;

@DcMetroModModElements.ModElement.Tag
public class DCMetroTabItemGroup extends DcMetroModModElements.ModElement {
	public DCMetroTabItemGroup(DcMetroModModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabdc_metro_tab") {
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
