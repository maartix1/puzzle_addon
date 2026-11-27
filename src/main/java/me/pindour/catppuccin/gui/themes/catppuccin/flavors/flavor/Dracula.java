package me.pindour.catppuccin.gui.themes.catppuccin.flavors.flavor;

import me.pindour.catppuccin.gui.themes.catppuccin.colors.CatppuccinColor;
import me.pindour.catppuccin.gui.themes.catppuccin.flavors.FlavorColorProvider;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

/**
 * Dracula palette mapped to the theme's semantic color slots.
 */
public enum Dracula implements FlavorColorProvider {
    Rosewater(new SettingColor(255, 184, 108), CatppuccinColor.Rosewater),
    Flamingo(new SettingColor(255, 85, 85), CatppuccinColor.Flamingo),
    Pink(new SettingColor(255, 121, 198), CatppuccinColor.Pink),
    Mauve(new SettingColor(189, 147, 249), CatppuccinColor.Mauve),
    Maroon(new SettingColor(255, 85, 85), CatppuccinColor.Maroon),
    Peach(new SettingColor(255, 184, 108), CatppuccinColor.Peach),
    Teal(new SettingColor(139, 233, 253), CatppuccinColor.Teal),
    Sky(new SettingColor(139, 233, 253), CatppuccinColor.Sky),
    Sapphire(new SettingColor(98, 214, 220), CatppuccinColor.Sapphire),
    Lavender(new SettingColor(189, 147, 249), CatppuccinColor.Lavender),
    Red(new SettingColor(255, 85, 85), CatppuccinColor.Red),
    Blue(new SettingColor(139, 233, 253), CatppuccinColor.Blue),
    Yellow(new SettingColor(241, 250, 140), CatppuccinColor.Yellow),
    Green(new SettingColor(80, 250, 123), CatppuccinColor.Green),
    Text(new SettingColor(248, 248, 242), CatppuccinColor.Text),
    Subtext1(new SettingColor(230, 230, 224), CatppuccinColor.Subtext1),
    Subtext0(new SettingColor(210, 210, 204), CatppuccinColor.Subtext0),
    Overlay2(new SettingColor(184, 184, 180), CatppuccinColor.Overlay2),
    Overlay1(new SettingColor(145, 145, 151), CatppuccinColor.Overlay1),
    Overlay0(new SettingColor(98, 99, 114), CatppuccinColor.Overlay0),
    Surface2(new SettingColor(68, 71, 90), CatppuccinColor.Surface2),
    Surface1(new SettingColor(56, 58, 75), CatppuccinColor.Surface1),
    Surface0(new SettingColor(48, 50, 66), CatppuccinColor.Surface0),
    Base(new SettingColor(40, 42, 54), CatppuccinColor.Base),
    Mantle(new SettingColor(33, 34, 44), CatppuccinColor.Mantle),
    Crust(new SettingColor(25, 26, 33), CatppuccinColor.Crust);

    private final SettingColor color;
    private final CatppuccinColor type;

    Dracula(SettingColor color, CatppuccinColor type) {
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
