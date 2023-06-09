package braden.grogu.entities;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEntities implements ModInitializer {

    public static final EntityType<GroguEntity> GROGU = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("modentities", "grogu"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, GroguEntity::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f))
                    .build()
    );



    @Override
    public void onInitialize() {
        FabricDefaultAttributeRegistry.register(GROGU, GroguEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 16.0)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0)
        );
    }
}
