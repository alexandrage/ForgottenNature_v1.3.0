package assets.forgottennature.Blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Icon;
import net.minecraft.world.World;

public class BlockNewFlowers extends BlockFlower {

   @SideOnly(Side.CLIENT)
   private Icon[] field_94349_a;


   public BlockNewFlowers(int i) {
      super(i, Material.plants);
      float f = 0.4F;
      this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
   }

   @SideOnly(Side.CLIENT)
   public Icon getIcon(int par1, int par2) {
      return this.field_94349_a[par2];
   }

   @SideOnly(Side.CLIENT)
   public void registerIcons(IconRegister par1IconRegister) {
      this.field_94349_a = new Icon[10];
      this.field_94349_a[0] = par1IconRegister.registerIcon("forgottennature:AlliumDrumstick");
      this.field_94349_a[1] = par1IconRegister.registerIcon("forgottennature:BachelorsButton");
      this.field_94349_a[2] = par1IconRegister.registerIcon("forgottennature:BillyButtons");
      this.field_94349_a[3] = par1IconRegister.registerIcon("forgottennature:DelphiniumBelladonna");
      this.field_94349_a[4] = par1IconRegister.registerIcon("forgottennature:FernflowerYarrow");
      this.field_94349_a[5] = par1IconRegister.registerIcon("forgottennature:GerberaDaisy");
      this.field_94349_a[6] = par1IconRegister.registerIcon("forgottennature:Hydrangea");
      this.field_94349_a[7] = par1IconRegister.registerIcon("forgottennature:RedRover");
      this.field_94349_a[8] = par1IconRegister.registerIcon("forgottennature:SnapdragonMagenta");
      this.field_94349_a[9] = par1IconRegister.registerIcon("forgottennature:StarOfBethlehem");
   }

   public int damageDropped(int i) {
      return i & 15;
   }

   public boolean onBlockActivated(World world, int i, int j, int k, EntityPlayer entityplayer, int par6, float par7, float par8, float par9) {
      ItemStack equipped = entityplayer.getCurrentEquippedItem();
      if(equipped == null) {
         return false;
      } else {
         if(equipped.getItem() == Item.dyePowder && equipped.getItemDamage() == 15) {
            for(int one = -2; one < 3; ++one) {
               for(int two = -2; two < 3; ++two) {
                  for(int three = -2; three < 3; ++three) {
                     int bid = world.getBlockId(i + one, j + two, k + three);
                     int bidu = world.getBlockId(i + one, j + two - 1, k + three);
                     if((bid == 31 || bid == 37 || bid == 38 || bid == 0) && (bidu == 2 || bidu == 3) && Math.abs(one) + Math.abs(three) < 4 && world.rand.nextInt(3) == 0) {
                        world.setBlock(i + one, j + two, k + three, world.getBlockId(i, j, k), world.getBlockMetadata(i, j, k), 2);
                     }
                  }
               }
            }

            --equipped.stackSize;
         }

         return false;
      }
   }
}
