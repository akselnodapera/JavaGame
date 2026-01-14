package io.github.nodakoll;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Main extends Game {
    private SpriteBatch batch;
    private Texture spriteTexture;

    @Override
    public void create() {
        batch = new SpriteBatch();
        spriteTexture = new Texture(Gdx.files.internal("aksel.png"));

    }

    @Override
    public void render() {
        // Clear the screen
        Gdx.gl.glClearColor(1, 1, 1, 1); // white background
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin(); // begin the batch
        batch.draw(spriteTexture, 0, 0, 200, 200);
        batch.end(); // end the batch
    }

    @Override
    public void dispose() {
        batch.dispose();
        spriteTexture.dispose();
    }
}
