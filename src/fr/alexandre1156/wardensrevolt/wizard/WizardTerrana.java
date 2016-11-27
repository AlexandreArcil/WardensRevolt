package fr.alexandre1156.wardensrevolt.wizard;

import org.bukkit.craftbukkit.v1_11_R1.entity.CraftPlayer;

import fr.alexandre1156.wardensrevolt.event.custom.ItemCooldownFinishEvent;
import fr.alexandre1156.wardensrevolt.utils.WizardUtils.WizardType;

public class WizardTerrana extends Wizard{

	public WizardTerrana(CraftPlayer cp) {
		super(cp, WizardType.TERRANA);
	}

	@Override
	public void consumneKitItem(int itemPos) {
		
	}

	@Override
	public void giveKitItems() {
		
	}

	@Override
	protected void onItemCooldownFinish(ItemCooldownFinishEvent e) {
		
	}

	@Override
	protected void useFirstSpell() {
		
	}

	@Override
	protected void useSecondSpell() {
		
	}

	@Override
	protected void useThirdSpell() {
		
	}

}
