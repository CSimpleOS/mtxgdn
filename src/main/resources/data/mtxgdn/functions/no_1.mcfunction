say "触发事件，id:1"
scoreboard objectives add random dummy
execute store result score @s random run random 1 64
give @s minecraft:diamond ^@s^random