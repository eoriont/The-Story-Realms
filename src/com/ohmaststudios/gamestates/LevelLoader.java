package com.ohmaststudios.gamestates;

import com.ohmaststudios.gamestate.GameState;
import com.ohmaststudios.gamestate.GameStateManager;
import com.ohmaststudios.generator.World;
import com.ohmaststudios.movableObjects.Player;

import java.awt.*;
import java.awt.image.BufferedImage;

public class LevelLoader extends GameState {

    World world;

    public LevelLoader(GameStateManager gsm) {
        super(gsm);
    }

    @Override
    public void init() {
        world = new World("world");
        world.setSize(100, 100);
        world.addPlayer(new Player());
        world.init();
        world.generate("map");
    }

    @Override
    public void tick(double deltaTime) {
        world.tick(deltaTime);
    }

    @Override
    public void render(Graphics2D g) {
        world.render(g);
    }
}
