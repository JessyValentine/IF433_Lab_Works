package oop_00000108930_JessyValentine.week09

fun main(){
    val tradeHistory = listOf(
        TradeLog("BTC/USDT", "LONG", 20, 5.0, "OPEN"),
        TradeLog("ETH/USDT", "SHORT", 7, 10.0, "CLOSED"),
        TradeLog("BTC/USDT", "LONG", 80, -4.0, "CLOSED"),
        TradeLog("ETH/USDT", "LONG", 10, 5.0, "OPEN"),
        TradeLog("SOL/USDT", "SHORT", 8, -7.0, "CLOSED"),
        TradeLog("XRP/USDT", "SHORT", 6, -9.0, "OPEN")
    )

    val closedTrades = tradeHistory.filter{it.status == "CLOSED"}
    val winningTrades = closedTrades.filter{it.roe > 0}
    val losingTrades = closedTrades.filter{it.roe <= 0}

    val topPerformersString = winningTrades.sortedByDescending { it.roe }.map{"WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"}
    val worstPerformersString = losingTrades.sortedBy{it.roe}.map{"LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)"}

    val uniquePairs = tradeHistory.map{it.pair}.toSet()

    println("=== CRYPTO TRADING DASHBOARD ===")
    topPerformersString.forEach{println(it)}
}