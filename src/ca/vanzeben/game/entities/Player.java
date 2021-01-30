package ca.vanzeben.game.entities;

import ca.vanzeben.game.InputHandler;
import ca.vanzeben.game.gfx.Screen;
import ca.vanzeben.game.level.Level;

public class Player extends Mob {

    private InputHandler input;

    public Player(Level level, int x, int y, InputHandler input) {
        super(level, "Player", x, y, 1);
        this.input = input;
    }

    public void tick() {
        int xa = 0;
        int ya = 0;
        if(input.up.isPressed()) {
            ya--;
        }
        if(input.down.isPressed()) {
            ya++;
        }
        if(input.left.isPressed()) {
            xa--;
        }
        if(input.right.isPressed()) {
            xa++;
        }

        if (xa != 0 || ya !=0) {
            move(xa, ya);
            isMoving = true;
        } else {
            isMoving = false;
        }
    }

    public void render(Screen screen) {

    }

    public boolean hasCollided(int xa, int ya) {
        return false;
    }
}
