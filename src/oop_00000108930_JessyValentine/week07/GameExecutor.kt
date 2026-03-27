package oop_00000108930_JessyValentine.week07

fun processEvent(event: BattleState){
    val message = when(event){
        is BattleState.MonsterEncounter -> "Monster Encounter ${event.monsterName}"
        is BattleState.GameOver -> "Game over: ${event.reason}"
        is BattleState.LootDropped -> "Loot Droppped ${event.item.name} damage ${event.item.damage} ${event.item.rarity}"
        BattleState.SafeZone -> "Bro selamat"
    }
    println(message)
}