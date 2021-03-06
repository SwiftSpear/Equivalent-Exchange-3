package ee3.common.lib;

/**
 * Reference
 * 
 * General purpose library to contain mod related constants
 * 
 * @author pahimar
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */
public class Reference {

    /* Debug Mode On-Off */
    public static final boolean DEBUG_MODE = false;

    /* General Mod related constants */
    public static final String MOD_ID = "EE3";
    public static final String MOD_NAME = "Equivalent Exchange 3";
    public static final String VERSION = "1.0.0.0";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final String LOGGER_PREFIX = "[" + MOD_ID + "] ";

    /* KeyBinding related constants */
    public static final String KEYBINDING_EXTRA = "mod.ee3.extra_key";
    public static final int KEYBINDING_EXTRA_DEFAULT = 46;
    public static final String KEYBINDING_RELEASE = "mod.ee3.release_key";
    public static final int KEYBINDING_RELEASE_DEFAULT = 19;
    public static final String KEYBINDING_TOGGLE = "mod.ee3.toggle_key";
    public static final int KEYBINDING_TOGGLE_DEFAULT = 34;
    public static final String KEYBINDING_CHARGE = "mod.ee3.charge_key";
    public static final int KEYBINDING_CHARGE_DEFAULT = 47;

    /* Texture related constants */
    public static final String SPRITE_SHEET_LOCATION = "/ee3/art/sprites/";
    public static final String ITEM_SPRITE_SHEET = "ee3_items.png";
    public static final String BLOCK_SPRITE_SHEET = "ee3_blocks.png";
    public static final String GUI_SHEET_LOCATION = "/ee3/art/gui/";
    public static final String ARMOR_SHEET_LOCATION = "/ee3/art/armor/";

}
