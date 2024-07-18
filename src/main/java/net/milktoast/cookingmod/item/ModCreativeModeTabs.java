package net.milktoast.cookingmod.item;

import net.milktoast.cookingmod.MilkAndBread;
import net.milktoast.cookingmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MilkAndBread.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COOKING_TAB = CREATIVE_MODE_TABS.register("cooking_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SOYBEAN.get()))
                    .title(Component.translatable("creativetab.cooking_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.SOYBEAN_SEEDS.get());
                        output.accept(ModItems.SOYBEAN.get());
                        output.accept(ModItems.SALT.get());

                        output.accept(ModBlocks.HALITE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
