package me.waleks.simplematerialgenerators.items;

import com.xzavier0722.mc.plugin.slimefun4.storage.controller.SlimefunBlockData;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.ItemSetting;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.settings.IntRangeSetting;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.paperlib.PaperLib;
import me.mrCookieSlime.Slimefun.Objects.handlers.BlockTicker;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class MaterialGenerator extends SlimefunItem {

    private static final String PROGRESS_KEY = "smg-progress";

    private final ItemSetting<Integer> rate;
    private ItemStack item;

    @ParametersAreNonnullByDefault
    public MaterialGenerator(ItemGroup itemGroup, SlimefunItemStack item, RecipeType recipeType, ItemStack[] recipe, int defaultRate) {
        super(itemGroup, item, recipeType, recipe);
        this.rate = new IntRangeSetting(this, "rate", 2, defaultRate, 1000);
        addItemSetting(this.rate);
    }

    @Override
    public void preRegister() {
        addItemHandler(new BlockTicker() {

            @Override
            @ParametersAreNonnullByDefault
            public void tick(Block b, SlimefunItem sf, SlimefunBlockData data) {
                MaterialGenerator.this.tick(b, data);
            }

            @Override
            public boolean isSynchronized() {
                return true;
            }
        });
    }

    public void tick(@Nonnull Block b, @Nonnull SlimefunBlockData data) {
        Block targetBlock = b.getRelative(BlockFace.UP);
        if (targetBlock.getType() == Material.CHEST) {
            BlockState state = PaperLib.getBlockState(targetBlock, false).getState();
            if (state instanceof InventoryHolder) {
                Inventory inv = ((InventoryHolder) state).getInventory();
                if (inv.firstEmpty() != -1) {
                    int progress = parseProgress(data.getData(PROGRESS_KEY));

                    if (progress >= this.rate.getValue()) {
                        progress = 0;
                        inv.addItem(this.item);
                    } else {
                        progress++;
                    }
                    data.setData(PROGRESS_KEY, String.valueOf(progress));
                }
            }
        }
    }

    private int parseProgress(String raw) {
        if (raw == null) {
            return 0;
        }

        try {
            return Integer.parseInt(raw);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

    public final MaterialGenerator setItem(@Nonnull Material material) {
        this.item = new ItemStack(material);
        return this;
    }
}
