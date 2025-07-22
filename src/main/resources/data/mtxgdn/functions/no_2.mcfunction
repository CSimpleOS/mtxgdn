scoreboard players set #event2_active global 1
scoreboard players set #event2_timer global 1200
execute if score #event2_active global matches 1 run {
    scoreboard players remove #event2_timer global 1
    execute as @a run {
        data modify entity @s Inventory[{id:"minecraft:stone"}].id set value "minecraft:diamond_block"
        data modify entity @s Inventory[{id:"minecraft:cobblestone"}].id set value "minecraft:diamond_block"
    }
    execute if score #event2_timer global matches 0 run {
        scoreboard players set #event2_active global 0
    }
}