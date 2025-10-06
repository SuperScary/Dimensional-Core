package dimensional.core.gui.util;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.items.SlotItemHandler;

public class OutputSlot extends SlotItemHandler {

    public OutputSlot (IItemHandler itemHandler, int index, int xPosition, int yPosition) {
        super(itemHandler, index, xPosition, yPosition);
    }

    @Override
    public boolean mayPlace (ItemStack stack) {
        return false;
    }

    @Override
    public boolean mayPickup (Player playerIn) {
        return !getItem().is(ItemStack.EMPTY.getItem());
    }
}

