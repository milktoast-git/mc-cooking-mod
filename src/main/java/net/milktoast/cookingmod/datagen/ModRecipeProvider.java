package net.milktoast.cookingmod.datagen;

import net.milktoast.cookingmod.block.ModBlocks;
import net.milktoast.cookingmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.io.Writer;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.HALITE_BLOCK.get())
                .pattern("##")
                .pattern("##")
                .define('#', ModItems.SALT.get())
                .unlockedBy(getHasName(ModItems.SALT.get()), has(ModItems.SALT.get()))
                .save(consumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.SALT.get(), 4)
                .requires(ModBlocks.HALITE_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.HALITE_BLOCK.get()), has(ModBlocks.HALITE_BLOCK.get()))
                .save(consumer);
    }
}
