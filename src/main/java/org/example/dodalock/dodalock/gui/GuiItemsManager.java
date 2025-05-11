package org.example.dodalock.dodalock.gui;

import org.bukkit.Material;
import org.example.dodalock.dodalock.items.CustomItem;

public class GuiItemsManager {
    private static final Material material = Material.GRAY_STAINED_GLASS_PANE;
    private static final Material material_button_code = Material.LIGHT_BLUE_STAINED_GLASS_PANE;
    private static final Material material_button_enter = Material.GREEN_STAINED_GLASS_PANE;
    private static final Material material_button_cancel = Material.RED_STAINED_GLASS_PANE;
    private static CustomItem inventoryPart;
    private static CustomItem inventoryButton0;
    private static CustomItem inventoryButton1;
    private static CustomItem inventoryButton2;
    private static CustomItem inventoryButton3;
    private static CustomItem inventoryButton4;
    private static CustomItem inventoryButton5;
    private static CustomItem inventoryButton6;
    private static CustomItem inventoryButton7;
    private static CustomItem inventoryButton8;
    private static CustomItem inventoryButton9;
    private static CustomItem inventoryPartWithBorderLeft;
    private static CustomItem inventoryPartWithBorderUp;
    private static CustomItem inventoryPartWithBorderLeftUp;
    private static CustomItem inventoryPartWithBorderDotLeftUp;
    private static CustomItem inventoryField;
    private static CustomItem inventoryField0;
    private static CustomItem inventoryField1;
    private static CustomItem inventoryField2;
    private static CustomItem inventoryField3;
    private static CustomItem inventoryField4;
    private static CustomItem inventoryField5;
    private static CustomItem inventoryField6;
    private static CustomItem inventoryField7;
    private static CustomItem inventoryField8;
    private static CustomItem inventoryField9;
    private static CustomItem inventoryButtonE;
    private static CustomItem inventoryButtonC;

    public static void initializeGuiItems() {
        inventoryPart = new CustomItem(material, 1, "gui.plug");
        inventoryButton0 = new CustomItem(material_button_code, 2, "gui.number_0");
        inventoryButton1 = new CustomItem(material_button_code, 3, "gui.number_1");
        inventoryButton2 = new CustomItem(material_button_code, 4, "gui.number_2");
        inventoryButton3 = new CustomItem(material_button_code, 5, "gui.number_3");
        inventoryButton4 = new CustomItem(material_button_code, 6, "gui.number_4");
        inventoryButton5 = new CustomItem(material_button_code, 7, "gui.number_5");
        inventoryButton6 = new CustomItem(material_button_code, 8, "gui.number_6");
        inventoryButton7 = new CustomItem(material_button_code, 9, "gui.number_7");
        inventoryButton8 = new CustomItem(material_button_code, 10, "gui.number_8");
        inventoryButton9 = new CustomItem(material_button_code, 11, "gui.number_9");
        inventoryPartWithBorderLeft = new CustomItem(material, 12, "gui.plug");
        inventoryPartWithBorderUp = new CustomItem(material, 13, "gui.plug");
        inventoryPartWithBorderLeftUp = new CustomItem(material, 14, "gui.plug");
        inventoryPartWithBorderDotLeftUp = new CustomItem(material, 15, "gui.plug");
        inventoryField = new CustomItem(material, 16, "gui.plug");
        inventoryField0 = new CustomItem(material_button_code, 17, "gui.number_0");
        inventoryField1 = new CustomItem(material_button_code, 18, "gui.number_1");
        inventoryField2 = new CustomItem(material_button_code, 19, "gui.number_2");
        inventoryField3 = new CustomItem(material_button_code, 20, "gui.number_3");
        inventoryField4 = new CustomItem(material_button_code, 21, "gui.number_4");
        inventoryField5 = new CustomItem(material_button_code, 22, "gui.number_5");
        inventoryField6 = new CustomItem(material_button_code, 23, "gui.number_6");
        inventoryField7 = new CustomItem(material_button_code, 24, "gui.number_7");
        inventoryField8 = new CustomItem(material_button_code, 25, "gui.number_8");
        inventoryField9 = new CustomItem(material_button_code, 26, "gui.number_9");
        inventoryButtonE = new CustomItem(material_button_enter, 27, "gui.enter");
        inventoryButtonC = new CustomItem(material_button_cancel, 28, "gui.clear");
    }

    public static CustomItem getInventoryPart() { return inventoryPart; }

    public static CustomItem getInventoryPartWithBorderLeft() {
        return inventoryPartWithBorderLeft;
    }

    public static CustomItem getInventoryPartWithBorderUp() {
        return inventoryPartWithBorderUp;
    }

    public static CustomItem getInventoryPartWithBorderLeftUp() {
        return inventoryPartWithBorderLeftUp;
    }

    public static CustomItem getInventoryPartWithBorderDotLeftUp() {
        return inventoryPartWithBorderDotLeftUp;
    }

    public static CustomItem getInventoryButton0() {
        return inventoryButton0;
    }

    public static CustomItem getInventoryButton1() {
        return inventoryButton1;
    }

    public static CustomItem getInventoryButton2() {
        return inventoryButton2;
    }

    public static CustomItem getInventoryButton3() {
        return inventoryButton3;
    }

    public static CustomItem getInventoryButton4() {
        return inventoryButton4;
    }

    public static CustomItem getInventoryButton5() {
        return inventoryButton5;
    }

    public static CustomItem getInventoryButton6() {
        return inventoryButton6;
    }

    public static CustomItem getInventoryButton7() {
        return inventoryButton7;
    }

    public static CustomItem getInventoryButton8() {
        return inventoryButton8;
    }

    public static CustomItem getInventoryButton9() {
        return inventoryButton9;
    }

    public static CustomItem getInventoryField() {
        return inventoryField;
    }

    public static CustomItem getInventoryField0() {
        return inventoryField0;
    }

    public static CustomItem getInventoryField1() {
        return inventoryField1;
    }

    public static CustomItem getInventoryField2() {
        return inventoryField2;
    }

    public static CustomItem getInventoryField3() {
        return inventoryField3;
    }

    public static CustomItem getInventoryField4() {
        return inventoryField4;
    }

    public static CustomItem getInventoryField5() {
        return inventoryField5;
    }

    public static CustomItem getInventoryField6() {
        return inventoryField6;
    }

    public static CustomItem getInventoryField7() {
        return inventoryField7;
    }

    public static CustomItem getInventoryField8() {
        return inventoryField8;
    }

    public static CustomItem getInventoryField9() {
        return inventoryField9;
    }

    public static CustomItem getInventoryButtonE() {
        return inventoryButtonE;
    }

    public static CustomItem getInventoryButtonC() {
        return inventoryButtonC;
    }
}
