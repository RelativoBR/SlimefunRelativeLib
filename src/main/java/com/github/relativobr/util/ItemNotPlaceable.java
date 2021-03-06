package com.github.relativobr.util;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.core.attributes.NotPlaceable;
import org.bukkit.event.Cancellable;
import org.bukkit.inventory.ItemStack;

public final class ItemNotPlaceable extends SlimefunItem implements NotPlaceable, Cancellable {

  public ItemNotPlaceable(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType,
      ItemStack[] recipe) {
    super(itemGroup, item, recipeType, recipe);
  }

  @Override
  public boolean isCancelled() {
    return true;
  }

  @Override
  public void setCancelled(boolean b) {
  }
}