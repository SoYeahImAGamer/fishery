package com.robinsplaza.fishery.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.BlockParticleOption;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.InsideBlockEffectApplier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.PrimedTnt;
import net.minecraft.world.entity.vehicle.boat.Boat;
import net.minecraft.world.entity.vehicle.minecart.AbstractMinecart;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SeaJellyBlock extends HalfTransparentBlock {
    public static final MapCodec<SeaJellyBlock> CODEC = simpleCodec(SeaJellyBlock::new);
    private static final double field_31101 = 0.13;
    private static final double field_31102 = 0.08;
    private static final double field_31103 = 0.05;
    private static final int TICKS_PER_SECOND = 20;
    protected static final VoxelShape SHAPE = Block.box(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);

    public MapCodec<SeaJellyBlock> codec() {
        return CODEC;
    }
    public SeaJellyBlock(Properties settings) {
        super(settings);
    }

    private static boolean hasHoneyBlockEffects(Entity entity) {
        return entity instanceof LivingEntity || entity instanceof AbstractMinecart || entity instanceof PrimedTnt || entity instanceof Boat;
    }

    protected VoxelShape getCollisionShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    public void onLandedUpon(Level world, BlockState state, BlockPos pos, Entity entity, float fallDistance) {
        entity.playSound(SoundEvents.HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
        if (!world.isClientSide()) {
            world.broadcastEntityEvent(entity, (byte)54);
        }

        if (entity.causeFallDamage(fallDistance, 0.2F, world.damageSources().fall())) {
            entity.playSound(this.soundType.getFallSound(), this.soundType.getVolume() * 0.5F, this.soundType.getPitch() * 0.75F);
        }

    }

    //just doesn't work anymore for whatever reason (even though it's literally the honey code)
    //screw it, it's a feature for now
    protected void onEntityCollision(BlockState state, Level world, BlockPos pos, Entity entity, InsideBlockEffectApplier handler) {
        if (this.isSliding(pos, entity)) {
            this.updateSlidingVelocity(entity);
            this.addCollisionEffects(world, entity);
        }

        super.entityInside(state, world, pos, entity, handler, true);
    }

    private boolean isSliding(BlockPos pos, Entity entity) {
        if (entity.onGround()) {
            return false;
        } else if (entity.getY() > (double)pos.getY() + 0.9375 - 1.0E-7) {
            return false;
        } else if (entity.getDeltaMovement().y >= -0.08) {
            return false;
        } else {
            double d = Math.abs((double)pos.getX() + 0.5 - entity.getX());
            double e = Math.abs((double)pos.getZ() + 0.5 - entity.getZ());
            double f = 0.4375 + (double)(entity.getBbWidth() / 2.0F);
            return d + 1.0E-7 > f || e + 1.0E-7 > f;
        }
    }

    private void updateSlidingVelocity(Entity entity) {
        Vec3 vec3d = entity.getDeltaMovement();
        if (vec3d.y < -0.13) {
            double d = -0.05 / vec3d.y;
            entity.setDeltaMovement(new Vec3(vec3d.x * d, -0.05, vec3d.z * d));
        } else {
            entity.setDeltaMovement(new Vec3(vec3d.x, -0.05, vec3d.z));
        }

        entity.resetFallDistance();
    }

    private void addCollisionEffects(Level world, Entity entity) {
        if (hasHoneyBlockEffects(entity)) {
            if (world.getRandom().nextInt(5) == 0) {
                entity.playSound(SoundEvents.HONEY_BLOCK_SLIDE, 1.0F, 1.0F);
            }

            if (!world.isClientSide() && world.getRandom().nextInt(5) == 0) {
                world.broadcastEntityEvent(entity, (byte)53);
            }
        }

    }

    public static void addRegularParticles(Entity entity) {
        addParticles(entity, 5);
    }

    public static void addRichParticles(Entity entity) {
        addParticles(entity, 10);
    }

    private static void addParticles(Entity entity, int count) {
        if (entity.level().isClientSide()) {
            BlockState blockState = ModBlocks.SEA_JELLY_BLOCK.defaultBlockState();

            for(int i = 0; i < count; ++i) {
                entity.level().addParticle(new BlockParticleOption(ParticleTypes.BLOCK, blockState), entity.getX(), entity.getY(), entity.getZ(), 0.0, 0.0, 0.0);
            }

        }
    }
}
