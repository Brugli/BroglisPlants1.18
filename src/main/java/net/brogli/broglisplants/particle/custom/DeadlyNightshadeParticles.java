package net.brogli.broglisplants.particle.custom;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.*;
import net.minecraft.core.particles.SimpleParticleType;

public class DeadlyNightshadeParticles extends RisingParticle {
    private final SpriteSet sprites;
    protected boolean isGlowing;

    DeadlyNightshadeParticles(ClientLevel level, double a, double b, double c, double d, double e, double f, SpriteSet set) {
        super(level, a, b, c, d, e, f);
        this.sprites = set;
        this.scale(1.5F);
        this.setSpriteFromAge(set);
    }

    public int getLightColor(float p_234080_) {
        return this.isGlowing ? 240 : super.getLightColor(p_234080_);
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_TRANSLUCENT;
    }

    public void tick() {
        super.tick();
        this.setSpriteFromAge(this.sprites);
    }

    public static class EmissiveProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public EmissiveProvider(SpriteSet set) {
            this.sprite = set;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel level, double a, double b, double c, double d, double e, double f) {
            DeadlyNightshadeParticles deadlyNightshadeParticles = new DeadlyNightshadeParticles(level, a, b, c, d, e, f, this.sprite);
            deadlyNightshadeParticles.setAlpha(1.0F);
            deadlyNightshadeParticles.isGlowing = true;
            return deadlyNightshadeParticles;
        }
    }

    public static class Provider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet sprite;

        public Provider(SpriteSet p_107739_) {
            this.sprite = p_107739_;
        }

        public Particle createParticle(SimpleParticleType particleType, ClientLevel level, double a, double b, double c, double d, double e, double f) {
            DeadlyNightshadeParticles deadlyNightshadeParticles = new DeadlyNightshadeParticles(level, a, b, c, d, e, f, this.sprite);
            deadlyNightshadeParticles.setAlpha(1.0F);
            return deadlyNightshadeParticles;
        }
    }
}
