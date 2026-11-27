//? if >=26.3 {
package me.pindour.catppuccin.gui.themes.catppuccin;

import me.pindour.catppuccin.gui.screens.CatppuccinModernModulesScreen;
import meteordevelopment.meteorclient.gui.tabs.TabScreen;
import net.minecraft.client.gui.screens.Screen;

/**
 * Separate Catppuccin theme variant using the modern modules layout.
 * The original Catppuccin theme keeps its classic modules screen.
 */
public class CatppuccinModernGuiTheme extends CatppuccinGuiTheme {
    public CatppuccinModernGuiTheme() {
        super("Catppuccin Modern");
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
