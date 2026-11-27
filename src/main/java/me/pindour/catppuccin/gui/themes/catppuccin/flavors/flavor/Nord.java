package me.pindour.catppuccin.gui.themes.catppuccin.flavors.flavor;

import me.pindour.catppuccin.gui.themes.catppuccin.colors.CatppuccinColor;
import me.pindour.catppuccin.gui.themes.catppuccin.flavors.FlavorColorProvider;
import meteordevelopment.meteorclient.utils.render.color.SettingColor;

/**
 * Nord palette mapped to the theme's semantic color slots.
 */
public enum Nord implements FlavorColorProvider {
    Rosewater(new SettingColor(216, 177, 177), CatppuccinColor.Rosewater),
    Flamingo(new SettingColor(191, 97, 106), CatppuccinColor.Flamingo),
    Pink(new SettingColor(180, 142, 173), CatppuccinColor.Pink),
    Mauve(new SettingColor(180, 142, 173), CatppuccinColor.Mauve),
    Maroon(new SettingColor(191, 97, 106), CatppuccinColor.Maroon),
    Peach(new SettingColor(208, 135, 112), CatppuccinColor.Peach),
    Teal(new SettingColor(143, 188, 187), CatppuccinColor.Teal),
    Sky(new SettingColor(136, 192, 208), CatppuccinColor.Sky),
    Sapphire(new SettingColor(129, 161, 193), CatppuccinColor.Sapphire),
    Lavender(new SettingColor(180, 142, 173), CatppuccinColor.Lavender),
    Red(new SettingColor(191, 97, 106), CatppuccinColor.Red),
    Blue(new SettingColor(94, 129, 172), CatppuccinColor.Blue),
    Yellow(new SettingColor(235, 203, 139), CatppuccinColor.Yellow),
    Green(new SettingColor(163, 190, 140), CatppuccinColor.Green),
    Text(new SettingColor(236, 239, 244), CatppuccinColor.Text),
    Subtext1(new SettingColor(229, 233, 240), CatppuccinColor.Subtext1),
    Subtext0(new SettingColor(216, 222, 233), CatppuccinColor.Subtext0),
    Overlay2(new SettingColor(192, 200, 215), CatppuccinColor.Overlay2),
    Overlay1(new SettingColor(174, 185, 204), CatppuccinColor.Overlay1),
    Overlay0(new SettingColor(151, 166, 186), CatppuccinColor.Overlay0),
    Surface2(new SettingColor(76, 86, 106), CatppuccinColor.Surface2),
    Surface1(new SettingColor(67, 76, 94), CatppuccinColor.Surface1),
    Surface0(new SettingColor(59, 66, 82), CatppuccinColor.Surface0),
    Base(new SettingColor(46, 52, 64), CatppuccinColor.Base),
    Mantle(new SettingColor(39, 45, 56), CatppuccinColor.Mantle),
    Crust(new SettingColor(32, 37, 47), CatppuccinColor.Crust);

    private final SettingColor color;
    private final CatppuccinColor type;

    Nord(SettingColor color, CatppuccinColor type) {
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
