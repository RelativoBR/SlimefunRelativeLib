package com.github.relativobr.recipe;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

/**
 * Deprecated, use only AbstractItemRecipe
 */
@Deprecated
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class SimpleMaterialRecipe {


    private Material material;
    private Material mainItem;


    public ItemStack[] getInput(){
        return new ItemStack[]{
                new ItemStack(this.material)
        };
    }


    public ItemStack[] getOutput(){
        return new ItemStack[]{
                new ItemStack(this.mainItem)
        };
    }


}