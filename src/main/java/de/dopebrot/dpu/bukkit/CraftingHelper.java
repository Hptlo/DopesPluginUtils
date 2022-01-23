package de.dopebrot.dpu.bukkit;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.material.MaterialData;

public class CraftingHelper {

    ItemStack outPut;

    private final Character[] chars;

    private final ShapedRecipe recipe = new ShapedRecipe(outPut);

    public CraftingHelper(ItemStack outPut) {
        this.outPut = outPut;
        chars = new Character[9];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = 'c';
        chars[3] = 'd';
        chars[4] = 'e';
        chars[5] = 'f';
        chars[6] = 'g';
        chars[7] = 'h';
        chars[8] = 'i';
    }

    public void set(ItemStack stack1) {
        recipe.setIngredient(chars[0], stack1.getData());
        Bukkit.addRecipe(recipe);
    }

    public void set(ItemStack stack1, ItemStack stack2) {
        recipe.setIngredient(chars[0], stack1.getData());
        recipe.setIngredient(chars[1], stack2.getData());
        Bukkit.addRecipe(recipe);
    }

    public void set(ItemStack stack1, ItemStack stack2, ItemStack stack3) {
        recipe.setIngredient(chars[0], stack1.getData());
        recipe.setIngredient(chars[1], stack2.getData());
        recipe.setIngredient(chars[1], stack3.getData());
        Bukkit.addRecipe(recipe);
    }


}
