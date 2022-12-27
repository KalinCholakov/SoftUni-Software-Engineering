package magicGame.models.magics;

public class RedMagic extends MagicImpl {


    public static final int RED_MAGIC_BULLETS = 1;

    public RedMagic(String name, int bulletsCount) {
        super(name, bulletsCount);
    }

    @Override
    public int fire() {
        if (super.getBulletsCount() < RED_MAGIC_BULLETS) {
            return 0;
        }

        super.decreaseBullets(RED_MAGIC_BULLETS);

        return RED_MAGIC_BULLETS;
    }
}
