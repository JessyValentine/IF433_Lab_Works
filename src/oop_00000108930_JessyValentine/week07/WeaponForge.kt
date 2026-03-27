package oop_00000108930_JessyValentine.week07

class Weapon private constructor(val item: GameItem, val durability: Int) {
    companion object {
        fun forgeStarterSword(): Weapon{
            return Weapon(GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON), 50)
        }
        fun forgeEpicSword(): Weapon{
            return Weapon(GameItem("Frostner", 100, ItemRarity.EPIC), 100)
        }
    }
}