package HomeWork.GameShooter;

import HomeWork.GameShooter.Weapon.*;

class Player {
	private Weapon[] weaponSlots;

	
	public Player() {
		weaponSlots = new Weapon[] {
				new WaterGun(),
				new Slingshot(),
				new Pistol(),
				new AutomaticRifle(),
				new RPG(),
				new BigFuckingGun()
		};
	}
	
	public int getSlotsCount() {
		return weaponSlots.length;
	}
	
	public void shotWithWeapon(int slot)  {
		
		if (0>=slot || slot>weaponSlots.length)
			throw new IllegalArgumentException("Вы ввели некорректный слот!");
		
		Weapon weapon = weaponSlots[slot-1];
		weapon.shot();
	}
}