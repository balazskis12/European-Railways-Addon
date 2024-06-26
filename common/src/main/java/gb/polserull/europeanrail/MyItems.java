package gb.polserull.europeanrail;

import mtr.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;

import static gb.polserull.europeanrail.Main.MOD_ID;

public interface MyItems {

    // Creative Tabs
    CreativeModeTabs.Wrapper UK_RAILWAYS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "uk_railways_menu"), () -> new ItemStack(MyBlocks.ADVANCED_CROSSING_SIGN.get()));
    CreativeModeTabs.Wrapper DUTCH_RAILWAYS = new CreativeModeTabs.Wrapper(new ResourceLocation(MOD_ID, "dutch_railways_menu"), () -> new ItemStack(MyBlocks.SHUTDOWN_BOARD.get()));
}

