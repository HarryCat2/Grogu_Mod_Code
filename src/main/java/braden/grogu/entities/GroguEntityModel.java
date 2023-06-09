package braden.grogu.entities;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;

public class GroguEntityModel extends EntityModel<Entity> {
    private final ModelPart legs;
    private final ModelPart torso;
    private final ModelPart neck;
    private final ModelPart head;
    private final ModelPart left_ear;
    private final ModelPart cube_r1;
    private final ModelPart right_ear;
    private final ModelPart cube_r2;
    private final ModelPart left_arm;
    private final ModelPart cube_r3;
    private final ModelPart left_hand;
    private final ModelPart cube_r4;
    private final ModelPart right_arm;
    private final ModelPart cube_r5;
    private final ModelPart right_hand;
    private final ModelPart cube_r6;
    public GroguEntityModel(ModelPart root, ModelPart torso, ModelPart neck, ModelPart head, ModelPart left_ear, ModelPart cube_r1, ModelPart right_ear, ModelPart cube_r2, ModelPart left_arm, ModelPart cube_r3, ModelPart left_hand, ModelPart cube_r4, ModelPart right_arm, ModelPart cube_r5, ModelPart right_hand, ModelPart cube_r6) {
        this.legs = root.getChild("legs");
        this.torso = torso;
        this.neck = neck;
        this.head = head;
        this.left_ear = left_ear;
        this.cube_r1 = cube_r1;
        this.right_ear = right_ear;
        this.cube_r2 = cube_r2;
        this.left_arm = left_arm;
        this.cube_r3 = cube_r3;
        this.left_hand = left_hand;
        this.cube_r4 = cube_r4;
        this.right_arm = right_arm;
        this.cube_r5 = cube_r5;
        this.right_hand = right_hand;
        this.cube_r6 = cube_r6;
    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData legs = modelPartData.addChild("legs", ModelPartBuilder.create().uv(0, 0).cuboid(-2.75F, -2.75F, -2.15F, 5.0F, 3.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(3.25F, 23.75F, 1.25F));

        ModelPartData torso = legs.addChild("torso", ModelPartBuilder.create().uv(0, 13).cuboid(-2.25F, -2.5F, -1.6F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.25F, 0.0F));

        ModelPartData neck = torso.addChild("neck", ModelPartBuilder.create().uv(0, 7).cuboid(-2.75F, 0.0F, -2.15F, 5.0F, 2.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -3.5F, 0.0F));

        ModelPartData head = neck.addChild("head", ModelPartBuilder.create().uv(14, 13).cuboid(-2.25F, -1.5F, -1.65F, 4.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -1.0F, 0.0F));

        ModelPartData left_ear = head.addChild("left_ear", ModelPartBuilder.create(), ModelTransform.pivot(1.75F, -1.5F, 0.0F));

        ModelPartData cube_r1 = left_ear.addChild("cube_r1", ModelPartBuilder.create().uv(18, 4).cuboid(0.0F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 14).cuboid(0.0F, 1.5F, 0.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, -0.2F, 0.0F, 0.0F, 0.2182F));

        ModelPartData right_ear = head.addChild("right_ear", ModelPartBuilder.create(), ModelTransform.pivot(-2.25F, -1.5F, 0.0F));

        ModelPartData cube_r2 = right_ear.addChild("cube_r2", ModelPartBuilder.create().uv(18, 5).cuboid(-4.0F, 0.5F, 0.0F, 4.0F, 1.0F, 0.0F, new Dilation(0.0F))
                .uv(11, 13).cuboid(-3.0F, 1.5F, 0.0F, 3.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, -0.2F, 0.0F, 0.0F, -0.2182F));

        ModelPartData left_arm = torso.addChild("left_arm", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, -2.75F, 0.0F));

        ModelPartData cube_r3 = left_arm.addChild("cube_r3", ModelPartBuilder.create().uv(14, 7).cuboid(0.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.7854F));

        ModelPartData left_hand = left_arm.addChild("left_hand", ModelPartBuilder.create(), ModelTransform.pivot(0.984F, 2.0161F, -0.0107F));

        ModelPartData cube_r4 = left_hand.addChild("cube_r4", ModelPartBuilder.create().uv(0, 2).cuboid(0.0303F, -0.5303F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0337F, 0.0446F, -0.4893F, 0.0F, 0.0F, 0.7854F));

        ModelPartData right_arm = torso.addChild("right_arm", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, -2.75F, 0.0F));

        ModelPartData cube_r5 = right_arm.addChild("cube_r5", ModelPartBuilder.create().uv(14, 0).cuboid(-2.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 1.0F, 0.0F, 0.0F, 0.0F, -0.7854F));

        ModelPartData right_hand = right_arm.addChild("right_hand", ModelPartBuilder.create(), ModelTransform.pivot(-1.0358F, 2.0373F, -0.0255F));

        ModelPartData cube_r6 = right_hand.addChild("cube_r6", ModelPartBuilder.create().uv(0, 0).cuboid(-1.0303F, -0.5303F, 0.0F, 1.0F, 1.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(0.0181F, 0.0234F, -0.4745F, 0.0F, 0.0F, -0.7854F));
        return TexturedModelData.of(modelData, 32, 32);
    }
    @Override
    public void setAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
        legs.render(matrices, vertexConsumer, light, overlay, red, green, blue, alpha);
    }
}
