package WorldGeneration;

import com.github.thedcplaya.infinitetools.block.ModBlocks;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

public class ModWorldGen implements IWorldGenerator {

    private int veinCount = 3;
    private int maxY = 10;
    private int minY = 0;
    private int veinSize = 6;

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
                         IChunkProvider chunkProvider) {

        if (!world.provider.isSurfaceWorld()) {
            return;
        }

        for (int i = 0; i < veinCount; i++) {
            int x = chunkX * 16 + random.nextInt(16);
            int y = random.nextInt(maxY - minY) + minY;
            int z = chunkZ * 16 + random.nextInt(16);
            (new WorldGenMinable(ModBlocks.oreScandium.getDefaultState(), veinSize)).generate(world, random,
                    new BlockPos(x, y, z));
        }

    }
}