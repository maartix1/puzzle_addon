package me.pindour.catppuccin.gui.themes.catppuccin.flavors.flavor;

import me.pindour.catppuccin.gui.themes.catppuccin.colors.CatppuccinColor;
import me.pindour.catppuccin.gui.themes.catppuccin.flavors.FlavorColorProvider;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

/**
 * Gruvbox palette mapped to the theme's semantic color slots.
 */
public enum Gruvbox implements FlavorColorProvider {
    Rosewater(new SettingColor(251, 73, 52), CatppuccinColor.Rosewater),
    Flamingo(new SettingColor(251, 73, 52), CatppuccinColor.Flamingo),
    Pink(new SettingColor(211, 134, 155), CatppuccinColor.Pink),
    Mauve(new SettingColor(211, 134, 155), CatppuccinColor.Mauve),
    Maroon(new SettingColor(204, 36, 29), CatppuccinColor.Maroon),
    Peach(new SettingColor(254, 128, 25), CatppuccinColor.Peach),
    Teal(new SettingColor(142, 192, 124), CatppuccinColor.Teal),
    Sky(new SettingColor(131, 165, 152), CatppuccinColor.Sky),
    Sapphire(new SettingColor(69, 133, 136), CatppuccinColor.Sapphire),
    Lavender(new SettingColor(189, 174, 147), CatppuccinColor.Lavender),
    Red(new SettingColor(204, 36, 29), CatppuccinColor.Red),
    Blue(new SettingColor(69, 133, 136), CatppuccinColor.Blue),
    Yellow(new SettingColor(250, 189, 47), CatppuccinColor.Yellow),
    Green(new SettingColor(152, 151, 26), CatppuccinColor.Green),
    Text(new SettingColor(235, 219, 178), CatppuccinColor.Text),
    Subtext1(new SettingColor(213, 196, 161), CatppuccinColor.Subtext1),
    Subtext0(new SettingColor(189, 174, 147), CatppuccinColor.Subtext0),
    Overlay2(new SettingColor(168, 153, 132), CatppuccinColor.Overlay2),
    Overlay1(new SettingColor(146, 131, 116), CatppuccinColor.Overlay1),
    Overlay0(new SettingColor(124, 111, 100), CatppuccinColor.Overlay0),
    Surface2(new SettingColor(80, 73, 69), CatppuccinColor.Surface2),
    Surface1(new SettingColor(60, 56, 54), CatppuccinColor.Surface1),
    Surface0(new SettingColor(50, 48, 47), CatppuccinColor.Surface0),
    Base(new SettingColor(40, 40, 40), CatppuccinColor.Base),
    Mantle(new SettingColor(29, 32, 33), CatppuccinColor.Mantle),
    Crust(new SettingColor(24, 24, 24), CatppuccinColor.Crust);

    private final SettingColor color;
    private final CatppuccinColor type;

    Gruvbox(SettingColor color, CatppuccinColor type) {
        this.color = color;
        this.type = type;
    }

    @Override
    public SettingColor getColor() {
        return color;
    }

    @Override
    public CatppuccinColor getType() {
        return type;
    }
}
