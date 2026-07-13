package me.waleks.simplematerialgenerators;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class SMGItems {

    private SMGItems() {}

    public static final ItemGroup SMG_ITEM_CATEGORY = new ItemGroup(
        new NamespacedKey(SimpleMaterialGenerators.getInstance(), "simplematerialgenerators"),
        new CustomItemStack(Material.SMOOTH_STONE, "&9Máy tạo vật liệu đơn giản")
    );

    public static final SlimefunItemStack SMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
        "SMG_GENERATOR_MULTIBLOCK",
        Material.BEDROCK,
        "&9Máy tạo vật liệu - Cấu trúc đa khối",
        "",
        "&dTất cả máy tạo vật liệu trong addon này",
        "&dđều chỉ cần đặt như thế này",
        "&aĐặt một cái rương phía trên là được"
    );
	
	/*	Template for adding more generator items
	public static final SlimefunItemStack SMG_GENERATOR_ = new SlimefunItemStack(
		"SMG_GENERATOR_",
		Material.,
		"& generator",
		"&6Tốc độ: &e t",
		"",
		"&9&oMáy tạo vật liệu đơn giản"
	);
	*/

    public static final SlimefunItemStack SMG_GENERATOR_COBBLESTONE = new SlimefunItemStack(
        "SMG_GENERATOR_COBBLESTONE",
        Material.COBBLESTONE,
        "&7Máy tạo đá cuội",
        "&6Tốc độ: &e4 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_STONE_BROKEN",
        Material.STONE,
        "&7Máy tạo đá cuội &8(Đã hỏng)",
        "&8Cần sửa chữa",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_STONE",
        Material.STONE,
        "&7Máy tạo đá",
        "&6Tốc độ: &e8 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE_BROKEN",
        Material.SMOOTH_STONE,
        "&7Máy tạo đá nhẵn &8(Đã hỏng)",
        "&8Cần sửa chữa",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SMOOTH_STONE = new SlimefunItemStack(
        "SMG_GENERATOR_SMOOTH_STONE",
        Material.SMOOTH_STONE,
        "&7Máy tạo đá nhẵn",
        "&6Tốc độ: &e12 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL_BROKEN",
        Material.GRAVEL,
        "&7Máy tạo sỏi &8(Đã hỏng)",
        "&8Cần sửa chữa",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GRAVEL = new SlimefunItemStack(
        "SMG_GENERATOR_GRAVEL",
        Material.ANDESITE,
        "&7Máy tạo sỏi",
        "&6Tốc độ: &e6 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_SAND_BROKEN",
        Material.SAND,
        "&eMáy tạo cát &8(Đã hỏng)",
        "&8Cần sửa chữa",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SAND",
        Material.SANDSTONE,
        "&eMáy tạo cát",
        "&6Tốc độ: &e8 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_GLASS = new SlimefunItemStack(
        "SMG_GENERATOR_GLASS",
        Material.GLASS,
        "&fMáy tạo thủy tinh",
        "&6Tốc độ: &e12 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_NETHERRACK = new SlimefunItemStack(
        "SMG_GENERATOR_NETHERRACK",
        Material.NETHERRACK,
        "&cMáy tạo đá địa ngục",
        "&6Tốc độ: &e6 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_SOUL_SAND = new SlimefunItemStack(
        "SMG_GENERATOR_SOUL_SAND",
        Material.SOUL_SAND,
        "&8Máy tạo cát linh hồn",
        "&6Tốc độ: &e8 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BADLY_FORMED",
        Material.REDSTONE_BLOCK,
        "&cMáy tạo redstone &8(Sai hình dạng)",
        "&8Tôi phải làm lại...",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE_BROKEN",
        Material.REDSTONE_BLOCK,
        "&cMáy tạo redstone &8(Đã hỏng)",
        "&8Cần sửa chữa",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_REDSTONE = new SlimefunItemStack(
        "SMG_GENERATOR_REDSTONE",
        Material.REDSTONE_BLOCK,
        "&cMáy tạo redstone",
        "&6Tốc độ: &e24 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BADLY_FORMED = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BADLY_FORMED",
        Material.OBSIDIAN,
        "&5Máy tạo obsidian &8(Sai hình dạng)",
        "&8Tôi phải làm lại...",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN_BROKEN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN_BROKEN",
        Material.OBSIDIAN,
        "&5Máy tạo obsidian &8(Đã hỏng)",
        "&8Cần sửa chữa",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );

    public static final SlimefunItemStack SMG_GENERATOR_OBSIDIAN = new SlimefunItemStack(
        "SMG_GENERATOR_OBSIDIAN",
        Material.OBSIDIAN,
        "&5Máy tạo obsidian",
        "&6Tốc độ: &e128 t",
        "",
        "&9&oMáy tạo vật liệu đơn giản"
    );
}
