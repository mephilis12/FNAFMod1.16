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

import net.mcreator.fnafmod.FnafModModVariables;
import net.mcreator.fnafmod.FnafModModElements;
import net.mcreator.fnafmod.FnafModMod;

import java.util.Map;

@FnafModModElements.ModElement.Tag
public class BonnieBunnyThisEntityKillsAnotherOneProcedure extends FnafModModElements.ModElement {
	public BonnieBunnyThisEntityKillsAnotherOneProcedure(FnafModModElements instance) {
		super(instance, 109);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				FnafModMod.LOGGER.warn("Failed to load dependency x for procedure BonnieBunnyThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				FnafModMod.LOGGER.warn("Failed to load dependency y for procedure BonnieBunnyThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				FnafModMod.LOGGER.warn("Failed to load dependency z for procedure BonnieBunnyThisEntityKillsAnotherOne!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				FnafModMod.LOGGER.warn("Failed to load dependency world for procedure BonnieBunnyThisEntityKillsAnotherOne!");
			return;
		}
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
				FnafModModVariables.WorldVariables.get(world).BonnieFrame1 = (boolean) (true);
				FnafModModVariables.WorldVariables.get(world).syncData(world);
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
						FnafModModVariables.WorldVariables.get(world).BonnieFrame1 = (boolean) (false);
						FnafModModVariables.WorldVariables.get(world).syncData(world);
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
						FnafModModVariables.WorldVariables.get(world).BonnieFrame2 = (boolean) (true);
						FnafModModVariables.WorldVariables.get(world).syncData(world);
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
								FnafModModVariables.WorldVariables.get(world).BonnieFrame2 = (boolean) (false);
								FnafModModVariables.WorldVariables.get(world).syncData(world);
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
								FnafModModVariables.WorldVariables.get(world).BonnieFrame3 = (boolean) (true);
								FnafModModVariables.WorldVariables.get(world).syncData(world);
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
										FnafModModVariables.WorldVariables.get(world).BonnieFrame3 = (boolean) (false);
										FnafModModVariables.WorldVariables.get(world).syncData(world);
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
										FnafModModVariables.WorldVariables.get(world).BonnieFrame4 = (boolean) (true);
										FnafModModVariables.WorldVariables.get(world).syncData(world);
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
												FnafModModVariables.WorldVariables.get(world).BonnieFrame4 = (boolean) (false);
												FnafModModVariables.WorldVariables.get(world).syncData(world);
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
												FnafModModVariables.WorldVariables.get(world).BonnieFrame5 = (boolean) (true);
												FnafModModVariables.WorldVariables.get(world).syncData(world);
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
														FnafModModVariables.WorldVariables.get(world).BonnieFrame5 = (boolean) (false);
														FnafModModVariables.WorldVariables.get(world).syncData(world);
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
														FnafModModVariables.WorldVariables.get(world).BonnieFrame1 = (boolean) (true);
														FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																FnafModModVariables.WorldVariables.get(world).BonnieFrame1 = (boolean) (false);
																FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																FnafModModVariables.WorldVariables.get(world).BonnieFrame2 = (boolean) (true);
																FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																		FnafModModVariables.WorldVariables
																				.get(world).BonnieFrame2 = (boolean) (false);
																		FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																		FnafModModVariables.WorldVariables.get(world).BonnieFrame3 = (boolean) (true);
																		FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																				FnafModModVariables.WorldVariables
																						.get(world).BonnieFrame3 = (boolean) (false);
																				FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																				FnafModModVariables.WorldVariables
																						.get(world).BonnieFrame4 = (boolean) (true);
																				FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																						FnafModModVariables.WorldVariables
																								.get(world).BonnieFrame4 = (boolean) (false);
																						FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																						FnafModModVariables.WorldVariables
																								.get(world).BonnieFrame5 = (boolean) (true);
																						FnafModModVariables.WorldVariables.get(world).syncData(world);
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
																								FnafModModVariables.WorldVariables
																										.get(world).BonnieFrame5 = (boolean) (false);
																								FnafModModVariables.WorldVariables.get(world)
																										.syncData(world);
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
