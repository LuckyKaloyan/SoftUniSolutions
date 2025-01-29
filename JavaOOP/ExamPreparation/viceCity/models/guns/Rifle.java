package SoftUniJavaOOP.ExamPreparationOOP.viceCity.models.guns;

public class Rifle extends BaseGun {
    private static final int BULLETS_PER_SHOT = 5;
    private static final int INITIAL_BULLETS_PER_BARREL = 50;
    private static final int INITIAL_TOTAL_BULLETS = 500;

    public Rifle(String name) {
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
        int bulletsShot = Math.min(BULLETS_PER_SHOT, getBulletsPerBarrel());
        setBulletsPerBarrel(getBulletsPerBarrel() - bulletsShot);
        return bulletsShot;
    }

    private void reload() {
        int bulletsToReload = Math.min(INITIAL_BULLETS_PER_BARREL, getTotalBullets());
        setBulletsPerBarrel(bulletsToReload);
        setTotalBullets(getTotalBullets() - bulletsToReload);
    }
}