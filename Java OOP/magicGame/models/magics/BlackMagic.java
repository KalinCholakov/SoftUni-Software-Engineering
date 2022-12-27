package magicGame.models.magics;

public class BlackMagic extends MagicImpl {


    public static final int BLACK_MAGIC_BULLETS = 10;

    public BlackMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (super.getBulletsCount() < BLACK_MAGIC_BULLETS) {
            return 0;
        }

        super.decreaseBullets(BLACK_MAGIC_BULLETS);

        return BLACK_MAGIC_BULLETS;
    }
}
