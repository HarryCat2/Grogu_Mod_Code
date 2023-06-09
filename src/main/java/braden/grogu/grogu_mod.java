package braden.grogu;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class grogu_mod implements ModInitializer {

    //logger
    public static final Logger LOGGER = LoggerFactory.getLogger("Grogu_Mod");

    //blue cookie item, probably a temporary bit of code
    public static final Item BLUE_COOKIE = new Item(new FabricItemSettings().maxCount(16).food(new FoodComponent.Builder()
            .snack()
            .alwaysEdible()
            .build()));

    //creative item icon
    public static final Item MUDHORN_ICON = new Item(new FabricItemSettings());

    //mudhorn rondal
    public static final Item MUDHORN_CHESTPLATE = new Item(new FabricItemSettings());

    //creative tab
    private static final ItemGroup GROGU_ITEM_GROUP = FabricItemGroup.builder(new Identifier("grogu_mod", "test_group"))
            .displayName(Text.of("Grogu PSWG Addon"))
            .icon(() -> new ItemStack(MUDHORN_ICON))
            .build();

    @Override
    public void onInitialize() {

        //logger
        LOGGER.info("Grogu Mod has started up and initialized!");

        //Blue Cookie Item register
        Registry.register(Registries.ITEM, new Identifier("grogu_mod", "blue_cookie"), BLUE_COOKIE);

        //Blue Cookie Item register
        Registry.register(Registries.ITEM, new Identifier("grogu_mod", "mudhorn_chestplate"), MUDHORN_CHESTPLATE);

        //Mudhorn Icon register for creative inventory
        Registry.register(Registries.ITEM, new Identifier("grogu_mod", "mudhorn"), MUDHORN_ICON);

        //Creative tab contents
        ItemGroupEvents.modifyEntriesEvent(GROGU_ITEM_GROUP).register(content -> {
            content.add(BLUE_COOKIE);
            content.add(MUDHORN_CHESTPLATE);
        });

    }

}

