package net.mcreator.fnafmod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class FoxyPirateThisEntityKillsAnotherOneProcedure extends FnafModModElements.ModElement {
	public FoxyPirateThisEntityKillsAnotherOneProcedure(FnafModModElements instance) {
		super(instance, 68);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				FnafModMod.LOGGER.warn("Failed to load dependency entity for procedure FoxyPirateThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FnafModMod.LOGGER.warn("Failed to load dependency x for procedure FoxyPirateThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FnafModMod.LOGGER.warn("Failed to load dependency y for procedure FoxyPirateThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FnafModMod.LOGGER.warn("Failed to load dependency z for procedure FoxyPirateThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure FoxyPirateThisEntityKillsAnotherOne!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (world instanceof World && !world.isRemote()) {
			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:fnaf1_scream")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1);
		} else {
			((World) world).playSound(x, y, z,
					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("fnaf_mod:fnaf1_scream")),
					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;
			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				{
					boolean _setval = (boolean) (true);
					entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.FoxyFrame1 = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;
					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							boolean _setval = (boolean) (false);
							entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FoxyFrame1 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 0.1);
				new Object() {
					private int ticks = 0;
					private float waitTicks;
					private IWorld world;
					public void start(IWorld world, int waitTicks) {
						this.waitTicks = waitTicks;
						MinecraftForge.EVENT_BUS.register(this);
						this.world = world;
					}

					@SubscribeEvent
					public void tick(TickEvent.ServerTickEvent event) {
						if (event.phase == TickEvent.Phase.END) {
							this.ticks += 1;
							if (this.ticks >= this.waitTicks)
								run();
						}
					}

					private void run() {
						{
							boolean _setval = (boolean) (true);
							entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
								capability.FoxyFrame2 = _setval;
								capability.syncPlayerVariables(entity);
							});
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;
							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									boolean _setval = (boolean) (false);
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FoxyFrame2 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 0.1);
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;
							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								{
									boolean _setval = (boolean) (true);
									entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
										capability.FoxyFrame3 = _setval;
										capability.syncPlayerVariables(entity);
									});
								}
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;
									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											boolean _setval = (boolean) (false);
											entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.FoxyFrame3 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 0.1);
								new Object() {
									private int ticks = 0;
									private float waitTicks;
									private IWorld world;
									public void start(IWorld world, int waitTicks) {
										this.waitTicks = waitTicks;
										MinecraftForge.EVENT_BUS.register(this);
										this.world = world;
									}

									@SubscribeEvent
									public void tick(TickEvent.ServerTickEvent event) {
										if (event.phase == TickEvent.Phase.END) {
											this.ticks += 1;
											if (this.ticks >= this.waitTicks)
												run();
										}
									}

									private void run() {
										{
											boolean _setval = (boolean) (true);
											entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
												capability.FoxyFrame4 = _setval;
												capability.syncPlayerVariables(entity);
											});
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;
											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													boolean _setval = (boolean) (false);
													entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.FoxyFrame4 = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 0.1);
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;
											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												{
													boolean _setval = (boolean) (true);
													entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
															.ifPresent(capability -> {
																capability.FoxyFrame5 = _setval;
																capability.syncPlayerVariables(entity);
															});
												}
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private IWorld world;
													public void start(IWorld world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														{
															boolean _setval = (boolean) (false);
															entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.FoxyFrame5 = _setval;
																		capability.syncPlayerVariables(entity);
																	});
														}
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 0.1);
												new Object() {
													private int ticks = 0;
													private float waitTicks;
													private IWorld world;
													public void start(IWorld world, int waitTicks) {
														this.waitTicks = waitTicks;
														MinecraftForge.EVENT_BUS.register(this);
														this.world = world;
													}

													@SubscribeEvent
													public void tick(TickEvent.ServerTickEvent event) {
														if (event.phase == TickEvent.Phase.END) {
															this.ticks += 1;
															if (this.ticks >= this.waitTicks)
																run();
														}
													}

													private void run() {
														{
															boolean _setval = (boolean) (true);
															entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																	.ifPresent(capability -> {
																		capability.FoxyFrame1 = _setval;
																		capability.syncPlayerVariables(entity);
																	});
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private IWorld world;
															public void start(IWorld world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	boolean _setval = (boolean) (false);
																	entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.FoxyFrame1 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 0.1);
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private IWorld world;
															public void start(IWorld world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																{
																	boolean _setval = (boolean) (true);
																	entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																			.ifPresent(capability -> {
																				capability.FoxyFrame2 = _setval;
																				capability.syncPlayerVariables(entity);
																			});
																}
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private IWorld world;
																	public void start(IWorld world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		{
																			boolean _setval = (boolean) (false);
																			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																					null).ifPresent(capability -> {
																						capability.FoxyFrame2 = _setval;
																						capability.syncPlayerVariables(entity);
																					});
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 0.1);
																new Object() {
																	private int ticks = 0;
																	private float waitTicks;
																	private IWorld world;
																	public void start(IWorld world, int waitTicks) {
																		this.waitTicks = waitTicks;
																		MinecraftForge.EVENT_BUS.register(this);
																		this.world = world;
																	}

																	@SubscribeEvent
																	public void tick(TickEvent.ServerTickEvent event) {
																		if (event.phase == TickEvent.Phase.END) {
																			this.ticks += 1;
																			if (this.ticks >= this.waitTicks)
																				run();
																		}
																	}

																	private void run() {
																		{
																			boolean _setval = (boolean) (true);
																			entity.getCapability(FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																					null).ifPresent(capability -> {
																						capability.FoxyFrame3 = _setval;
																						capability.syncPlayerVariables(entity);
																					});
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private IWorld world;
																			public void start(IWorld world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				{
																					boolean _setval = (boolean) (false);
																					entity.getCapability(
																							FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.ifPresent(capability -> {
																								capability.FoxyFrame3 = _setval;
																								capability.syncPlayerVariables(entity);
																							});
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 0.1);
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private IWorld world;
																			public void start(IWorld world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				{
																					boolean _setval = (boolean) (true);
																					entity.getCapability(
																							FnafModModVariables.PLAYER_VARIABLES_CAPABILITY, null)
																							.ifPresent(capability -> {
																								capability.FoxyFrame4 = _setval;
																								capability.syncPlayerVariables(entity);
																							});
																				}
																				new Object() {
																					private int ticks = 0;
																					private float waitTicks;
																					private IWorld world;
																					public void start(IWorld world, int waitTicks) {
																						this.waitTicks = waitTicks;
																						MinecraftForge.EVENT_BUS.register(this);
																						this.world = world;
																					}

																					@SubscribeEvent
																					public void tick(TickEvent.ServerTickEvent event) {
																						if (event.phase == TickEvent.Phase.END) {
																							this.ticks += 1;
																							if (this.ticks >= this.waitTicks)
																								run();
																						}
																					}

																					private void run() {
																						{
																							boolean _setval = (boolean) (false);
																							entity.getCapability(
																									FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																									null).ifPresent(capability -> {
																										capability.FoxyFrame4 = _setval;
																										capability.syncPlayerVariables(entity);
																									});
																						}
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 0.1);
																				new Object() {
																					private int ticks = 0;
																					private float waitTicks;
																					private IWorld world;
																					public void start(IWorld world, int waitTicks) {
																						this.waitTicks = waitTicks;
																						MinecraftForge.EVENT_BUS.register(this);
																						this.world = world;
																					}

																					@SubscribeEvent
																					public void tick(TickEvent.ServerTickEvent event) {
																						if (event.phase == TickEvent.Phase.END) {
																							this.ticks += 1;
																							if (this.ticks >= this.waitTicks)
																								run();
																						}
																					}

																					private void run() {
																						{
																							boolean _setval = (boolean) (true);
																							entity.getCapability(
																									FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																									null).ifPresent(capability -> {
																										capability.FoxyFrame5 = _setval;
																										capability.syncPlayerVariables(entity);
																									});
																						}
																						new Object() {
																							private int ticks = 0;
																							private float waitTicks;
																							private IWorld world;
																							public void start(IWorld world, int waitTicks) {
																								this.waitTicks = waitTicks;
																								MinecraftForge.EVENT_BUS.register(this);
																								this.world = world;
																							}

																							@SubscribeEvent
																							public void tick(TickEvent.ServerTickEvent event) {
																								if (event.phase == TickEvent.Phase.END) {
																									this.ticks += 1;
																									if (this.ticks >= this.waitTicks)
																										run();
																								}
																							}

																							private void run() {
																								{
																									boolean _setval = (boolean) (false);
																									entity.getCapability(
																											FnafModModVariables.PLAYER_VARIABLES_CAPABILITY,
																											null).ifPresent(capability -> {
																												capability.FoxyFrame5 = _setval;
																												capability
																														.syncPlayerVariables(entity);
																											});
																								}
																								MinecraftForge.EVENT_BUS.unregister(this);
																							}
																						}.start(world, (int) 0.1);
																						MinecraftForge.EVENT_BUS.unregister(this);
																					}
																				}.start(world, (int) 1);
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 1);
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 1);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 1);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 1);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 1);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 1);
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 1);
						MinecraftForge.EVENT_BUS.unregister(this);
					}
				}.start(world, (int) 1);
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 1);
	}
}
