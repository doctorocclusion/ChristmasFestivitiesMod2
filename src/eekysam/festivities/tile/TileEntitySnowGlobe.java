package eekysam.festivities.tile;

import net.minecraft.block.BlockContainer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TileEntitySnowglobe extends TileEntity
{
	public int type;
	
	public TileEntitySnowglobe(World world, BlockContainer block)
	{
		this.blockType = block;
		this.worldObj = world;
		this.type = this.worldObj.rand.nextInt(SnowglobeScene.list.size());
	}
	
	@Override
	public void writeToNBT(NBTTagCompound tag)
	{
		super.writeToNBT(tag);
	}
	
	@Override
	public void readFromNBT(NBTTagCompound tag)
	{
		super.readFromNBT(tag);
	}
	
	public Packet getDescriptionPacket() 
	{
    		NBTTagCompound compound = new NBTTagCompound();
    		this.writeToNBT(compound);
    		return new Packet132TileEntityData(this.xCoord, this.yCoord, this.zCoord, 1, compound);
	}
}
