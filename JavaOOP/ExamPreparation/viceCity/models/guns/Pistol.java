package SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.guns;

public class Pistol extends BaseGun {
    private static final int BULLETS_PER_SHOT = 1;
    private static final int INITIAL_BULLETS_PER_BARREL = 10;
    private static final int INITIAL_TOTAL_BULLETS = 100;

    public Pistol(String name) {
        super(name, INITIAL_BULLETS_PER_BARREL, INITIAL_TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        if (!canFire()) {
            return 0;
        }
        if (getBulletsPerBarrel() == 0) {
            reload();
        }
        setBulletsPerBarrel(getBulletsPerBarrel() - BULLETS_PER_SHOT);
        return BULLETS_PER_SHOT;
    }

    private void reload() {
        int bulletsToReload = Math.min(INITIAL_BULLETS_PER_BARREL, getTotalBullets());
        setBulletsPerBarrel(bulletsToReload);
        setTotalBullets(getTotalBullets() - bulletsToReload);
    }
}