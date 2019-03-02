package com.fluffydoggomods.scplockdownextras.util.handlers;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.Locale;

import javax.annotation.ParametersAreNonnullByDefault;

import com.fluffydoggomods.scplockdownextras.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.ForgeRegistry;
import net.minecraftforge.registries.ObjectHolderRegistry;

@ObjectHolder(Reference.MOD_ID)
@ParametersAreNonnullByDefault
@SuppressWarnings("null")

public class SoundsHandler 
{
  @Retention(RetentionPolicy.RUNTIME)
  @Target(ElementType.FIELD)
  private static @interface SoundName {
    String value();
  }
  @SoundName("block.metal.fall")
  public static final SoundEvent BLOCK_METALFLOORA_FALL = null;
	
  @SoundName("block.metal.break")
  public static final SoundEvent BLOCK_METALFLOORA_BREAK = null;
	
  @SoundName("block.metal.place")
  public static final SoundEvent BLOCK_METALFLOORA_PLACE = null;
	
  @SoundName("block.metal.step")
  public static final SoundEvent BLOCK_METALFLOORA_HIT = null;
	
  @SoundName("block.metal.step")
  public static final SoundEvent BLOCK_METALFLOORA_STEP = null;
	
	
  @SoundName("block.normal.fall")
  public static final SoundEvent BLOCK_CONCRETEFLOOR_FALL = null;
	
  @SoundName("block.normal.break")
  public static final SoundEvent BLOCK_CONCRETEFLOOR_BREAK = null;
	
  @SoundName("block.normal.place")
  public static final SoundEvent BLOCK_CONCRETEFLOOR_PLACE = null;
	
  @SoundName("block.normal.step")
  public static final SoundEvent BLOCK_CONCRETEFLOOR_HIT = null;
	
  @SoundName("block.normal.step")
  public static final SoundEvent BLOCK_CONCRETEFLOOR_STEP = null;
	
  @SoundName("block.puddle106.step")
  public static final SoundEvent BLOCK_PUDDLE106_STEP = null;
	
  @SoundName("block.puddle106.break")
  public static final SoundEvent BLOCK_PUDDLE106_BREAK = null;
	
	
  //doors
  @SoundName("block.door.normal.open")
  public static final SoundEvent BLOCK_DOORNORMAL_OPEN = null;
	
  @SoundName("block.door.heavy.open")
  public static final SoundEvent BLOCK_DOORHEAVY_OPEN = null;
	
  @SoundName("block.door.normal.close")
  public static final SoundEvent BLOCK_DOORNORMAL_CLOSE = null;
	
  @SoundName("block.door.heavy.close")
  public static final SoundEvent BLOCK_DOORHEAVY_CLOSE = null;
	
  //entities
  
	
  static {
    for (Field f : SoundsHandler.class.getDeclaredFields()) {
      if (f.isAnnotationPresent(SoundName.class)) {
        ForgeRegistries.SOUND_EVENTS.register(new SoundEvent(new ResourceLocation(Reference.MOD_ID, f.getAnnotation(SoundName.class).value())).setRegistryName(f.getName().toLowerCase(Locale.ROOT)));
      }
    }
        
    ObjectHolderRegistry.INSTANCE.applyObjectHolders();
  }
}
