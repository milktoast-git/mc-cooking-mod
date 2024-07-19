package net.milktoast.cookingmod.item;

import net.milktoast.cookingmod.MilkAndBread;
import net.milktoast.cookingmod.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MilkAndBread.MOD_ID);

    public static final RegistryObject<Item> SOYBEAN = ITEMS.register("soybean",
            () -> new Item(new Item.Properties().food(ModFoods.SOYBEAN)));

    public static final RegistryObject<Item> SOYBEAN_SEEDS = ITEMS.register("soybean_seeds",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> SALT = ITEMS.register("salt",
            () -> new ItemNameBlockItem(ModBlocks.SOYBEAN_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
