package Task10_Polymorphism.homeWork;

import Task10_Polymorphism.homeWork.Weapon.*;

public class Player {
    public Weapon[] getWeaponSlots() {
        return weaponSlots;
    }

    public void setWeaponSlots(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;
    }

    public Player(Weapon[] weaponSlots) {
        this.weaponSlots = weaponSlots;

    }

    private Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[]{new Pistol(), new MachineGun(), new RPG(), new Slingshot(), new WaterGun()};
    }

    public void shotWithWeapon(int slot) {
        if (slot >= weaponSlots.length) {
            throw new IllegalArgumentException();
        }
        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }

    public int getSlotCount() {
        return weaponSlots.length;
    }
}
