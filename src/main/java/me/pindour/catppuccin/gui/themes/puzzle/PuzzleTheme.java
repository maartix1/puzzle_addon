//? if >=26.3 {
package me.pindour.catppuccin.gui.themes.puzzle;

import me.pindour.catppuccin.gui.screens.CatppuccinModernModulesScreen;
import me.pindour.catppuccin.gui.themes.catppuccin.CatppuccinGuiTheme;
import meteordevelopment.meteorclient.gui.tabs.TabScreen;
import net.minecraft.client.gui.screens.Screen;

/**
 * Separate GUI theme that uses the modern modules screen.
 * The original Catppuccin theme retains its classic modules screen.
 */
public class PuzzleTheme extends CatppuccinGuiTheme {
    public PuzzleTheme() {
        super("Meteor Client");
    }

    @Override
    public TabScreen modulesScreen() {
        return new CatppuccinModernModulesScreen(this);
    }

    @Override
    public boolean isModulesScreen(Screen screen) {
        return screen instanceof CatppuccinModernModulesScreen;
    }
}
//?}
