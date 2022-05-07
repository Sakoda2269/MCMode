package meca.KeyEvent;

import meca.MecaMod;
import meca.Items.WeaponUnits.Armor.MCChestPlate;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageKeyPressedHandler implements IMessageHandler<MessageKeyPressed, IMessage> {

    @Override
    public IMessage onMessage(MessageKeyPressed message, MessageContext ctx) {
        EntityPlayer entityPlayer = ctx.getServerHandler().player;
        //受け取ったMessageクラスのkey変数の数字をチャットに出力
        if(entityPlayer.getItemStackFromSlot(EntityEquipmentSlot.CHEST).getItem()==MecaMod.mecac) {
        	((MCChestPlate) MecaMod.mecac).jumppig();
        }
        //entityPlayer.sendMessage(new TextComponentTranslation(String.format("Received byte %d", message.key)));
        return null;
    }


}