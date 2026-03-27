package oop_00000108930_JessyValentine.week07

fun main(){
    GameManager.startGame()
    GameManager.startGame()

    println("\nLegendary Item Drop Chance: ${ItemRarity.LEGENDARY.dropChance}")
    val wep = Weapon.forgeStarterSword()

    println("\n=== NEW STARTER WEAPON ===")
    println("Weapon name: ${wep.item.name}")
    println("Damage: ${wep.item.damage}")
    println("Rarity: ${wep.item.rarity}")
    println("Durability: ${wep.durability}\n")

    val wep2 = wep.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(wep2))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}